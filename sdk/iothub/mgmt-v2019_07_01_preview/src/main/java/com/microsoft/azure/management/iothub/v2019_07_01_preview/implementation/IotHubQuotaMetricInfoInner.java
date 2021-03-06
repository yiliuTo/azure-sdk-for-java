/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2019_07_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Quota metrics properties.
 */
public class IotHubQuotaMetricInfoInner {
    /**
     * The name of the quota metric.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The current value for the quota metric.
     */
    @JsonProperty(value = "currentValue", access = JsonProperty.Access.WRITE_ONLY)
    private Long currentValue;

    /**
     * The maximum value of the quota metric.
     */
    @JsonProperty(value = "maxValue", access = JsonProperty.Access.WRITE_ONLY)
    private Long maxValue;

    /**
     * Get the name of the quota metric.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the current value for the quota metric.
     *
     * @return the currentValue value
     */
    public Long currentValue() {
        return this.currentValue;
    }

    /**
     * Get the maximum value of the quota metric.
     *
     * @return the maxValue value
     */
    public Long maxValue() {
        return this.maxValue;
    }

}
