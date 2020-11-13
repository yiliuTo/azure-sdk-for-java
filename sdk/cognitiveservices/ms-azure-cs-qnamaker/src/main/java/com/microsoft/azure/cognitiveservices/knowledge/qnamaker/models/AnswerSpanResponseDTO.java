/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.knowledge.qnamaker.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Answer span object of QnA.
 */
public class AnswerSpanResponseDTO {
    /**
     * Predicted text of answer span.
     */
    @JsonProperty(value = "text")
    private String text;

    /**
     * Predicted score of answer span.
     */
    @JsonProperty(value = "score")
    private Double score;

    /**
     * Start index of answer span in answer.
     */
    @JsonProperty(value = "startIndex")
    private Integer startIndex;

    /**
     * End index of answer span in answer.
     */
    @JsonProperty(value = "endIndex")
    private Integer endIndex;

    /**
     * Get the text value.
     *
     * @return the text value
     */
    public String text() {
        return this.text;
    }

    /**
     * Set the text value.
     *
     * @param text the text value to set
     * @return the AnswerSpanResponseDTO object itself.
     */
    public AnswerSpanResponseDTO withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the score value.
     *
     * @return the score value
     */
    public Double score() {
        return this.score;
    }

    /**
     * Set the score value.
     *
     * @param score the score value to set
     * @return the AnswerSpanResponseDTO object itself.
     */
    public AnswerSpanResponseDTO withScore(Double score) {
        this.score = score;
        return this;
    }

    /**
     * Get the startIndex value.
     *
     * @return the startIndex value
     */
    public Integer startIndex() {
        return this.startIndex;
    }

    /**
     * Set the startIndex value.
     *
     * @param startIndex the startIndex value to set
     * @return the AnswerSpanResponseDTO object itself.
     */
    public AnswerSpanResponseDTO withStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
        return this;
    }

    /**
     * Get the endIndex value.
     *
     * @return the endIndex value
     */
    public Integer endIndex() {
        return this.endIndex;
    }

    /**
     * Set the endIndex value.
     *
     * @param endIndex the endIndex value to set
     * @return the AnswerSpanResponseDTO object itself.
     */
    public AnswerSpanResponseDTO withEndIndex(Integer endIndex) {
        this.endIndex = endIndex;
        return this;
    }

}