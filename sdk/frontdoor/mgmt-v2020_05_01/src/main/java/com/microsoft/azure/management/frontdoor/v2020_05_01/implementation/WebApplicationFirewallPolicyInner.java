/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.frontdoor.v2020_05_01.implementation;

import com.microsoft.azure.management.frontdoor.v2020_05_01.PolicySettings;
import com.microsoft.azure.management.frontdoor.v2020_05_01.CustomRuleList;
import com.microsoft.azure.management.frontdoor.v2020_05_01.ManagedRuleSetList;
import java.util.List;
import com.microsoft.azure.management.frontdoor.v2020_05_01.FrontendEndpointLink;
import com.microsoft.azure.management.frontdoor.v2020_05_01.RoutingRuleLink;
import com.microsoft.azure.management.frontdoor.v2020_05_01.PolicyResourceState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Defines web application firewall policy.
 */
@JsonFlatten
@SkipParentValidation
public class WebApplicationFirewallPolicyInner extends Resource {
    /**
     * Describes settings for the policy.
     */
    @JsonProperty(value = "properties.policySettings")
    private PolicySettings policySettings;

    /**
     * Describes custom rules inside the policy.
     */
    @JsonProperty(value = "properties.customRules")
    private CustomRuleList customRules;

    /**
     * Describes managed rules inside the policy.
     */
    @JsonProperty(value = "properties.managedRules")
    private ManagedRuleSetList managedRules;

    /**
     * Describes Frontend Endpoints associated with this Web Application
     * Firewall policy.
     */
    @JsonProperty(value = "properties.frontendEndpointLinks", access = JsonProperty.Access.WRITE_ONLY)
    private List<FrontendEndpointLink> frontendEndpointLinks;

    /**
     * Describes Routing Rules associated with this Web Application Firewall
     * policy.
     */
    @JsonProperty(value = "properties.routingRuleLinks", access = JsonProperty.Access.WRITE_ONLY)
    private List<RoutingRuleLink> routingRuleLinks;

    /**
     * Provisioning state of the policy.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Resource status of the policy.
     * Possible values include: 'Creating', 'Enabling', 'Enabled', 'Disabling',
     * 'Disabled', 'Deleting'.
     */
    @JsonProperty(value = "properties.resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private PolicyResourceState resourceState;

    /**
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get describes settings for the policy.
     *
     * @return the policySettings value
     */
    public PolicySettings policySettings() {
        return this.policySettings;
    }

    /**
     * Set describes settings for the policy.
     *
     * @param policySettings the policySettings value to set
     * @return the WebApplicationFirewallPolicyInner object itself.
     */
    public WebApplicationFirewallPolicyInner withPolicySettings(PolicySettings policySettings) {
        this.policySettings = policySettings;
        return this;
    }

    /**
     * Get describes custom rules inside the policy.
     *
     * @return the customRules value
     */
    public CustomRuleList customRules() {
        return this.customRules;
    }

    /**
     * Set describes custom rules inside the policy.
     *
     * @param customRules the customRules value to set
     * @return the WebApplicationFirewallPolicyInner object itself.
     */
    public WebApplicationFirewallPolicyInner withCustomRules(CustomRuleList customRules) {
        this.customRules = customRules;
        return this;
    }

    /**
     * Get describes managed rules inside the policy.
     *
     * @return the managedRules value
     */
    public ManagedRuleSetList managedRules() {
        return this.managedRules;
    }

    /**
     * Set describes managed rules inside the policy.
     *
     * @param managedRules the managedRules value to set
     * @return the WebApplicationFirewallPolicyInner object itself.
     */
    public WebApplicationFirewallPolicyInner withManagedRules(ManagedRuleSetList managedRules) {
        this.managedRules = managedRules;
        return this;
    }

    /**
     * Get describes Frontend Endpoints associated with this Web Application Firewall policy.
     *
     * @return the frontendEndpointLinks value
     */
    public List<FrontendEndpointLink> frontendEndpointLinks() {
        return this.frontendEndpointLinks;
    }

    /**
     * Get describes Routing Rules associated with this Web Application Firewall policy.
     *
     * @return the routingRuleLinks value
     */
    public List<RoutingRuleLink> routingRuleLinks() {
        return this.routingRuleLinks;
    }

    /**
     * Get provisioning state of the policy.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get possible values include: 'Creating', 'Enabling', 'Enabled', 'Disabling', 'Disabled', 'Deleting'.
     *
     * @return the resourceState value
     */
    public PolicyResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * Get gets a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set gets a unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set
     * @return the WebApplicationFirewallPolicyInner object itself.
     */
    public WebApplicationFirewallPolicyInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

}
