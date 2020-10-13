// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The retention policy for a container registry. */
@Fluent
public final class RetentionPolicy {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RetentionPolicy.class);

    /*
     * The number of days to retain an untagged manifest after which it gets
     * purged.
     */
    @JsonProperty(value = "days")
    private Integer days;

    /*
     * The timestamp when the policy was last updated.
     */
    @JsonProperty(value = "lastUpdatedTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastUpdatedTime;

    /*
     * The value that indicates whether the policy is enabled or not.
     */
    @JsonProperty(value = "status")
    private PolicyStatus status;

    /**
     * Get the days property: The number of days to retain an untagged manifest after which it gets purged.
     *
     * @return the days value.
     */
    public Integer days() {
        return this.days;
    }

    /**
     * Set the days property: The number of days to retain an untagged manifest after which it gets purged.
     *
     * @param days the days value to set.
     * @return the RetentionPolicy object itself.
     */
    public RetentionPolicy withDays(Integer days) {
        this.days = days;
        return this;
    }

    /**
     * Get the lastUpdatedTime property: The timestamp when the policy was last updated.
     *
     * @return the lastUpdatedTime value.
     */
    public OffsetDateTime lastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * Get the status property: The value that indicates whether the policy is enabled or not.
     *
     * @return the status value.
     */
    public PolicyStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The value that indicates whether the policy is enabled or not.
     *
     * @param status the status value to set.
     * @return the RetentionPolicy object itself.
     */
    public RetentionPolicy withStatus(PolicyStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}