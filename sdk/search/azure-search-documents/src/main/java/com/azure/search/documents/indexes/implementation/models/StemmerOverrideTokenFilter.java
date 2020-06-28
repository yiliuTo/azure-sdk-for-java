// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** The StemmerOverrideTokenFilter model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Azure.Search.StemmerOverrideTokenFilter")
@JsonFlatten
@Fluent
public class StemmerOverrideTokenFilter extends TokenFilter {
    /*
     * A list of stemming rules in the following format: "word => stem", for
     * example: "ran => run".
     */
    @JsonProperty(value = "rules", required = true)
    private List<String> rules;

    /** Creates an instance of StemmerOverrideTokenFilter class. */
    @JsonCreator
    public StemmerOverrideTokenFilter(
            @JsonProperty(value = "name") String name, @JsonProperty(value = "rules") List<String> rules) {
        super(name);
        this.rules = rules;
    }

    /**
     * Get the rules property: A list of stemming rules in the following format: "word =&gt; stem", for example: "ran
     * =&gt; run".
     *
     * @return the rules value.
     */
    public List<String> getRules() {
        return this.rules;
    }

    /**
     * Set the rules property: A list of stemming rules in the following format: "word =&gt; stem", for example: "ran
     * =&gt; run".
     *
     * @param rules the rules value to set.
     * @return the StemmerOverrideTokenFilter object itself.
     */
    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (getRules() == null) {
            throw new IllegalArgumentException("Missing required property rules in model StemmerOverrideTokenFilter");
        }
    }
}
