// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.TransportProtocol;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Inbound NAT rule of the load balancer. */
@JsonFlatten
@Fluent
public class InboundNatRuleInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(InboundNatRuleInner.class);

    /*
     * The name of the resource that is unique within the set of inbound NAT
     * rules used by the load balancer. This name can be used to access the
     * resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * A reference to frontend IP addresses.
     */
    @JsonProperty(value = "properties.frontendIPConfiguration")
    private SubResource frontendIpConfiguration;

    /*
     * A reference to a private IP address defined on a network interface of a
     * VM. Traffic sent to the frontend port of each of the frontend IP
     * configurations is forwarded to the backend IP.
     */
    @JsonProperty(value = "properties.backendIPConfiguration", access = JsonProperty.Access.WRITE_ONLY)
    private NetworkInterfaceIpConfigurationInner backendIpConfiguration;

    /*
     * The reference to the transport protocol used by the load balancing rule.
     */
    @JsonProperty(value = "properties.protocol")
    private TransportProtocol protocol;

    /*
     * The port for the external endpoint. Port numbers for each rule must be
     * unique within the Load Balancer. Acceptable values range from 1 to
     * 65534.
     */
    @JsonProperty(value = "properties.frontendPort")
    private Integer frontendPort;

    /*
     * The port used for the internal endpoint. Acceptable values range from 1
     * to 65535.
     */
    @JsonProperty(value = "properties.backendPort")
    private Integer backendPort;

    /*
     * The timeout for the TCP idle connection. The value can be set between 4
     * and 30 minutes. The default value is 4 minutes. This element is only
     * used when the protocol is set to TCP.
     */
    @JsonProperty(value = "properties.idleTimeoutInMinutes")
    private Integer idleTimeoutInMinutes;

    /*
     * Configures a virtual machine's endpoint for the floating IP capability
     * required to configure a SQL AlwaysOn Availability Group. This setting is
     * required when using the SQL AlwaysOn Availability Groups in SQL server.
     * This setting can't be changed after you create the endpoint.
     */
    @JsonProperty(value = "properties.enableFloatingIP")
    private Boolean enableFloatingIp;

    /*
     * Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected
     * connection termination. This element is only used when the protocol is
     * set to TCP.
     */
    @JsonProperty(value = "properties.enableTcpReset")
    private Boolean enableTcpReset;

    /*
     * The provisioning state of the inbound NAT rule resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the name property: The name of the resource that is unique within the set of inbound NAT rules used by the
     * load balancer. This name can be used to access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within the set of inbound NAT rules used by the
     * load balancer. This name can be used to access the resource.
     *
     * @param name the name value to set.
     * @return the InboundNatRuleInner object itself.
     */
    public InboundNatRuleInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: Type of the resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the frontendIpConfiguration property: A reference to frontend IP addresses.
     *
     * @return the frontendIpConfiguration value.
     */
    public SubResource frontendIpConfiguration() {
        return this.frontendIpConfiguration;
    }

    /**
     * Set the frontendIpConfiguration property: A reference to frontend IP addresses.
     *
     * @param frontendIpConfiguration the frontendIpConfiguration value to set.
     * @return the InboundNatRuleInner object itself.
     */
    public InboundNatRuleInner withFrontendIpConfiguration(SubResource frontendIpConfiguration) {
        this.frontendIpConfiguration = frontendIpConfiguration;
        return this;
    }

    /**
     * Get the backendIpConfiguration property: A reference to a private IP address defined on a network interface of a
     * VM. Traffic sent to the frontend port of each of the frontend IP configurations is forwarded to the backend IP.
     *
     * @return the backendIpConfiguration value.
     */
    public NetworkInterfaceIpConfigurationInner backendIpConfiguration() {
        return this.backendIpConfiguration;
    }

    /**
     * Get the protocol property: The reference to the transport protocol used by the load balancing rule.
     *
     * @return the protocol value.
     */
    public TransportProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: The reference to the transport protocol used by the load balancing rule.
     *
     * @param protocol the protocol value to set.
     * @return the InboundNatRuleInner object itself.
     */
    public InboundNatRuleInner withProtocol(TransportProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the frontendPort property: The port for the external endpoint. Port numbers for each rule must be unique
     * within the Load Balancer. Acceptable values range from 1 to 65534.
     *
     * @return the frontendPort value.
     */
    public Integer frontendPort() {
        return this.frontendPort;
    }

    /**
     * Set the frontendPort property: The port for the external endpoint. Port numbers for each rule must be unique
     * within the Load Balancer. Acceptable values range from 1 to 65534.
     *
     * @param frontendPort the frontendPort value to set.
     * @return the InboundNatRuleInner object itself.
     */
    public InboundNatRuleInner withFrontendPort(Integer frontendPort) {
        this.frontendPort = frontendPort;
        return this;
    }

    /**
     * Get the backendPort property: The port used for the internal endpoint. Acceptable values range from 1 to 65535.
     *
     * @return the backendPort value.
     */
    public Integer backendPort() {
        return this.backendPort;
    }

    /**
     * Set the backendPort property: The port used for the internal endpoint. Acceptable values range from 1 to 65535.
     *
     * @param backendPort the backendPort value to set.
     * @return the InboundNatRuleInner object itself.
     */
    public InboundNatRuleInner withBackendPort(Integer backendPort) {
        this.backendPort = backendPort;
        return this;
    }

    /**
     * Get the idleTimeoutInMinutes property: The timeout for the TCP idle connection. The value can be set between 4
     * and 30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to TCP.
     *
     * @return the idleTimeoutInMinutes value.
     */
    public Integer idleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes;
    }

    /**
     * Set the idleTimeoutInMinutes property: The timeout for the TCP idle connection. The value can be set between 4
     * and 30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to TCP.
     *
     * @param idleTimeoutInMinutes the idleTimeoutInMinutes value to set.
     * @return the InboundNatRuleInner object itself.
     */
    public InboundNatRuleInner withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        return this;
    }

    /**
     * Get the enableFloatingIp property: Configures a virtual machine's endpoint for the floating IP capability
     * required to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn
     * Availability Groups in SQL server. This setting can't be changed after you create the endpoint.
     *
     * @return the enableFloatingIp value.
     */
    public Boolean enableFloatingIp() {
        return this.enableFloatingIp;
    }

    /**
     * Set the enableFloatingIp property: Configures a virtual machine's endpoint for the floating IP capability
     * required to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn
     * Availability Groups in SQL server. This setting can't be changed after you create the endpoint.
     *
     * @param enableFloatingIp the enableFloatingIp value to set.
     * @return the InboundNatRuleInner object itself.
     */
    public InboundNatRuleInner withEnableFloatingIp(Boolean enableFloatingIp) {
        this.enableFloatingIp = enableFloatingIp;
        return this;
    }

    /**
     * Get the enableTcpReset property: Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected
     * connection termination. This element is only used when the protocol is set to TCP.
     *
     * @return the enableTcpReset value.
     */
    public Boolean enableTcpReset() {
        return this.enableTcpReset;
    }

    /**
     * Set the enableTcpReset property: Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected
     * connection termination. This element is only used when the protocol is set to TCP.
     *
     * @param enableTcpReset the enableTcpReset value to set.
     * @return the InboundNatRuleInner object itself.
     */
    public InboundNatRuleInner withEnableTcpReset(Boolean enableTcpReset) {
        this.enableTcpReset = enableTcpReset;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the inbound NAT rule resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /** {@inheritDoc} */
    @Override
    public InboundNatRuleInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (backendIpConfiguration() != null) {
            backendIpConfiguration().validate();
        }
    }
}
