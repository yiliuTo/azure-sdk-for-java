/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_06_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Full endpoint url of an event subscription.
 */
public class EventSubscriptionFullUrlInner {
    /**
     * The URL that represents the endpoint of the destination of an event
     * subscription.
     */
    @JsonProperty(value = "endpointUrl")
    private String endpointUrl;

    /**
     * Get the URL that represents the endpoint of the destination of an event subscription.
     *
     * @return the endpointUrl value
     */
    public String endpointUrl() {
        return this.endpointUrl;
    }

    /**
     * Set the URL that represents the endpoint of the destination of an event subscription.
     *
     * @param endpointUrl the endpointUrl value to set
     * @return the EventSubscriptionFullUrlInner object itself.
     */
    public EventSubscriptionFullUrlInner withEndpointUrl(String endpointUrl) {
        this.endpointUrl = endpointUrl;
        return this;
    }

}
