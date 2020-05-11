/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01.implementation;

import java.util.List;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2020_04_01.ServiceEndpointPropertiesFormat;
import com.microsoft.azure.management.network.v2020_04_01.IPConfiguration;
import com.microsoft.azure.management.network.v2020_04_01.IPConfigurationProfile;
import com.microsoft.azure.management.network.v2020_04_01.Delegation;
import com.microsoft.azure.management.network.v2020_04_01.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Subnet in a virtual network resource.
 */
@JsonFlatten
public class SubnetInner extends SubResource {
    /**
     * The address prefix for the subnet.
     */
    @JsonProperty(value = "properties.addressPrefix")
    private String addressPrefix;

    /**
     * List of address prefixes for the subnet.
     */
    @JsonProperty(value = "properties.addressPrefixes")
    private List<String> addressPrefixes;

    /**
     * The reference to the NetworkSecurityGroup resource.
     */
    @JsonProperty(value = "properties.networkSecurityGroup")
    private NetworkSecurityGroupInner networkSecurityGroup;

    /**
     * The reference to the RouteTable resource.
     */
    @JsonProperty(value = "properties.routeTable")
    private RouteTableInner routeTable;

    /**
     * Nat gateway associated with this subnet.
     */
    @JsonProperty(value = "properties.natGateway")
    private SubResource natGateway;

    /**
     * An array of service endpoints.
     */
    @JsonProperty(value = "properties.serviceEndpoints")
    private List<ServiceEndpointPropertiesFormat> serviceEndpoints;

    /**
     * An array of service endpoint policies.
     */
    @JsonProperty(value = "properties.serviceEndpointPolicies")
    private List<ServiceEndpointPolicyInner> serviceEndpointPolicies;

    /**
     * An array of references to private endpoints.
     */
    @JsonProperty(value = "properties.privateEndpoints", access = JsonProperty.Access.WRITE_ONLY)
    private List<PrivateEndpointInner> privateEndpoints;

    /**
     * An array of references to the network interface IP configurations using
     * subnet.
     */
    @JsonProperty(value = "properties.ipConfigurations", access = JsonProperty.Access.WRITE_ONLY)
    private List<IPConfiguration> ipConfigurations;

    /**
     * Array of IP configuration profiles which reference this subnet.
     */
    @JsonProperty(value = "properties.ipConfigurationProfiles", access = JsonProperty.Access.WRITE_ONLY)
    private List<IPConfigurationProfile> ipConfigurationProfiles;

    /**
     * Array of IpAllocation which reference this subnet.
     */
    @JsonProperty(value = "properties.ipAllocations")
    private List<SubResource> ipAllocations;

    /**
     * An array of references to the external resources using subnet.
     */
    @JsonProperty(value = "properties.resourceNavigationLinks", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceNavigationLinkInner> resourceNavigationLinks;

    /**
     * An array of references to services injecting into this subnet.
     */
    @JsonProperty(value = "properties.serviceAssociationLinks", access = JsonProperty.Access.WRITE_ONLY)
    private List<ServiceAssociationLinkInner> serviceAssociationLinks;

    /**
     * An array of references to the delegations on the subnet.
     */
    @JsonProperty(value = "properties.delegations")
    private List<Delegation> delegations;

    /**
     * A read-only string identifying the intention of use for this subnet
     * based on delegations and other user-defined properties.
     */
    @JsonProperty(value = "properties.purpose", access = JsonProperty.Access.WRITE_ONLY)
    private String purpose;

    /**
     * The provisioning state of the subnet resource. Possible values include:
     * 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Enable or Disable apply network policies on private end point in the
     * subnet.
     */
    @JsonProperty(value = "properties.privateEndpointNetworkPolicies")
    private String privateEndpointNetworkPolicies;

    /**
     * Enable or Disable apply network policies on private link service in the
     * subnet.
     */
    @JsonProperty(value = "properties.privateLinkServiceNetworkPolicies")
    private String privateLinkServiceNetworkPolicies;

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
     * Get the address prefix for the subnet.
     *
     * @return the addressPrefix value
     */
    public String addressPrefix() {
        return this.addressPrefix;
    }

    /**
     * Set the address prefix for the subnet.
     *
     * @param addressPrefix the addressPrefix value to set
     * @return the SubnetInner object itself.
     */
    public SubnetInner withAddressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
        return this;
    }

    /**
     * Get list of address prefixes for the subnet.
     *
     * @return the addressPrefixes value
     */
    public List<String> addressPrefixes() {
        return this.addressPrefixes;
    }

    /**
     * Set list of address prefixes for the subnet.
     *
     * @param addressPrefixes the addressPrefixes value to set
     * @return the SubnetInner object itself.
     */
    public SubnetInner withAddressPrefixes(List<String> addressPrefixes) {
        this.addressPrefixes = addressPrefixes;
        return this;
    }

    /**
     * Get the reference to the NetworkSecurityGroup resource.
     *
     * @return the networkSecurityGroup value
     */
    public NetworkSecurityGroupInner networkSecurityGroup() {
        return this.networkSecurityGroup;
    }

    /**
     * Set the reference to the NetworkSecurityGroup resource.
     *
     * @param networkSecurityGroup the networkSecurityGroup value to set
     * @return the SubnetInner object itself.
     */
    public SubnetInner withNetworkSecurityGroup(NetworkSecurityGroupInner networkSecurityGroup) {
        this.networkSecurityGroup = networkSecurityGroup;
        return this;
    }

    /**
     * Get the reference to the RouteTable resource.
     *
     * @return the routeTable value
     */
    public RouteTableInner routeTable() {
        return this.routeTable;
    }

    /**
     * Set the reference to the RouteTable resource.
     *
     * @param routeTable the routeTable value to set
     * @return the SubnetInner object itself.
     */
    public SubnetInner withRouteTable(RouteTableInner routeTable) {
        this.routeTable = routeTable;
        return this;
    }

    /**
     * Get nat gateway associated with this subnet.
     *
     * @return the natGateway value
     */
    public SubResource natGateway() {
        return this.natGateway;
    }

    /**
     * Set nat gateway associated with this subnet.
     *
     * @param natGateway the natGateway value to set
     * @return the SubnetInner object itself.
     */
    public SubnetInner withNatGateway(SubResource natGateway) {
        this.natGateway = natGateway;
        return this;
    }

    /**
     * Get an array of service endpoints.
     *
     * @return the serviceEndpoints value
     */
    public List<ServiceEndpointPropertiesFormat> serviceEndpoints() {
        return this.serviceEndpoints;
    }

    /**
     * Set an array of service endpoints.
     *
     * @param serviceEndpoints the serviceEndpoints value to set
     * @return the SubnetInner object itself.
     */
    public SubnetInner withServiceEndpoints(List<ServiceEndpointPropertiesFormat> serviceEndpoints) {
        this.serviceEndpoints = serviceEndpoints;
        return this;
    }

    /**
     * Get an array of service endpoint policies.
     *
     * @return the serviceEndpointPolicies value
     */
    public List<ServiceEndpointPolicyInner> serviceEndpointPolicies() {
        return this.serviceEndpointPolicies;
    }

    /**
     * Set an array of service endpoint policies.
     *
     * @param serviceEndpointPolicies the serviceEndpointPolicies value to set
     * @return the SubnetInner object itself.
     */
    public SubnetInner withServiceEndpointPolicies(List<ServiceEndpointPolicyInner> serviceEndpointPolicies) {
        this.serviceEndpointPolicies = serviceEndpointPolicies;
        return this;
    }

    /**
     * Get an array of references to private endpoints.
     *
     * @return the privateEndpoints value
     */
    public List<PrivateEndpointInner> privateEndpoints() {
        return this.privateEndpoints;
    }

    /**
     * Get an array of references to the network interface IP configurations using subnet.
     *
     * @return the ipConfigurations value
     */
    public List<IPConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Get array of IP configuration profiles which reference this subnet.
     *
     * @return the ipConfigurationProfiles value
     */
    public List<IPConfigurationProfile> ipConfigurationProfiles() {
        return this.ipConfigurationProfiles;
    }

    /**
     * Get array of IpAllocation which reference this subnet.
     *
     * @return the ipAllocations value
     */
    public List<SubResource> ipAllocations() {
        return this.ipAllocations;
    }

    /**
     * Set array of IpAllocation which reference this subnet.
     *
     * @param ipAllocations the ipAllocations value to set
     * @return the SubnetInner object itself.
     */
    public SubnetInner withIpAllocations(List<SubResource> ipAllocations) {
        this.ipAllocations = ipAllocations;
        return this;
    }

    /**
     * Get an array of references to the external resources using subnet.
     *
     * @return the resourceNavigationLinks value
     */
    public List<ResourceNavigationLinkInner> resourceNavigationLinks() {
        return this.resourceNavigationLinks;
    }

    /**
     * Get an array of references to services injecting into this subnet.
     *
     * @return the serviceAssociationLinks value
     */
    public List<ServiceAssociationLinkInner> serviceAssociationLinks() {
        return this.serviceAssociationLinks;
    }

    /**
     * Get an array of references to the delegations on the subnet.
     *
     * @return the delegations value
     */
    public List<Delegation> delegations() {
        return this.delegations;
    }

    /**
     * Set an array of references to the delegations on the subnet.
     *
     * @param delegations the delegations value to set
     * @return the SubnetInner object itself.
     */
    public SubnetInner withDelegations(List<Delegation> delegations) {
        this.delegations = delegations;
        return this;
    }

    /**
     * Get a read-only string identifying the intention of use for this subnet based on delegations and other user-defined properties.
     *
     * @return the purpose value
     */
    public String purpose() {
        return this.purpose;
    }

    /**
     * Get the provisioning state of the subnet resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get enable or Disable apply network policies on private end point in the subnet.
     *
     * @return the privateEndpointNetworkPolicies value
     */
    public String privateEndpointNetworkPolicies() {
        return this.privateEndpointNetworkPolicies;
    }

    /**
     * Set enable or Disable apply network policies on private end point in the subnet.
     *
     * @param privateEndpointNetworkPolicies the privateEndpointNetworkPolicies value to set
     * @return the SubnetInner object itself.
     */
    public SubnetInner withPrivateEndpointNetworkPolicies(String privateEndpointNetworkPolicies) {
        this.privateEndpointNetworkPolicies = privateEndpointNetworkPolicies;
        return this;
    }

    /**
     * Get enable or Disable apply network policies on private link service in the subnet.
     *
     * @return the privateLinkServiceNetworkPolicies value
     */
    public String privateLinkServiceNetworkPolicies() {
        return this.privateLinkServiceNetworkPolicies;
    }

    /**
     * Set enable or Disable apply network policies on private link service in the subnet.
     *
     * @param privateLinkServiceNetworkPolicies the privateLinkServiceNetworkPolicies value to set
     * @return the SubnetInner object itself.
     */
    public SubnetInner withPrivateLinkServiceNetworkPolicies(String privateLinkServiceNetworkPolicies) {
        this.privateLinkServiceNetworkPolicies = privateLinkServiceNetworkPolicies;
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
     * @return the SubnetInner object itself.
     */
    public SubnetInner withName(String name) {
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
