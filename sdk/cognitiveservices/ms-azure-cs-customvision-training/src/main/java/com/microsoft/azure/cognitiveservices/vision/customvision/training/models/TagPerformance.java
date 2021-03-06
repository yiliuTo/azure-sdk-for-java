/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.customvision.training.models;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents performance data for a particular tag in a trained iteration.
 */
public class TagPerformance {
    /**
     * The id property.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private UUID id;

    /**
     * The name property.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Gets the precision.
     */
    @JsonProperty(value = "precision", access = JsonProperty.Access.WRITE_ONLY)
    private double precision;

    /**
     * Gets the standard deviation for the precision.
     */
    @JsonProperty(value = "precisionStdDeviation", access = JsonProperty.Access.WRITE_ONLY)
    private double precisionStdDeviation;

    /**
     * Gets the recall.
     */
    @JsonProperty(value = "recall", access = JsonProperty.Access.WRITE_ONLY)
    private double recall;

    /**
     * Gets the standard deviation for the recall.
     */
    @JsonProperty(value = "recallStdDeviation", access = JsonProperty.Access.WRITE_ONLY)
    private double recallStdDeviation;

    /**
     * Gets the average precision when applicable.
     */
    @JsonProperty(value = "averagePrecision", access = JsonProperty.Access.WRITE_ONLY)
    private Double averagePrecision;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public UUID id() {
        return this.id;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the precision value.
     *
     * @return the precision value
     */
    public double precision() {
        return this.precision;
    }

    /**
     * Get the precisionStdDeviation value.
     *
     * @return the precisionStdDeviation value
     */
    public double precisionStdDeviation() {
        return this.precisionStdDeviation;
    }

    /**
     * Get the recall value.
     *
     * @return the recall value
     */
    public double recall() {
        return this.recall;
    }

    /**
     * Get the recallStdDeviation value.
     *
     * @return the recallStdDeviation value
     */
    public double recallStdDeviation() {
        return this.recallStdDeviation;
    }

    /**
     * Get the averagePrecision value.
     *
     * @return the averagePrecision value
     */
    public Double averagePrecision() {
        return this.averagePrecision;
    }

}
