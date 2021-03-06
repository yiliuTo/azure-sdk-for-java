/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01.implementation;

import com.microsoft.azure.management.network.v2020_08_01.ExtendedLocation;
import com.microsoft.azure.management.network.v2020_08_01.CommissionedState;
import java.util.List;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2020_08_01.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Custom IP prefix resource.
 */
@JsonFlatten
@SkipParentValidation
public class CustomIpPrefixInner extends Resource {
    /**
     * The extended location of the custom IP prefix.
     */
    @JsonProperty(value = "extendedLocation")
    private ExtendedLocation extendedLocation;

    /**
     * The prefix range in CIDR notation. Should include the start address and
     * the prefix length.
     */
    @JsonProperty(value = "properties.cidr")
    private String cidr;

    /**
     * The commissioned state of the Custom IP Prefix. Possible values include:
     * 'Provisioning', 'Provisioned', 'Commissioning', 'Commissioned',
     * 'Decommissioning', 'Deprovisioning'.
     */
    @JsonProperty(value = "properties.commissionedState")
    private CommissionedState commissionedState;

    /**
     * The list of all referenced PublicIpPrefixes.
     */
    @JsonProperty(value = "properties.publicIpPrefixes", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> publicIpPrefixes;

    /**
     * The resource GUID property of the custom IP prefix resource.
     */
    @JsonProperty(value = "properties.resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /**
     * The provisioning state of the custom IP prefix resource. Possible values
     * include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * A list of availability zones denoting the IP allocated for the resource
     * needs to come from.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the extended location of the custom IP prefix.
     *
     * @return the extendedLocation value
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extended location of the custom IP prefix.
     *
     * @param extendedLocation the extendedLocation value to set
     * @return the CustomIpPrefixInner object itself.
     */
    public CustomIpPrefixInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * Get the prefix range in CIDR notation. Should include the start address and the prefix length.
     *
     * @return the cidr value
     */
    public String cidr() {
        return this.cidr;
    }

    /**
     * Set the prefix range in CIDR notation. Should include the start address and the prefix length.
     *
     * @param cidr the cidr value to set
     * @return the CustomIpPrefixInner object itself.
     */
    public CustomIpPrefixInner withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /**
     * Get the commissioned state of the Custom IP Prefix. Possible values include: 'Provisioning', 'Provisioned', 'Commissioning', 'Commissioned', 'Decommissioning', 'Deprovisioning'.
     *
     * @return the commissionedState value
     */
    public CommissionedState commissionedState() {
        return this.commissionedState;
    }

    /**
     * Set the commissioned state of the Custom IP Prefix. Possible values include: 'Provisioning', 'Provisioned', 'Commissioning', 'Commissioned', 'Decommissioning', 'Deprovisioning'.
     *
     * @param commissionedState the commissionedState value to set
     * @return the CustomIpPrefixInner object itself.
     */
    public CustomIpPrefixInner withCommissionedState(CommissionedState commissionedState) {
        this.commissionedState = commissionedState;
        return this;
    }

    /**
     * Get the list of all referenced PublicIpPrefixes.
     *
     * @return the publicIpPrefixes value
     */
    public List<SubResource> publicIpPrefixes() {
        return this.publicIpPrefixes;
    }

    /**
     * Get the resource GUID property of the custom IP prefix resource.
     *
     * @return the resourceGuid value
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioning state of the custom IP prefix resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get a list of availability zones denoting the IP allocated for the resource needs to come from.
     *
     * @return the zones value
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set a list of availability zones denoting the IP allocated for the resource needs to come from.
     *
     * @param zones the zones value to set
     * @return the CustomIpPrefixInner object itself.
     */
    public CustomIpPrefixInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get resource ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID.
     *
     * @param id the id value to set
     * @return the CustomIpPrefixInner object itself.
     */
    public CustomIpPrefixInner withId(String id) {
        this.id = id;
        return this;
    }

}
