/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_07_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about the current running state of the overall upgrade.
 */
public class UpgradeOperationHistoryStatus {
    /**
     * Code indicating the current status of the upgrade. Possible values
     * include: 'RollingForward', 'Cancelled', 'Completed', 'Faulted'.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private UpgradeState code;

    /**
     * Start time of the upgrade.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime startTime;

    /**
     * End time of the upgrade.
     */
    @JsonProperty(value = "endTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime endTime;

    /**
     * Get code indicating the current status of the upgrade. Possible values include: 'RollingForward', 'Cancelled', 'Completed', 'Faulted'.
     *
     * @return the code value
     */
    public UpgradeState code() {
        return this.code;
    }

    /**
     * Get start time of the upgrade.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Get end time of the upgrade.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

}
