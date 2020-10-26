/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2019_09_01;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An identity that have access to the key vault. All identities in the array
 * must use the same tenant ID as the key vault's tenant ID.
 */
public class AccessPolicyEntry {
    /**
     * The Azure Active Directory tenant ID that should be used for
     * authenticating requests to the key vault.
     */
    @JsonProperty(value = "tenantId", required = true)
    private UUID tenantId;

    /**
     * The object ID of a user, service principal or security group in the
     * Azure Active Directory tenant for the vault. The object ID must be
     * unique for the list of access policies.
     */
    @JsonProperty(value = "objectId", required = true)
    private String objectId;

    /**
     * Application ID of the client making request on behalf of a principal.
     */
    @JsonProperty(value = "applicationId")
    private UUID applicationId;

    /**
     * Permissions the identity has for keys, secrets and certificates.
     */
    @JsonProperty(value = "permissions", required = true)
    private Permissions permissions;

    /**
     * Get the Azure Active Directory tenant ID that should be used for authenticating requests to the key vault.
     *
     * @return the tenantId value
     */
    public UUID tenantId() {
        return this.tenantId;
    }

    /**
     * Set the Azure Active Directory tenant ID that should be used for authenticating requests to the key vault.
     *
     * @param tenantId the tenantId value to set
     * @return the AccessPolicyEntry object itself.
     */
    public AccessPolicyEntry withTenantId(UUID tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the object ID of a user, service principal or security group in the Azure Active Directory tenant for the vault. The object ID must be unique for the list of access policies.
     *
     * @return the objectId value
     */
    public String objectId() {
        return this.objectId;
    }

    /**
     * Set the object ID of a user, service principal or security group in the Azure Active Directory tenant for the vault. The object ID must be unique for the list of access policies.
     *
     * @param objectId the objectId value to set
     * @return the AccessPolicyEntry object itself.
     */
    public AccessPolicyEntry withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * Get application ID of the client making request on behalf of a principal.
     *
     * @return the applicationId value
     */
    public UUID applicationId() {
        return this.applicationId;
    }

    /**
     * Set application ID of the client making request on behalf of a principal.
     *
     * @param applicationId the applicationId value to set
     * @return the AccessPolicyEntry object itself.
     */
    public AccessPolicyEntry withApplicationId(UUID applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Get permissions the identity has for keys, secrets and certificates.
     *
     * @return the permissions value
     */
    public Permissions permissions() {
        return this.permissions;
    }

    /**
     * Set permissions the identity has for keys, secrets and certificates.
     *
     * @param permissions the permissions value to set
     * @return the AccessPolicyEntry object itself.
     */
    public AccessPolicyEntry withPermissions(Permissions permissions) {
        this.permissions = permissions;
        return this;
    }

}