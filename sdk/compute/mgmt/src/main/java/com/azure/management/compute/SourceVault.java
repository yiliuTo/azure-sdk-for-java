// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SourceVault model. */
@Fluent
public final class SourceVault {
    /*
     * Resource Id
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the id property: Resource Id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource Id.
     *
     * @param id the id value to set.
     * @return the SourceVault object itself.
     */
    public SourceVault withId(String id) {
        this.id = id;
        return this;
    }
}
