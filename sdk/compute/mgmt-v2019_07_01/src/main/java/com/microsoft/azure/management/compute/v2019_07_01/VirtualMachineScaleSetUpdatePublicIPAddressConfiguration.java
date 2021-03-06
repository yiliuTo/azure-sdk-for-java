/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Describes a virtual machines scale set IP Configuration's PublicIPAddress
 * configuration.
 */
@JsonFlatten
public class VirtualMachineScaleSetUpdatePublicIPAddressConfiguration {
    /**
     * The publicIP address configuration name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The idle timeout of the public IP address.
     */
    @JsonProperty(value = "properties.idleTimeoutInMinutes")
    private Integer idleTimeoutInMinutes;

    /**
     * The dns settings to be applied on the publicIP addresses .
     */
    @JsonProperty(value = "properties.dnsSettings")
    private VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettings dnsSettings;

    /**
     * Get the publicIP address configuration name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the publicIP address configuration name.
     *
     * @param name the name value to set
     * @return the VirtualMachineScaleSetUpdatePublicIPAddressConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdatePublicIPAddressConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the idle timeout of the public IP address.
     *
     * @return the idleTimeoutInMinutes value
     */
    public Integer idleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes;
    }

    /**
     * Set the idle timeout of the public IP address.
     *
     * @param idleTimeoutInMinutes the idleTimeoutInMinutes value to set
     * @return the VirtualMachineScaleSetUpdatePublicIPAddressConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdatePublicIPAddressConfiguration withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        return this;
    }

    /**
     * Get the dns settings to be applied on the publicIP addresses .
     *
     * @return the dnsSettings value
     */
    public VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettings dnsSettings() {
        return this.dnsSettings;
    }

    /**
     * Set the dns settings to be applied on the publicIP addresses .
     *
     * @param dnsSettings the dnsSettings value to set
     * @return the VirtualMachineScaleSetUpdatePublicIPAddressConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdatePublicIPAddressConfiguration withDnsSettings(VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettings dnsSettings) {
        this.dnsSettings = dnsSettings;
        return this;
    }

}
