// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.netapp.fluent.models.CapacityPoolInner;
import java.util.Map;

/** An immutable client-side representation of CapacityPool. */
public interface CapacityPool {
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
     * Gets the poolId property: UUID v4 used to identify the Pool.
     *
     * @return the poolId value.
     */
    String poolId();

    /**
     * Gets the size property: Provisioned size of the pool (in bytes). Allowed values are in 4TiB chunks (value must be
     * multiply of 4398046511104).
     *
     * @return the size value.
     */
    long size();

    /**
     * Gets the serviceLevel property: The service level of the file system.
     *
     * @return the serviceLevel value.
     */
    ServiceLevel serviceLevel();

    /**
     * Gets the provisioningState property: Azure lifecycle management.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the totalThroughputMibps property: Total throughput of pool in Mibps.
     *
     * @return the totalThroughputMibps value.
     */
    Float totalThroughputMibps();

    /**
     * Gets the utilizedThroughputMibps property: Utilized throughput of pool in Mibps.
     *
     * @return the utilizedThroughputMibps value.
     */
    Float utilizedThroughputMibps();

    /**
     * Gets the qosType property: The qos type of the pool.
     *
     * @return the qosType value.
     */
    QosType qosType();

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
     * Gets the inner com.azure.resourcemanager.netapp.fluent.models.CapacityPoolInner object.
     *
     * @return the inner object.
     */
    CapacityPoolInner innerModel();

    /** The entirety of the CapacityPool definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithSize,
            DefinitionStages.WithServiceLevel,
            DefinitionStages.WithCreate {
    }
    /** The CapacityPool definition stages. */
    interface DefinitionStages {
        /** The first stage of the CapacityPool definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the CapacityPool definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }
        /** The stage of the CapacityPool definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, accountName.
             *
             * @param resourceGroupName The name of the resource group.
             * @param accountName The name of the NetApp account.
             * @return the next definition stage.
             */
            WithSize withExistingNetAppAccount(String resourceGroupName, String accountName);
        }
        /** The stage of the CapacityPool definition allowing to specify size. */
        interface WithSize {
            /**
             * Specifies the size property: Provisioned size of the pool (in bytes). Allowed values are in 4TiB chunks
             * (value must be multiply of 4398046511104)..
             *
             * @param size Provisioned size of the pool (in bytes). Allowed values are in 4TiB chunks (value must be
             *     multiply of 4398046511104).
             * @return the next definition stage.
             */
            WithServiceLevel withSize(long size);
        }
        /** The stage of the CapacityPool definition allowing to specify serviceLevel. */
        interface WithServiceLevel {
            /**
             * Specifies the serviceLevel property: The service level of the file system.
             *
             * @param serviceLevel The service level of the file system.
             * @return the next definition stage.
             */
            WithCreate withServiceLevel(ServiceLevel serviceLevel);
        }
        /**
         * The stage of the CapacityPool definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithQosType {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            CapacityPool create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            CapacityPool create(Context context);
        }
        /** The stage of the CapacityPool definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the CapacityPool definition allowing to specify qosType. */
        interface WithQosType {
            /**
             * Specifies the qosType property: The qos type of the pool.
             *
             * @param qosType The qos type of the pool.
             * @return the next definition stage.
             */
            WithCreate withQosType(QosType qosType);
        }
    }
    /**
     * Begins update for the CapacityPool resource.
     *
     * @return the stage of resource update.
     */
    CapacityPool.Update update();

    /** The template for CapacityPool update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithSize, UpdateStages.WithQosType {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        CapacityPool apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        CapacityPool apply(Context context);
    }
    /** The CapacityPool update stages. */
    interface UpdateStages {
        /** The stage of the CapacityPool update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the CapacityPool update allowing to specify size. */
        interface WithSize {
            /**
             * Specifies the size property: Provisioned size of the pool (in bytes). Allowed values are in 4TiB chunks
             * (value must be multiply of 4398046511104)..
             *
             * @param size Provisioned size of the pool (in bytes). Allowed values are in 4TiB chunks (value must be
             *     multiply of 4398046511104).
             * @return the next definition stage.
             */
            Update withSize(Long size);
        }
        /** The stage of the CapacityPool update allowing to specify qosType. */
        interface WithQosType {
            /**
             * Specifies the qosType property: The qos type of the pool.
             *
             * @param qosType The qos type of the pool.
             * @return the next definition stage.
             */
            Update withQosType(QosType qosType);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    CapacityPool refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    CapacityPool refresh(Context context);
}
