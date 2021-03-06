/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2019_07_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Routes that matched.
 */
public class MatchedRoute {
    /**
     * Properties of routes that matched.
     */
    @JsonProperty(value = "properties")
    private RouteProperties properties;

    /**
     * Get properties of routes that matched.
     *
     * @return the properties value
     */
    public RouteProperties properties() {
        return this.properties;
    }

    /**
     * Set properties of routes that matched.
     *
     * @param properties the properties value to set
     * @return the MatchedRoute object itself.
     */
    public MatchedRoute withProperties(RouteProperties properties) {
        this.properties = properties;
        return this;
    }

}
