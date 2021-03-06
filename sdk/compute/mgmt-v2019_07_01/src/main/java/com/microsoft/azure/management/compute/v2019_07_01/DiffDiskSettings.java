/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the parameters of ephemeral disk settings that can be specified
 * for operating system disk. &lt;br&gt;&lt;br&gt; NOTE: The ephemeral disk
 * settings can only be specified for managed disk.
 */
public class DiffDiskSettings {
    /**
     * Specifies the ephemeral disk settings for operating system disk.
     * Possible values include: 'Local'.
     */
    @JsonProperty(value = "option")
    private DiffDiskOptions option;

    /**
     * Get specifies the ephemeral disk settings for operating system disk. Possible values include: 'Local'.
     *
     * @return the option value
     */
    public DiffDiskOptions option() {
        return this.option;
    }

    /**
     * Set specifies the ephemeral disk settings for operating system disk. Possible values include: 'Local'.
     *
     * @param option the option value to set
     * @return the DiffDiskSettings object itself.
     */
    public DiffDiskSettings withOption(DiffDiskOptions option) {
        this.option = option;
        return this;
    }

}
