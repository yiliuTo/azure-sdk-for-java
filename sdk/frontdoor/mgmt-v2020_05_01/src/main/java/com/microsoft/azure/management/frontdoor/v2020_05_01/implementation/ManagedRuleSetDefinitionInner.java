/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.frontdoor.v2020_05_01.implementation;

import java.util.List;
import com.microsoft.azure.management.frontdoor.v2020_05_01.ManagedRuleGroupDefinition;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Describes the a managed rule set definition.
 */
@JsonFlatten
@SkipParentValidation
public class ManagedRuleSetDefinitionInner extends Resource {
    /**
     * Provisioning state of the managed rule set.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Id of the managed rule set.
     */
    @JsonProperty(value = "properties.ruleSetId", access = JsonProperty.Access.WRITE_ONLY)
    private String ruleSetId;

    /**
     * Type of the managed rule set.
     */
    @JsonProperty(value = "properties.ruleSetType", access = JsonProperty.Access.WRITE_ONLY)
    private String ruleSetType;

    /**
     * Version of the managed rule set type.
     */
    @JsonProperty(value = "properties.ruleSetVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String ruleSetVersion;

    /**
     * Rule groups of the managed rule set.
     */
    @JsonProperty(value = "properties.ruleGroups", access = JsonProperty.Access.WRITE_ONLY)
    private List<ManagedRuleGroupDefinition> ruleGroups;

    /**
     * Get provisioning state of the managed rule set.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get id of the managed rule set.
     *
     * @return the ruleSetId value
     */
    public String ruleSetId() {
        return this.ruleSetId;
    }

    /**
     * Get type of the managed rule set.
     *
     * @return the ruleSetType value
     */
    public String ruleSetType() {
        return this.ruleSetType;
    }

    /**
     * Get version of the managed rule set type.
     *
     * @return the ruleSetVersion value
     */
    public String ruleSetVersion() {
        return this.ruleSetVersion;
    }

    /**
     * Get rule groups of the managed rule set.
     *
     * @return the ruleGroups value
     */
    public List<ManagedRuleGroupDefinition> ruleGroups() {
        return this.ruleGroups;
    }

}