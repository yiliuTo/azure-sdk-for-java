// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Publishing Credentials Policies collection. */
@JsonFlatten
@Fluent
public class CsmPublishingCredentialsPoliciesCollectionInner extends ProxyOnlyResource {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(CsmPublishingCredentialsPoliciesCollectionInner.class);

    /*
     * Whether FTP is allowed.
     */
    @JsonProperty(value = "properties.ftp")
    private CsmPublishingCredentialsPoliciesEntityInner ftp;

    /*
     * Whether Scm Basic Auth is allowed.
     */
    @JsonProperty(value = "properties.scm")
    private CsmPublishingCredentialsPoliciesEntityInner scm;

    /**
     * Get the ftp property: Whether FTP is allowed.
     *
     * @return the ftp value.
     */
    public CsmPublishingCredentialsPoliciesEntityInner ftp() {
        return this.ftp;
    }

    /**
     * Set the ftp property: Whether FTP is allowed.
     *
     * @param ftp the ftp value to set.
     * @return the CsmPublishingCredentialsPoliciesCollectionInner object itself.
     */
    public CsmPublishingCredentialsPoliciesCollectionInner withFtp(CsmPublishingCredentialsPoliciesEntityInner ftp) {
        this.ftp = ftp;
        return this;
    }

    /**
     * Get the scm property: Whether Scm Basic Auth is allowed.
     *
     * @return the scm value.
     */
    public CsmPublishingCredentialsPoliciesEntityInner scm() {
        return this.scm;
    }

    /**
     * Set the scm property: Whether Scm Basic Auth is allowed.
     *
     * @param scm the scm value to set.
     * @return the CsmPublishingCredentialsPoliciesCollectionInner object itself.
     */
    public CsmPublishingCredentialsPoliciesCollectionInner withScm(CsmPublishingCredentialsPoliciesEntityInner scm) {
        this.scm = scm;
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
        if (ftp() != null) {
            ftp().validate();
        }
        if (scm() != null) {
            scm().validate();
        }
    }
}
