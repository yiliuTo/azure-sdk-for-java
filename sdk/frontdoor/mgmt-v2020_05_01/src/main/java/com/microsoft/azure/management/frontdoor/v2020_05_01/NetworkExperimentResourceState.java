/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.frontdoor.v2020_05_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for NetworkExperimentResourceState.
 */
public final class NetworkExperimentResourceState extends ExpandableStringEnum<NetworkExperimentResourceState> {
    /** Static value Creating for NetworkExperimentResourceState. */
    public static final NetworkExperimentResourceState CREATING = fromString("Creating");

    /** Static value Enabling for NetworkExperimentResourceState. */
    public static final NetworkExperimentResourceState ENABLING = fromString("Enabling");

    /** Static value Enabled for NetworkExperimentResourceState. */
    public static final NetworkExperimentResourceState ENABLED = fromString("Enabled");

    /** Static value Disabling for NetworkExperimentResourceState. */
    public static final NetworkExperimentResourceState DISABLING = fromString("Disabling");

    /** Static value Disabled for NetworkExperimentResourceState. */
    public static final NetworkExperimentResourceState DISABLED = fromString("Disabled");

    /** Static value Deleting for NetworkExperimentResourceState. */
    public static final NetworkExperimentResourceState DELETING = fromString("Deleting");

    /**
     * Creates or finds a NetworkExperimentResourceState from its string representation.
     * @param name a name to look for
     * @return the corresponding NetworkExperimentResourceState
     */
    @JsonCreator
    public static NetworkExperimentResourceState fromString(String name) {
        return fromString(name, NetworkExperimentResourceState.class);
    }

    /**
     * @return known NetworkExperimentResourceState values
     */
    public static Collection<NetworkExperimentResourceState> values() {
        return values(NetworkExperimentResourceState.class);
    }
}