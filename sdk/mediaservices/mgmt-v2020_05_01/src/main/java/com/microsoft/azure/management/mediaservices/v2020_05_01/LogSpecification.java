/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2020_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A diagnostic log emitted by service.
 */
public class LogSpecification {
    /**
     * The diagnostic log category name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The diagnostic log category display name.
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /**
     * The time range for requests in each blob.
     */
    @JsonProperty(value = "blobDuration", access = JsonProperty.Access.WRITE_ONLY)
    private String blobDuration;

    /**
     * Get the diagnostic log category name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the diagnostic log category display name.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the time range for requests in each blob.
     *
     * @return the blobDuration value
     */
    public String blobDuration() {
        return this.blobDuration;
    }

}
