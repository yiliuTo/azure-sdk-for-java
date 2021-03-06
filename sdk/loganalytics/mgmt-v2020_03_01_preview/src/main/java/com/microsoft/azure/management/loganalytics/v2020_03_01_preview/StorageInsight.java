/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_03_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.implementation.StorageInsightInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.implementation.LogAnalyticsManager;
import java.util.List;
import java.util.Map;

/**
 * Type representing StorageInsight.
 */
public interface StorageInsight extends HasInner<StorageInsightInner>, Indexable, Refreshable<StorageInsight>, Updatable<StorageInsight.Update>, HasManager<LogAnalyticsManager> {
    /**
     * @return the containers value.
     */
    List<String> containers();

    /**
     * @return the eTag value.
     */
    String eTag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the status value.
     */
    StorageInsightStatus status();

    /**
     * @return the storageAccount value.
     */
    StorageAccount storageAccount();

    /**
     * @return the tables value.
     */
    List<String> tables();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the StorageInsight definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithWorkspace, DefinitionStages.WithStorageAccount, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of StorageInsight definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a StorageInsight definition.
         */
        interface Blank extends WithWorkspace {
        }

        /**
         * The stage of the storageinsight definition allowing to specify Workspace.
         */
        interface WithWorkspace {
           /**
            * Specifies resourceGroupName, workspaceName.
            * @param resourceGroupName The name of the resource group. The name is case insensitive
            * @param workspaceName The name of the workspace
            * @return the next definition stage
            */
            WithStorageAccount withExistingWorkspace(String resourceGroupName, String workspaceName);
        }

        /**
         * The stage of the storageinsight definition allowing to specify StorageAccount.
         */
        interface WithStorageAccount {
           /**
            * Specifies storageAccount.
            * @param storageAccount The storage account connection details
            * @return the next definition stage
            */
            WithCreate withStorageAccount(StorageAccount storageAccount);
        }

        /**
         * The stage of the storageinsight definition allowing to specify Containers.
         */
        interface WithContainers {
            /**
             * Specifies containers.
             * @param containers The names of the blob containers that the workspace should read
             * @return the next definition stage
             */
            WithCreate withContainers(List<String> containers);
        }

        /**
         * The stage of the storageinsight definition allowing to specify ETag.
         */
        interface WithETag {
            /**
             * Specifies eTag.
             * @param eTag The ETag of the storage insight
             * @return the next definition stage
             */
            WithCreate withETag(String eTag);
        }

        /**
         * The stage of the storageinsight definition allowing to specify Tables.
         */
        interface WithTables {
            /**
             * Specifies tables.
             * @param tables The names of the Azure tables that the workspace should read
             * @return the next definition stage
             */
            WithCreate withTables(List<String> tables);
        }

        /**
         * The stage of the storageinsight definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<StorageInsight>, DefinitionStages.WithContainers, DefinitionStages.WithETag, DefinitionStages.WithTables, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a StorageInsight update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<StorageInsight>, UpdateStages.WithContainers, UpdateStages.WithETag, UpdateStages.WithTables, UpdateStages.WithTags {
    }

    /**
     * Grouping of StorageInsight update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the storageinsight update allowing to specify Containers.
         */
        interface WithContainers {
            /**
             * Specifies containers.
             * @param containers The names of the blob containers that the workspace should read
             * @return the next update stage
             */
            Update withContainers(List<String> containers);
        }

        /**
         * The stage of the storageinsight update allowing to specify ETag.
         */
        interface WithETag {
            /**
             * Specifies eTag.
             * @param eTag The ETag of the storage insight
             * @return the next update stage
             */
            Update withETag(String eTag);
        }

        /**
         * The stage of the storageinsight update allowing to specify Tables.
         */
        interface WithTables {
            /**
             * Specifies tables.
             * @param tables The names of the Azure tables that the workspace should read
             * @return the next update stage
             */
            Update withTables(List<String> tables);
        }

        /**
         * The stage of the storageinsight update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

    }
}
