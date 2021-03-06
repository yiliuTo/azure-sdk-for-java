/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_08_01.implementation;

import com.microsoft.azure.management.loganalytics.v2020_08_01.SearchMetadata;
import java.util.List;
import com.microsoft.azure.management.loganalytics.v2020_08_01.SearchSchemaValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The get schema operation response.
 */
public class SearchGetSchemaResponseInner {
    /**
     * The metadata from search results.
     */
    @JsonProperty(value = "metadata")
    private SearchMetadata metadata;

    /**
     * The array of result values.
     */
    @JsonProperty(value = "value")
    private List<SearchSchemaValue> value;

    /**
     * Get the metadata from search results.
     *
     * @return the metadata value
     */
    public SearchMetadata metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata from search results.
     *
     * @param metadata the metadata value to set
     * @return the SearchGetSchemaResponseInner object itself.
     */
    public SearchGetSchemaResponseInner withMetadata(SearchMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the array of result values.
     *
     * @return the value value
     */
    public List<SearchSchemaValue> value() {
        return this.value;
    }

    /**
     * Set the array of result values.
     *
     * @param value the value value to set
     * @return the SearchGetSchemaResponseInner object itself.
     */
    public SearchGetSchemaResponseInner withValue(List<SearchSchemaValue> value) {
        this.value = value;
        return this;
    }

}
