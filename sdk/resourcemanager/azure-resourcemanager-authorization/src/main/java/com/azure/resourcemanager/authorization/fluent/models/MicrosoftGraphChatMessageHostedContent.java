// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.HashMap;
import java.util.Map;

/** chatMessageHostedContent. */
@Fluent
public final class MicrosoftGraphChatMessageHostedContent extends MicrosoftGraphEntity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphChatMessageHostedContent.class);

    /*
     * chatMessageHostedContent
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the additionalProperties property: chatMessageHostedContent.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: chatMessageHostedContent.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphChatMessageHostedContent object itself.
     */
    public MicrosoftGraphChatMessageHostedContent withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphChatMessageHostedContent withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
