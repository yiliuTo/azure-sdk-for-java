// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The JSON object that contains the properties of the origin. */
@Immutable
public final class AfdOriginProperties extends AfdOriginUpdatePropertiesParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AfdOriginProperties.class);

    /*
     * Provisioning status
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private AfdProvisioningState provisioningState;

    /*
     * The deploymentStatus property.
     */
    @JsonProperty(value = "deploymentStatus", access = JsonProperty.Access.WRITE_ONLY)
    private DeploymentStatus deploymentStatus;

    /**
     * Get the provisioningState property: Provisioning status.
     *
     * @return the provisioningState value.
     */
    public AfdProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the deploymentStatus property: The deploymentStatus property.
     *
     * @return the deploymentStatus value.
     */
    public DeploymentStatus deploymentStatus() {
        return this.deploymentStatus;
    }

    /** {@inheritDoc} */
    @Override
    public AfdOriginProperties withAzureOrigin(ResourceReference azureOrigin) {
        super.withAzureOrigin(azureOrigin);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AfdOriginProperties withHostname(String hostname) {
        super.withHostname(hostname);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AfdOriginProperties withHttpPort(Integer httpPort) {
        super.withHttpPort(httpPort);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AfdOriginProperties withHttpsPort(Integer httpsPort) {
        super.withHttpsPort(httpsPort);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AfdOriginProperties withOriginHostHeader(String originHostHeader) {
        super.withOriginHostHeader(originHostHeader);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AfdOriginProperties withPriority(Integer priority) {
        super.withPriority(priority);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AfdOriginProperties withWeight(Integer weight) {
        super.withWeight(weight);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AfdOriginProperties withSharedPrivateLinkResource(Object sharedPrivateLinkResource) {
        super.withSharedPrivateLinkResource(sharedPrivateLinkResource);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AfdOriginProperties withEnabledState(EnabledState enabledState) {
        super.withEnabledState(enabledState);
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
