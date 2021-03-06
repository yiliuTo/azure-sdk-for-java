// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventgrid.fluent.models.DomainInner;
import com.azure.resourcemanager.eventgrid.fluent.models.PrivateEndpointConnectionInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of Domain. */
public interface Domain {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the privateEndpointConnections property: List of private endpoint connections.
     *
     * @return the privateEndpointConnections value.
     */
    List<PrivateEndpointConnection> privateEndpointConnections();

    /**
     * Gets the provisioningState property: Provisioning state of the domain.
     *
     * @return the provisioningState value.
     */
    DomainProvisioningState provisioningState();

    /**
     * Gets the endpoint property: Endpoint for the domain.
     *
     * @return the endpoint value.
     */
    String endpoint();

    /**
     * Gets the inputSchema property: This determines the format that Event Grid should expect for incoming events
     * published to the domain.
     *
     * @return the inputSchema value.
     */
    InputSchema inputSchema();

    /**
     * Gets the inputSchemaMapping property: Information about the InputSchemaMapping which specified the info about
     * mapping event payload.
     *
     * @return the inputSchemaMapping value.
     */
    InputSchemaMapping inputSchemaMapping();

    /**
     * Gets the metricResourceId property: Metric resource id for the domain.
     *
     * @return the metricResourceId value.
     */
    String metricResourceId();

    /**
     * Gets the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it
     * is enabled. You can further restrict to specific IPs by configuring &lt;seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.DomainProperties.InboundIpRules" /&gt;.
     *
     * @return the publicNetworkAccess value.
     */
    PublicNetworkAccess publicNetworkAccess();

    /**
     * Gets the inboundIpRules property: This can be used to restrict traffic from specific IPs instead of all IPs.
     * Note: These are considered only if PublicNetworkAccess is enabled.
     *
     * @return the inboundIpRules value.
     */
    List<InboundIpRule> inboundIpRules();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.eventgrid.fluent.models.DomainInner object.
     *
     * @return the inner object.
     */
    DomainInner innerModel();

    /** The entirety of the Domain definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The Domain definition stages. */
    interface DefinitionStages {
        /** The first stage of the Domain definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the Domain definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the Domain definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group within the user's subscription.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the Domain definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithPrivateEndpointConnections,
                DefinitionStages.WithInputSchema,
                DefinitionStages.WithInputSchemaMapping,
                DefinitionStages.WithPublicNetworkAccess,
                DefinitionStages.WithInboundIpRules {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Domain create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Domain create(Context context);
        }
        /** The stage of the Domain definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the Domain definition allowing to specify privateEndpointConnections. */
        interface WithPrivateEndpointConnections {
            /**
             * Specifies the privateEndpointConnections property: List of private endpoint connections..
             *
             * @param privateEndpointConnections List of private endpoint connections.
             * @return the next definition stage.
             */
            WithCreate withPrivateEndpointConnections(List<PrivateEndpointConnectionInner> privateEndpointConnections);
        }
        /** The stage of the Domain definition allowing to specify inputSchema. */
        interface WithInputSchema {
            /**
             * Specifies the inputSchema property: This determines the format that Event Grid should expect for incoming
             * events published to the domain..
             *
             * @param inputSchema This determines the format that Event Grid should expect for incoming events published
             *     to the domain.
             * @return the next definition stage.
             */
            WithCreate withInputSchema(InputSchema inputSchema);
        }
        /** The stage of the Domain definition allowing to specify inputSchemaMapping. */
        interface WithInputSchemaMapping {
            /**
             * Specifies the inputSchemaMapping property: Information about the InputSchemaMapping which specified the
             * info about mapping event payload..
             *
             * @param inputSchemaMapping Information about the InputSchemaMapping which specified the info about mapping
             *     event payload.
             * @return the next definition stage.
             */
            WithCreate withInputSchemaMapping(InputSchemaMapping inputSchemaMapping);
        }
        /** The stage of the Domain definition allowing to specify publicNetworkAccess. */
        interface WithPublicNetworkAccess {
            /**
             * Specifies the publicNetworkAccess property: This determines if traffic is allowed over public network. By
             * default it is enabled. You can further restrict to specific IPs by configuring &lt;seealso
             * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.DomainProperties.InboundIpRules" /&gt;.
             *
             * @param publicNetworkAccess This determines if traffic is allowed over public network. By default it is
             *     enabled. You can further restrict to specific IPs by configuring &lt;seealso
             *     cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.DomainProperties.InboundIpRules"
             *     /&gt;.
             * @return the next definition stage.
             */
            WithCreate withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess);
        }
        /** The stage of the Domain definition allowing to specify inboundIpRules. */
        interface WithInboundIpRules {
            /**
             * Specifies the inboundIpRules property: This can be used to restrict traffic from specific IPs instead of
             * all IPs. Note: These are considered only if PublicNetworkAccess is enabled..
             *
             * @param inboundIpRules This can be used to restrict traffic from specific IPs instead of all IPs. Note:
             *     These are considered only if PublicNetworkAccess is enabled.
             * @return the next definition stage.
             */
            WithCreate withInboundIpRules(List<InboundIpRule> inboundIpRules);
        }
    }
    /**
     * Begins update for the Domain resource.
     *
     * @return the stage of resource update.
     */
    Domain.Update update();

    /** The template for Domain update. */
    interface Update
        extends UpdateStages.WithTags, UpdateStages.WithPublicNetworkAccess, UpdateStages.WithInboundIpRules {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Domain apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Domain apply(Context context);
    }
    /** The Domain update stages. */
    interface UpdateStages {
        /** The stage of the Domain update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Tags of the domains resource..
             *
             * @param tags Tags of the domains resource.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the Domain update allowing to specify publicNetworkAccess. */
        interface WithPublicNetworkAccess {
            /**
             * Specifies the publicNetworkAccess property: This determines if traffic is allowed over public network. By
             * default it is enabled. You can further restrict to specific IPs by configuring &lt;seealso
             * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.DomainUpdateParameterProperties"
                 + ".InboundIpRules"
             * /&gt;.
             *
             * @param publicNetworkAccess This determines if traffic is allowed over public network. By default it is
             *     enabled. You can further restrict to specific IPs by configuring &lt;seealso
             *     cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.DomainUpdateParameterProperties"
                 + ".InboundIpRules"
             *     /&gt;.
             * @return the next definition stage.
             */
            Update withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess);
        }
        /** The stage of the Domain update allowing to specify inboundIpRules. */
        interface WithInboundIpRules {
            /**
             * Specifies the inboundIpRules property: This can be used to restrict traffic from specific IPs instead of
             * all IPs. Note: These are considered only if PublicNetworkAccess is enabled..
             *
             * @param inboundIpRules This can be used to restrict traffic from specific IPs instead of all IPs. Note:
             *     These are considered only if PublicNetworkAccess is enabled.
             * @return the next definition stage.
             */
            Update withInboundIpRules(List<InboundIpRule> inboundIpRules);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Domain refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Domain refresh(Context context);
}
