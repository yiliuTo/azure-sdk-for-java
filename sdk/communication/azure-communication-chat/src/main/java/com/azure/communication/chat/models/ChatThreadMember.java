// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.chat.models;

import com.azure.communication.common.CommunicationUserIdentifier;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The ChatThreadMember model. */
@Fluent
public final class ChatThreadMember {
    /*
     * The user identity of the chat thread member
     * in the format `8:acs...`.
     */
    @JsonProperty(value = "user", required = true)
    private CommunicationUserIdentifier user;

    /*
     * Display name for the chat thread member.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Time from which the chat history is shared with the member. The
     * timestamp is in ISO8601 format: `yyyy-MM-ddTHH:mm:ssZ`.
     */
    @JsonProperty(value = "shareHistoryTime")
    private OffsetDateTime shareHistoryTime;

    /**
     * Get the user property: The user identity of the chat thread member in the format `8:acs...`.
     *
     * @return the user value.
     */
    public CommunicationUserIdentifier getUser() {
        return this.user;
    }

    /**
     * Set the user property: The user identity of the chat thread member in the format `8:acs...`.
     *
     * @param user the user value to set.
     * @return the ChatThreadMember object itself.
     */
    public ChatThreadMember setUser(CommunicationUserIdentifier user) {
        this.user = user;
        return this;
    }

    /**
     * Get the displayName property: Display name for the chat thread member.
     *
     * @return the displayName value.
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name for the chat thread member.
     *
     * @param displayName the displayName value to set.
     * @return the ChatThreadMember object itself.
     */
    public ChatThreadMember setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the shareHistoryTime property: Time from which the chat history is shared with the member. The timestamp is
     * in ISO8601 format: `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @return the shareHistoryTime value.
     */
    public OffsetDateTime getShareHistoryTime() {
        return this.shareHistoryTime;
    }

    /**
     * Set the shareHistoryTime property: Time from which the chat history is shared with the member. The timestamp is
     * in ISO8601 format: `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @param shareHistoryTime the shareHistoryTime value to set.
     * @return the ChatThreadMember object itself.
     */
    public ChatThreadMember setShareHistoryTime(OffsetDateTime shareHistoryTime) {
        this.shareHistoryTime = shareHistoryTime;
        return this;
    }
}
