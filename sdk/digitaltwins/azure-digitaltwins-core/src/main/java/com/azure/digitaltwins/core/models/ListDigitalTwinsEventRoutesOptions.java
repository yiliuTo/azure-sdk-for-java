// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.digitaltwins.core.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.Context;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The optional parameters for
 * {@link com.azure.digitaltwins.core.DigitalTwinsClient#listEventRoutes(ListDigitalTwinsEventRoutesOptions, Context)} and
 * {@link com.azure.digitaltwins.core.DigitalTwinsAsyncClient#listEventRoutes(ListDigitalTwinsEventRoutesOptions)}
 */
@Fluent
public final class ListDigitalTwinsEventRoutesOptions {
    /*
     * Identifies the request in a distributed tracing system.
     */
    @JsonProperty(value = "traceparent")
    private String traceparent;

    /*
     * Provides vendor-specific trace identification information and is a
     * companion to traceparent.
     */
    @JsonProperty(value = "tracestate")
    private String tracestate;

    /*
     * The maximum number of items to retrieve per request. The server may
     * choose to return less than the requested number.
     */
    @JsonProperty(value = "MaxItemsPerPage")
    private Integer maxItemsPerPage;

    /**
     * Get the traceparent property: Identifies the request in a distributed tracing system.
     *
     * @return the traceparent value.
     */
    public String getTraceParent() {
        return this.traceparent;
    }

    /**
     * Set the traceparent property: Identifies the request in a distributed tracing system.
     *
     * @param traceparent the traceparent value to set.
     * @return the ListEventRoutesOptions object itself.
     */
    public ListDigitalTwinsEventRoutesOptions setTraceParent(String traceparent) {
        this.traceparent = traceparent;
        return this;
    }

    /**
     * Get the tracestate property: Provides vendor-specific trace identification information and is a companion to
     * traceparent.
     *
     * @return the tracestate value.
     */
    public String getTraceState() {
        return this.tracestate;
    }

    /**
     * Set the tracestate property: Provides vendor-specific trace identification information and is a companion to
     * traceparent.
     *
     * @param tracestate the tracestate value to set.
     * @return the ListEventRoutesOptions object itself.
     */
    public ListDigitalTwinsEventRoutesOptions setTraceState(String tracestate) {
        this.tracestate = tracestate;
        return this;
    }

    /**
     * Get the maxItemsPerPage property: The maximum number of items to retrieve per request. The server may choose to
     * return less than the requested number.
     *
     * @return the maxItemsPerPage value.
     */
    public Integer getMaxItemsPerPage() {
        return this.maxItemsPerPage;
    }

    /**
     * Set the maxItemsPerPage property: The maximum number of items to retrieve per request. The server may choose to
     * return less than the requested number.
     *
     * @param maxItemsPerPage the maxItemsPerPage value to set.
     * @return the ListEventRoutesOptions object itself.
     */
    public ListDigitalTwinsEventRoutesOptions setMaxItemsPerPage(Integer maxItemsPerPage) {
        this.maxItemsPerPage = maxItemsPerPage;
        return this;
    }
}