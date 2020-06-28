/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2019_12_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The instance view of the container group. Only valid in response.
 */
public class ContainerGroupPropertiesInstanceView {
    /**
     * The events of this container group.
     */
    @JsonProperty(value = "events", access = JsonProperty.Access.WRITE_ONLY)
    private List<Event> events;

    /**
     * The state of the container group. Only valid in response.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private String state;

    /**
     * Get the events of this container group.
     *
     * @return the events value
     */
    public List<Event> events() {
        return this.events;
    }

    /**
     * Get the state of the container group. Only valid in response.
     *
     * @return the state value
     */
    public String state() {
        return this.state;
    }

}
