/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2020_09_18;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A data connection check name availability request.
 */
public class DataConnectionCheckNameRequest {
    /**
     * Data Connection name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The type of resource,
     * Microsoft.Kusto/clusters/databases/dataConnections.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * Creates an instance of DataConnectionCheckNameRequest class.
     * @param name data Connection name.
     */
    public DataConnectionCheckNameRequest() {
        type = "Microsoft.Kusto/clusters/databases/dataConnections";
    }

    /**
     * Get data Connection name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set data Connection name.
     *
     * @param name the name value to set
     * @return the DataConnectionCheckNameRequest object itself.
     */
    public DataConnectionCheckNameRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type of resource, Microsoft.Kusto/clusters/databases/dataConnections.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type of resource, Microsoft.Kusto/clusters/databases/dataConnections.
     *
     * @param type the type value to set
     * @return the DataConnectionCheckNameRequest object itself.
     */
    public DataConnectionCheckNameRequest withType(String type) {
        this.type = type;
        return this;
    }

}
