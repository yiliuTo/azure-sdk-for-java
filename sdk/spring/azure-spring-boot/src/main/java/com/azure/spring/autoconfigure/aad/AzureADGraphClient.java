// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.autoconfigure.aad;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.aad.msal4j.ClientCredentialFactory;
import com.microsoft.aad.msal4j.ConfidentialClientApplication;
import com.microsoft.aad.msal4j.IAuthenticationResult;
import com.microsoft.aad.msal4j.IClientCredential;
import com.microsoft.aad.msal4j.MsalServiceException;
import com.microsoft.aad.msal4j.OnBehalfOfParameters;
import com.microsoft.aad.msal4j.UserAssertion;
import com.nimbusds.oauth2.sdk.http.HTTPResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.AbstractOAuth2Token;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.naming.ServiceUnavailableException;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

import static com.azure.spring.autoconfigure.aad.Constants.DEFAULT_AUTHORITY_SET;
import static com.azure.spring.autoconfigure.aad.Constants.ROLE_PREFIX;
import static com.azure.spring.autoconfigure.aad.Scopes.AAD_GRAPH_API_URI;
import static com.azure.spring.autoconfigure.aad.Scopes.MICROSOFT_GRAPH_URI;
import static com.azure.spring.autoconfigure.aad.Scopes.OPENID_PERMISSIONS;


/**
 * Microsoft Graph client encapsulation.
 */
public class AzureADGraphClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(AzureADGraphClient.class);
    // We use "aadfeed5" as suffix when client library is ADAL, upgrade to "aadfeed6" for MSAL
    private static final String REQUEST_ID_SUFFIX = "aadfeed6";
    private static final String V2_VERSION_ENV_FLAG = "v2-graph";
    private static final String ACCESS_TOKEN = "ACCESS_TOKEN";
    private static final long ACCESSTOKEN_MIN_LIVE_TIME = 60 * 1000;

    private final ServiceEndpoints serviceEndpoints;
    private final AADAuthenticationProperties aadAuthenticationProperties;
    private final boolean graphApiVersionIsV2;

    public AzureADGraphClient(AADAuthenticationProperties aadAuthenticationProperties,
                              ServiceEndpointsProperties serviceEndpointsProps) {
        this.aadAuthenticationProperties = aadAuthenticationProperties;
        this.serviceEndpoints = serviceEndpointsProps.getServiceEndpoints(aadAuthenticationProperties.getEnvironment());
        this.graphApiVersionIsV2 = Optional.of(aadAuthenticationProperties)
                                           .map(AADAuthenticationProperties::getEnvironment)
                                           .map(environment -> environment.contains(V2_VERSION_ENV_FLAG))
                                           .orElse(false);
    }

    private String getUserMemberships(String accessToken, String urlString) throws IOException {
        URL url = new URL(urlString);
        final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        // Set the appropriate header fields in the request header.
        if (this.graphApiVersionIsV2) {
            connection.setRequestMethod(HttpMethod.GET.toString());
            connection.setRequestProperty(HttpHeaders.AUTHORIZATION, String.format("Bearer %s", accessToken));
            connection.setRequestProperty(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
            connection.setRequestProperty(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_FORM_URLENCODED_VALUE);
        } else {
            connection.setRequestMethod(HttpMethod.GET.toString());
            connection.setRequestProperty("api-version", "1.6");
            connection.setRequestProperty(HttpHeaders.AUTHORIZATION, String.format("Bearer %s", accessToken));
            connection.setRequestProperty(HttpHeaders.ACCEPT, "application/json;odata=minimalmetadata");
        }
        final String responseInJson = getResponseString(connection);
        final int responseCode = connection.getResponseCode();
        if (responseCode == HTTPResponse.SC_OK) {
            return responseInJson;
        } else {
            throw new IllegalStateException(
                "Response is not " + HTTPResponse.SC_OK + ", response json: " + responseInJson);
        }
    }

    private String getUrlStringFromODataNextLink(String odataNextLink) {
        if (this.graphApiVersionIsV2) {
            return odataNextLink;
        } else {
            String skipToken = odataNextLink.split("/memberOf\\?")[1];
            return serviceEndpoints.getAadMembershipRestUri() + "&" + skipToken;
        }
    }

    private static String getResponseString(HttpURLConnection connection) throws IOException {
        try (BufferedReader reader = new BufferedReader(
            new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8))) {
            final StringBuilder stringBuffer = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuffer.append(line);
            }
            return stringBuffer.toString();
        }
    }

    /**
     * @param graphApiToken token used to access graph api.
     * @return groups in graph api.
     * @throws IOException throw exception if get groups failed by IOException.
     */
    public Set<String> getGroups(String graphApiToken) throws IOException {
        final Set<String> groups = new LinkedHashSet<>();
        final ObjectMapper objectMapper = JacksonObjectMapperFactory.getInstance();
        String aadMembershipRestUri = serviceEndpoints.getAadMembershipRestUri();
        while (aadMembershipRestUri != null) {
            String membershipsJson = getUserMemberships(graphApiToken, aadMembershipRestUri);
            Memberships memberships = objectMapper.readValue(membershipsJson, Memberships.class);
            memberships.getValue()
                       .stream()
                       .filter(this::isGroupObject)
                       .map(Membership::getDisplayName)
                       .forEach(groups::add);
            aadMembershipRestUri = Optional.of(memberships)
                                           .map(Memberships::getOdataNextLink)
                                           .map(this::getUrlStringFromODataNextLink)
                                           .orElse(null);
        }
        return groups;
    }

    private boolean isGroupObject(final Membership membership) {
        return membership.getObjectType().equals(aadAuthenticationProperties.getUserGroup().getValue());
    }

    /**
     * @param graphApiToken token of graph api.
     * @return set of SimpleGrantedAuthority
     * @throws IOException throw exception if get groups failed by IOException.
     */
    public Set<SimpleGrantedAuthority> getGrantedAuthorities(String graphApiToken) throws IOException {
        return toGrantedAuthoritySet(getGroups(graphApiToken));
    }

    public Set<SimpleGrantedAuthority> toGrantedAuthoritySet(final Set<String> groups) {
        Set<SimpleGrantedAuthority> grantedAuthoritySet =
            groups.stream()
                  .filter(aadAuthenticationProperties::isAllowedGroup)
                  .map(group -> new SimpleGrantedAuthority(ROLE_PREFIX + group))
                  .collect(Collectors.toSet());
        return Optional.of(grantedAuthoritySet)
                       .filter(g -> !g.isEmpty())
                       .orElse(DEFAULT_AUTHORITY_SET);
    }

    private static String getCorrelationId() {
        final String uuid = UUID.randomUUID().toString();
        return uuid.substring(0, uuid.length() - REQUEST_ID_SUFFIX.length()) + REQUEST_ID_SUFFIX;
    }

    /**
     * Acquire AccessToken token for a web-hosted resource with expected permissions. Only work for session supported
     * web service.
     *
     * @param applicationIdUri The Application ID URI of web-hosted resource, e.g., https://graph.microsoft.com for
     * Microsoft Graph API.
     * @param permissions The expected permissions of resources.
     * @return AccessToken
     * @throws ServiceUnavailableException If fail to acquire the token.
     */
    public AccessToken getAccessToken(String applicationIdUri,
                                      Set<String> permissions) throws ServiceUnavailableException {
        AccessToken accessToken = loadAccessTokenFromSession(applicationIdUri);
        Set<String> uniformedPermissions = permissions.stream()
                                                      .map(String::trim)
                                                      .map(s -> s.toLowerCase(Locale.ENGLISH))
                                                      .filter(s -> !s.isEmpty())
                                                      .collect(Collectors.toSet());
        if (accessToken.permissions.containsAll(uniformedPermissions)) {
            return accessToken;
        } else {
            // TODO: incremental consent.
            String idToken = getIdTokenFromSecurityContext();
            return getAccessToken(idToken, applicationIdUri, uniformedPermissions);
        }
    }

    private String getIdTokenFromSecurityContext() {
        return Optional.of(SecurityContextHolder.getContext())
                       .map(SecurityContext::getAuthentication)
                       .map(Authentication::getPrincipal)
                       .map(p -> (OidcUser) p)
                       .map(OidcUser::getIdToken)
                       .map(AbstractOAuth2Token::getTokenValue)
                       .orElse(null);
    }

    private Set<String> toScopeSet(String applicationIdUri, Set<String> permissions) {
        return permissions.stream()
                          .map(scope -> OPENID_PERMISSIONS.contains(scope) ? scope : applicationIdUri + scope)
                          .collect(Collectors.toSet());
    }

    public String getGraphApiUri() {
        boolean isGraphApiVersionIsV2 = Optional.of(aadAuthenticationProperties)
                                                .map(AADAuthenticationProperties::getEnvironment)
                                                .map(environment -> environment.contains("v2-graph"))
                                                .orElse(false);
        return isGraphApiVersionIsV2 ? MICROSOFT_GRAPH_URI : AAD_GRAPH_API_URI;
    }

    /**
     * Acquire access token for a web-hosted resource. Only work for session supported web service.
     *
     * @param idToken The token used to perform an get token request.
     * @param applicationIdUri The Application ID URI of web-hosted resource, e.g., https://graph.microsoft.com for
     * Microsoft Graph API.
     * @param permissions The permissions of resources to be authorized with, need to be formatted as lowercase.
     * @return The access token for Graph service.
     * @throws ServiceUnavailableException If fail to acquire the token.
     * @throws MsalServiceException If {@link MsalServiceException} has occurred.
     */
    public AccessToken getAccessToken(String idToken,
                                      String applicationIdUri,
                                      Set<String> permissions) throws ServiceUnavailableException {
        IAuthenticationResult result = getIAuthenticationResult(idToken, applicationIdUri, permissions);
        Set<String> uniformedPermissions =
            Arrays.stream(result.scopes().toLowerCase(Locale.ENGLISH).split(" "))
                  .map(s -> s.startsWith(applicationIdUri) ? s.split(applicationIdUri)[1] : s)
                  .collect(Collectors.toSet());
        return new AccessToken(
            applicationIdUri,
            uniformedPermissions,
            result.expiresOnDate(),
            result.accessToken()
        );
    }

    /**
     * Acquire IAuthenticationResult for a web-hosted resource. Only work for session supported web service.
     *
     * @param idToken The token used to perform an get token request.
     * @param applicationIdUri The Application ID URI of web-hosted resource, e.g., https://graph.microsoft.com for
     * Microsoft Graph API.
     * @param permissions The permissions of resources to be authorized with, need to be formatted as lowercase.
     * @return The access token for Graph service.
     * @throws ServiceUnavailableException If fail to acquire the token.
     * @throws MsalServiceException If {@link MsalServiceException} has occurred.
     */
    public IAuthenticationResult getIAuthenticationResult(String idToken,
                                                          String applicationIdUri,
                                                          Set<String> permissions) throws ServiceUnavailableException {
        final IClientCredential clientCredential =
            ClientCredentialFactory.createFromSecret(aadAuthenticationProperties.getClientSecret());
        final UserAssertion assertion = new UserAssertion(idToken);
        IAuthenticationResult result = null;
        try {
            final ConfidentialClientApplication application = ConfidentialClientApplication
                .builder(aadAuthenticationProperties.getClientId(), clientCredential)
                .authority(serviceEndpoints.getAadSigninUri() + aadAuthenticationProperties.getTenantId() + "/")
                .correlationId(getCorrelationId())
                .build();
            Set<String> scopes = toScopeSet(applicationIdUri, permissions);
            final OnBehalfOfParameters onBehalfOfParameters = OnBehalfOfParameters.builder(scopes, assertion).build();
            result = application.acquireToken(onBehalfOfParameters).get();
        } catch (ExecutionException | InterruptedException | MalformedURLException e) {
            // Handle conditional access policy
            final Throwable cause = e.getCause();
            if (cause instanceof MsalServiceException) {
                final MsalServiceException exception = (MsalServiceException) cause;
                if (exception.claims() != null && !exception.claims().isEmpty()) {
                    throw exception;
                }
            }
            LOGGER.error("acquire on behalf of token error", e);
        }
        if (result == null) {
            throw new ServiceUnavailableException("unable to acquire on-behalf-of token for client "
                + aadAuthenticationProperties.getClientId());
        }
        return result;
    }

    private AccessToken loadAccessTokenFromSession(String applicationIdUri) {
        return (AccessToken) Optional.of(RequestContextHolder.currentRequestAttributes())
                                     .map(a -> (ServletRequestAttributes) a)
                                     .map(ServletRequestAttributes::getRequest)
                                     .map(HttpServletRequest::getSession)
                                     .map(s -> s.getAttribute(ACCESS_TOKEN + applicationIdUri))
                                     .orElseGet(() -> new AccessToken(applicationIdUri,
                                         new HashSet<>(),
                                         new Date(),
                                         "")
                                     );
    }

    public void saveAccessTokenToSession(AccessToken accessToken) {
        ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        attr.getRequest().getSession(false).setAttribute(accessToken.applicationIdUri, accessToken);
    }

    /**
     * AccessToken will cached in session. So AccessToken only work for session supported web service.
     */
    public class AccessToken {
        private final String applicationIdUri;
        private final Set<String> permissions;
        private String accessToken;
        private Date expiredTime;

        AccessToken(String applicationIdUri,
                    Set<String> scopes,
                    Date expiredTime,
                    String accessToken) {
            this.applicationIdUri = applicationIdUri;
            this.permissions = scopes;
            this.expiredTime = expiredTime;
            this.accessToken = accessToken;
        }

        public boolean needRefresh() {
            Date currentTime = new Date();
            return expiredTime.getTime() - currentTime.getTime() < ACCESSTOKEN_MIN_LIVE_TIME;
        }

        public void refresh() throws ServiceUnavailableException {
            String idToken = getIdTokenFromSecurityContext();
            IAuthenticationResult result = getIAuthenticationResult(idToken, applicationIdUri, permissions);
            accessToken = result.accessToken();
            expiredTime = result.expiresOnDate();
        }

        public String getAccessTokenWithRefreshAutomatically() throws ServiceUnavailableException {
            if (needRefresh()) {
                refresh();
                saveAccessTokenToSession(this);
            }
            return accessToken;
        }
    }
}
