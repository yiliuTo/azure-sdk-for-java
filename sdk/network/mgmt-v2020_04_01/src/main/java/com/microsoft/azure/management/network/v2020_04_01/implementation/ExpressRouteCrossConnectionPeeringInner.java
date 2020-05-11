/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01.implementation;

import com.microsoft.azure.management.network.v2020_04_01.ExpressRoutePeeringType;
import com.microsoft.azure.management.network.v2020_04_01.ExpressRoutePeeringState;
import com.microsoft.azure.management.network.v2020_04_01.ExpressRouteCircuitPeeringConfig;
import com.microsoft.azure.management.network.v2020_04_01.ProvisioningState;
import com.microsoft.azure.management.network.v2020_04_01.Ipv6ExpressRouteCircuitPeeringConfig;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * Peering in an ExpressRoute Cross Connection resource.
 */
@JsonFlatten
public class ExpressRouteCrossConnectionPeeringInner extends SubResource {
    /**
     * The peering type. Possible values include: 'AzurePublicPeering',
     * 'AzurePrivatePeering', 'MicrosoftPeering'.
     */
    @JsonProperty(value = "properties.peeringType")
    private ExpressRoutePeeringType peeringType;

    /**
     * The peering state. Possible values include: 'Disabled', 'Enabled'.
     */
    @JsonProperty(value = "properties.state")
    private ExpressRoutePeeringState state;

    /**
     * The Azure ASN.
     */
    @JsonProperty(value = "properties.azureASN", access = JsonProperty.Access.WRITE_ONLY)
    private Integer azureASN;

    /**
     * The peer ASN.
     */
    @JsonProperty(value = "properties.peerASN")
    private Long peerASN;

    /**
     * The primary address prefix.
     */
    @JsonProperty(value = "properties.primaryPeerAddressPrefix")
    private String primaryPeerAddressPrefix;

    /**
     * The secondary address prefix.
     */
    @JsonProperty(value = "properties.secondaryPeerAddressPrefix")
    private String secondaryPeerAddressPrefix;

    /**
     * The primary port.
     */
    @JsonProperty(value = "properties.primaryAzurePort", access = JsonProperty.Access.WRITE_ONLY)
    private String primaryAzurePort;

    /**
     * The secondary port.
     */
    @JsonProperty(value = "properties.secondaryAzurePort", access = JsonProperty.Access.WRITE_ONLY)
    private String secondaryAzurePort;

    /**
     * The shared key.
     */
    @JsonProperty(value = "properties.sharedKey")
    private String sharedKey;

    /**
     * The VLAN ID.
     */
    @JsonProperty(value = "properties.vlanId")
    private Integer vlanId;

    /**
     * The Microsoft peering configuration.
     */
    @JsonProperty(value = "properties.microsoftPeeringConfig")
    private ExpressRouteCircuitPeeringConfig microsoftPeeringConfig;

    /**
     * The provisioning state of the express route cross connection peering
     * resource. Possible values include: 'Succeeded', 'Updating', 'Deleting',
     * 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The GatewayManager Etag.
     */
    @JsonProperty(value = "properties.gatewayManagerEtag")
    private String gatewayManagerEtag;

    /**
     * Who was the last to modify the peering.
     */
    @JsonProperty(value = "properties.lastModifiedBy", access = JsonProperty.Access.WRITE_ONLY)
    private String lastModifiedBy;

    /**
     * The IPv6 peering configuration.
     */
    @JsonProperty(value = "properties.ipv6PeeringConfig")
    private Ipv6ExpressRouteCircuitPeeringConfig ipv6PeeringConfig;

    /**
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get the peering type. Possible values include: 'AzurePublicPeering', 'AzurePrivatePeering', 'MicrosoftPeering'.
     *
     * @return the peeringType value
     */
    public ExpressRoutePeeringType peeringType() {
        return this.peeringType;
    }

    /**
     * Set the peering type. Possible values include: 'AzurePublicPeering', 'AzurePrivatePeering', 'MicrosoftPeering'.
     *
     * @param peeringType the peeringType value to set
     * @return the ExpressRouteCrossConnectionPeeringInner object itself.
     */
    public ExpressRouteCrossConnectionPeeringInner withPeeringType(ExpressRoutePeeringType peeringType) {
        this.peeringType = peeringType;
        return this;
    }

    /**
     * Get the peering state. Possible values include: 'Disabled', 'Enabled'.
     *
     * @return the state value
     */
    public ExpressRoutePeeringState state() {
        return this.state;
    }

    /**
     * Set the peering state. Possible values include: 'Disabled', 'Enabled'.
     *
     * @param state the state value to set
     * @return the ExpressRouteCrossConnectionPeeringInner object itself.
     */
    public ExpressRouteCrossConnectionPeeringInner withState(ExpressRoutePeeringState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the Azure ASN.
     *
     * @return the azureASN value
     */
    public Integer azureASN() {
        return this.azureASN;
    }

    /**
     * Get the peer ASN.
     *
     * @return the peerASN value
     */
    public Long peerASN() {
        return this.peerASN;
    }

    /**
     * Set the peer ASN.
     *
     * @param peerASN the peerASN value to set
     * @return the ExpressRouteCrossConnectionPeeringInner object itself.
     */
    public ExpressRouteCrossConnectionPeeringInner withPeerASN(Long peerASN) {
        this.peerASN = peerASN;
        return this;
    }

    /**
     * Get the primary address prefix.
     *
     * @return the primaryPeerAddressPrefix value
     */
    public String primaryPeerAddressPrefix() {
        return this.primaryPeerAddressPrefix;
    }

    /**
     * Set the primary address prefix.
     *
     * @param primaryPeerAddressPrefix the primaryPeerAddressPrefix value to set
     * @return the ExpressRouteCrossConnectionPeeringInner object itself.
     */
    public ExpressRouteCrossConnectionPeeringInner withPrimaryPeerAddressPrefix(String primaryPeerAddressPrefix) {
        this.primaryPeerAddressPrefix = primaryPeerAddressPrefix;
        return this;
    }

    /**
     * Get the secondary address prefix.
     *
     * @return the secondaryPeerAddressPrefix value
     */
    public String secondaryPeerAddressPrefix() {
        return this.secondaryPeerAddressPrefix;
    }

    /**
     * Set the secondary address prefix.
     *
     * @param secondaryPeerAddressPrefix the secondaryPeerAddressPrefix value to set
     * @return the ExpressRouteCrossConnectionPeeringInner object itself.
     */
    public ExpressRouteCrossConnectionPeeringInner withSecondaryPeerAddressPrefix(String secondaryPeerAddressPrefix) {
        this.secondaryPeerAddressPrefix = secondaryPeerAddressPrefix;
        return this;
    }

    /**
     * Get the primary port.
     *
     * @return the primaryAzurePort value
     */
    public String primaryAzurePort() {
        return this.primaryAzurePort;
    }

    /**
     * Get the secondary port.
     *
     * @return the secondaryAzurePort value
     */
    public String secondaryAzurePort() {
        return this.secondaryAzurePort;
    }

    /**
     * Get the shared key.
     *
     * @return the sharedKey value
     */
    public String sharedKey() {
        return this.sharedKey;
    }

    /**
     * Set the shared key.
     *
     * @param sharedKey the sharedKey value to set
     * @return the ExpressRouteCrossConnectionPeeringInner object itself.
     */
    public ExpressRouteCrossConnectionPeeringInner withSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
        return this;
    }

    /**
     * Get the VLAN ID.
     *
     * @return the vlanId value
     */
    public Integer vlanId() {
        return this.vlanId;
    }

    /**
     * Set the VLAN ID.
     *
     * @param vlanId the vlanId value to set
     * @return the ExpressRouteCrossConnectionPeeringInner object itself.
     */
    public ExpressRouteCrossConnectionPeeringInner withVlanId(Integer vlanId) {
        this.vlanId = vlanId;
        return this;
    }

    /**
     * Get the Microsoft peering configuration.
     *
     * @return the microsoftPeeringConfig value
     */
    public ExpressRouteCircuitPeeringConfig microsoftPeeringConfig() {
        return this.microsoftPeeringConfig;
    }

    /**
     * Set the Microsoft peering configuration.
     *
     * @param microsoftPeeringConfig the microsoftPeeringConfig value to set
     * @return the ExpressRouteCrossConnectionPeeringInner object itself.
     */
    public ExpressRouteCrossConnectionPeeringInner withMicrosoftPeeringConfig(ExpressRouteCircuitPeeringConfig microsoftPeeringConfig) {
        this.microsoftPeeringConfig = microsoftPeeringConfig;
        return this;
    }

    /**
     * Get the provisioning state of the express route cross connection peering resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the GatewayManager Etag.
     *
     * @return the gatewayManagerEtag value
     */
    public String gatewayManagerEtag() {
        return this.gatewayManagerEtag;
    }

    /**
     * Set the GatewayManager Etag.
     *
     * @param gatewayManagerEtag the gatewayManagerEtag value to set
     * @return the ExpressRouteCrossConnectionPeeringInner object itself.
     */
    public ExpressRouteCrossConnectionPeeringInner withGatewayManagerEtag(String gatewayManagerEtag) {
        this.gatewayManagerEtag = gatewayManagerEtag;
        return this;
    }

    /**
     * Get who was the last to modify the peering.
     *
     * @return the lastModifiedBy value
     */
    public String lastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * Get the IPv6 peering configuration.
     *
     * @return the ipv6PeeringConfig value
     */
    public Ipv6ExpressRouteCircuitPeeringConfig ipv6PeeringConfig() {
        return this.ipv6PeeringConfig;
    }

    /**
     * Set the IPv6 peering configuration.
     *
     * @param ipv6PeeringConfig the ipv6PeeringConfig value to set
     * @return the ExpressRouteCrossConnectionPeeringInner object itself.
     */
    public ExpressRouteCrossConnectionPeeringInner withIpv6PeeringConfig(Ipv6ExpressRouteCircuitPeeringConfig ipv6PeeringConfig) {
        this.ipv6PeeringConfig = ipv6PeeringConfig;
        return this;
    }

    /**
     * Get the name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @param name the name value to set
     * @return the ExpressRouteCrossConnectionPeeringInner object itself.
     */
    public ExpressRouteCrossConnectionPeeringInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

}
