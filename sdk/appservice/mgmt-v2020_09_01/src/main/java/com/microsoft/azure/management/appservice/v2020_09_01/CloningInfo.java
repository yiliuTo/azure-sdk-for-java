/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import java.util.UUID;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information needed for cloning operation.
 */
public class CloningInfo {
    /**
     * Correlation ID of cloning operation. This ID ties multiple cloning
     * operations
     * together to use the same snapshot.
     */
    @JsonProperty(value = "correlationId")
    private UUID correlationId;

    /**
     * &lt;code&gt;true&lt;/code&gt; to overwrite destination app; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "overwrite")
    private Boolean overwrite;

    /**
     * &lt;code&gt;true&lt;/code&gt; to clone custom hostnames from source app;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "cloneCustomHostNames")
    private Boolean cloneCustomHostNames;

    /**
     * &lt;code&gt;true&lt;/code&gt; to clone source control from source app;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "cloneSourceControl")
    private Boolean cloneSourceControl;

    /**
     * ARM resource ID of the source app. App resource ID is of the form
     * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName}
     * for production slots and
     * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName}/slots/{slotName}
     * for other slots.
     */
    @JsonProperty(value = "sourceWebAppId", required = true)
    private String sourceWebAppId;

    /**
     * Location of source app ex: West US or North Europe.
     */
    @JsonProperty(value = "sourceWebAppLocation")
    private String sourceWebAppLocation;

    /**
     * App Service Environment.
     */
    @JsonProperty(value = "hostingEnvironment")
    private String hostingEnvironment;

    /**
     * Application setting overrides for cloned app. If specified, these
     * settings override the settings cloned
     * from source app. Otherwise, application settings from source app are
     * retained.
     */
    @JsonProperty(value = "appSettingsOverrides")
    private Map<String, String> appSettingsOverrides;

    /**
     * &lt;code&gt;true&lt;/code&gt; to configure load balancing for source and
     * destination app.
     */
    @JsonProperty(value = "configureLoadBalancing")
    private Boolean configureLoadBalancing;

    /**
     * ARM resource ID of the Traffic Manager profile to use, if it exists.
     * Traffic Manager resource ID is of the form
     * /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/trafficManagerProfiles/{profileName}.
     */
    @JsonProperty(value = "trafficManagerProfileId")
    private String trafficManagerProfileId;

    /**
     * Name of Traffic Manager profile to create. This is only needed if
     * Traffic Manager profile does not already exist.
     */
    @JsonProperty(value = "trafficManagerProfileName")
    private String trafficManagerProfileName;

    /**
     * Get correlation ID of cloning operation. This ID ties multiple cloning operations
     together to use the same snapshot.
     *
     * @return the correlationId value
     */
    public UUID correlationId() {
        return this.correlationId;
    }

    /**
     * Set correlation ID of cloning operation. This ID ties multiple cloning operations
     together to use the same snapshot.
     *
     * @param correlationId the correlationId value to set
     * @return the CloningInfo object itself.
     */
    public CloningInfo withCorrelationId(UUID correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; to overwrite destination app; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the overwrite value
     */
    public Boolean overwrite() {
        return this.overwrite;
    }

    /**
     * Set &lt;code&gt;true&lt;/code&gt; to overwrite destination app; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param overwrite the overwrite value to set
     * @return the CloningInfo object itself.
     */
    public CloningInfo withOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; to clone custom hostnames from source app; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the cloneCustomHostNames value
     */
    public Boolean cloneCustomHostNames() {
        return this.cloneCustomHostNames;
    }

    /**
     * Set &lt;code&gt;true&lt;/code&gt; to clone custom hostnames from source app; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param cloneCustomHostNames the cloneCustomHostNames value to set
     * @return the CloningInfo object itself.
     */
    public CloningInfo withCloneCustomHostNames(Boolean cloneCustomHostNames) {
        this.cloneCustomHostNames = cloneCustomHostNames;
        return this;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; to clone source control from source app; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the cloneSourceControl value
     */
    public Boolean cloneSourceControl() {
        return this.cloneSourceControl;
    }

    /**
     * Set &lt;code&gt;true&lt;/code&gt; to clone source control from source app; otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @param cloneSourceControl the cloneSourceControl value to set
     * @return the CloningInfo object itself.
     */
    public CloningInfo withCloneSourceControl(Boolean cloneSourceControl) {
        this.cloneSourceControl = cloneSourceControl;
        return this;
    }

    /**
     * Get aRM resource ID of the source app. App resource ID is of the form
     /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName} for production slots and
     /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName}/slots/{slotName} for other slots.
     *
     * @return the sourceWebAppId value
     */
    public String sourceWebAppId() {
        return this.sourceWebAppId;
    }

    /**
     * Set aRM resource ID of the source app. App resource ID is of the form
     /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName} for production slots and
     /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{siteName}/slots/{slotName} for other slots.
     *
     * @param sourceWebAppId the sourceWebAppId value to set
     * @return the CloningInfo object itself.
     */
    public CloningInfo withSourceWebAppId(String sourceWebAppId) {
        this.sourceWebAppId = sourceWebAppId;
        return this;
    }

    /**
     * Get location of source app ex: West US or North Europe.
     *
     * @return the sourceWebAppLocation value
     */
    public String sourceWebAppLocation() {
        return this.sourceWebAppLocation;
    }

    /**
     * Set location of source app ex: West US or North Europe.
     *
     * @param sourceWebAppLocation the sourceWebAppLocation value to set
     * @return the CloningInfo object itself.
     */
    public CloningInfo withSourceWebAppLocation(String sourceWebAppLocation) {
        this.sourceWebAppLocation = sourceWebAppLocation;
        return this;
    }

    /**
     * Get app Service Environment.
     *
     * @return the hostingEnvironment value
     */
    public String hostingEnvironment() {
        return this.hostingEnvironment;
    }

    /**
     * Set app Service Environment.
     *
     * @param hostingEnvironment the hostingEnvironment value to set
     * @return the CloningInfo object itself.
     */
    public CloningInfo withHostingEnvironment(String hostingEnvironment) {
        this.hostingEnvironment = hostingEnvironment;
        return this;
    }

    /**
     * Get application setting overrides for cloned app. If specified, these settings override the settings cloned
     from source app. Otherwise, application settings from source app are retained.
     *
     * @return the appSettingsOverrides value
     */
    public Map<String, String> appSettingsOverrides() {
        return this.appSettingsOverrides;
    }

    /**
     * Set application setting overrides for cloned app. If specified, these settings override the settings cloned
     from source app. Otherwise, application settings from source app are retained.
     *
     * @param appSettingsOverrides the appSettingsOverrides value to set
     * @return the CloningInfo object itself.
     */
    public CloningInfo withAppSettingsOverrides(Map<String, String> appSettingsOverrides) {
        this.appSettingsOverrides = appSettingsOverrides;
        return this;
    }

    /**
     * Get &lt;code&gt;true&lt;/code&gt; to configure load balancing for source and destination app.
     *
     * @return the configureLoadBalancing value
     */
    public Boolean configureLoadBalancing() {
        return this.configureLoadBalancing;
    }

    /**
     * Set &lt;code&gt;true&lt;/code&gt; to configure load balancing for source and destination app.
     *
     * @param configureLoadBalancing the configureLoadBalancing value to set
     * @return the CloningInfo object itself.
     */
    public CloningInfo withConfigureLoadBalancing(Boolean configureLoadBalancing) {
        this.configureLoadBalancing = configureLoadBalancing;
        return this;
    }

    /**
     * Get aRM resource ID of the Traffic Manager profile to use, if it exists. Traffic Manager resource ID is of the form
     /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/trafficManagerProfiles/{profileName}.
     *
     * @return the trafficManagerProfileId value
     */
    public String trafficManagerProfileId() {
        return this.trafficManagerProfileId;
    }

    /**
     * Set aRM resource ID of the Traffic Manager profile to use, if it exists. Traffic Manager resource ID is of the form
     /subscriptions/{subId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/trafficManagerProfiles/{profileName}.
     *
     * @param trafficManagerProfileId the trafficManagerProfileId value to set
     * @return the CloningInfo object itself.
     */
    public CloningInfo withTrafficManagerProfileId(String trafficManagerProfileId) {
        this.trafficManagerProfileId = trafficManagerProfileId;
        return this;
    }

    /**
     * Get name of Traffic Manager profile to create. This is only needed if Traffic Manager profile does not already exist.
     *
     * @return the trafficManagerProfileName value
     */
    public String trafficManagerProfileName() {
        return this.trafficManagerProfileName;
    }

    /**
     * Set name of Traffic Manager profile to create. This is only needed if Traffic Manager profile does not already exist.
     *
     * @param trafficManagerProfileName the trafficManagerProfileName value to set
     * @return the CloningInfo object itself.
     */
    public CloningInfo withTrafficManagerProfileName(String trafficManagerProfileName) {
        this.trafficManagerProfileName = trafficManagerProfileName;
        return this;
    }

}
