/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhubs.v2018_01_01_preview.implementation;

import com.microsoft.azure.management.eventhubs.v2018_01_01_preview.PrivateEndpoint;
import com.microsoft.azure.management.eventhubs.v2018_01_01_preview.ConnectionState;
import com.microsoft.azure.management.eventhubs.v2018_01_01_preview.EndPointProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Properties of the PrivateEndpointConnection.
 */
@JsonFlatten
public class PrivateEndpointConnectionInner extends ProxyResource {
    /**
     * The Private Endpoint resource for this Connection.
     */
    @JsonProperty(value = "properties.privateEndpoint")
    private PrivateEndpoint privateEndpoint;

    /**
     * Details about the state of the connection.
     */
    @JsonProperty(value = "properties.privateLinkServiceConnectionState")
    private ConnectionState privateLinkServiceConnectionState;

    /**
     * Provisioning state of the Private Endpoint Connection. Possible values
     * include: 'Creating', 'Updating', 'Deleting', 'Succeeded', 'Canceled',
     * 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private EndPointProvisioningState provisioningState;

    /**
     * Get the Private Endpoint resource for this Connection.
     *
     * @return the privateEndpoint value
     */
    public PrivateEndpoint privateEndpoint() {
        return this.privateEndpoint;
    }

    /**
     * Set the Private Endpoint resource for this Connection.
     *
     * @param privateEndpoint the privateEndpoint value to set
     * @return the PrivateEndpointConnectionInner object itself.
     */
    public PrivateEndpointConnectionInner withPrivateEndpoint(PrivateEndpoint privateEndpoint) {
        this.privateEndpoint = privateEndpoint;
        return this;
    }

    /**
     * Get details about the state of the connection.
     *
     * @return the privateLinkServiceConnectionState value
     */
    public ConnectionState privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * Set details about the state of the connection.
     *
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set
     * @return the PrivateEndpointConnectionInner object itself.
     */
    public PrivateEndpointConnectionInner withPrivateLinkServiceConnectionState(ConnectionState privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        return this;
    }

    /**
     * Get provisioning state of the Private Endpoint Connection. Possible values include: 'Creating', 'Updating', 'Deleting', 'Succeeded', 'Canceled', 'Failed'.
     *
     * @return the provisioningState value
     */
    public EndPointProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set provisioning state of the Private Endpoint Connection. Possible values include: 'Creating', 'Updating', 'Deleting', 'Succeeded', 'Canceled', 'Failed'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the PrivateEndpointConnectionInner object itself.
     */
    public PrivateEndpointConnectionInner withProvisioningState(EndPointProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

}
