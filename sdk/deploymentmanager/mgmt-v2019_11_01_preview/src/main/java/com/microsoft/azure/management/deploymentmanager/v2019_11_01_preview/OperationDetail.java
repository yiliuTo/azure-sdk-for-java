/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The detail about an operation.
 */
public class OperationDetail {
    /**
     * The name of the provider that supports the operation.
     */
    @JsonProperty(value = "provider")
    private String provider;

    /**
     * The resource type on which this operation can be performed.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /**
     * The name of the operation.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /**
     * The description of the operation.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the name of the provider that supports the operation.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the name of the provider that supports the operation.
     *
     * @param provider the provider value to set
     * @return the OperationDetail object itself.
     */
    public OperationDetail withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the resource type on which this operation can be performed.
     *
     * @return the resource value
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set the resource type on which this operation can be performed.
     *
     * @param resource the resource value to set
     * @return the OperationDetail object itself.
     */
    public OperationDetail withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the name of the operation.
     *
     * @return the operation value
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the name of the operation.
     *
     * @param operation the operation value to set
     * @return the OperationDetail object itself.
     */
    public OperationDetail withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the description of the operation.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description of the operation.
     *
     * @param description the description value to set
     * @return the OperationDetail object itself.
     */
    public OperationDetail withDescription(String description) {
        this.description = description;
        return this;
    }

}
