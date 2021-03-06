/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.compute.v2019_07_01.implementation.GalleryImageInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.compute.v2019_07_01.implementation.ComputeManager;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * Type representing GalleryImage.
 */
public interface GalleryImage extends HasInner<GalleryImageInner>, Indexable, Refreshable<GalleryImage>, Updatable<GalleryImage.Update>, HasManager<ComputeManager> {
    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the disallowed value.
     */
    Disallowed disallowed();

    /**
     * @return the endOfLifeDate value.
     */
    DateTime endOfLifeDate();

    /**
     * @return the eula value.
     */
    String eula();

    /**
     * @return the hyperVGeneration value.
     */
    HyperVGeneration hyperVGeneration();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the identifier value.
     */
    GalleryImageIdentifier identifier();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the osState value.
     */
    OperatingSystemStateTypes osState();

    /**
     * @return the osType value.
     */
    OperatingSystemTypes osType();

    /**
     * @return the privacyStatementUri value.
     */
    String privacyStatementUri();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the purchasePlan value.
     */
    ImagePurchasePlan purchasePlan();

    /**
     * @return the recommended value.
     */
    RecommendedMachineConfiguration recommended();

    /**
     * @return the releaseNoteUri value.
     */
    String releaseNoteUri();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the GalleryImage definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGallery, DefinitionStages.WithIdentifier, DefinitionStages.WithLocation, DefinitionStages.WithOsState, DefinitionStages.WithOsType, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of GalleryImage definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a GalleryImage definition.
         */
        interface Blank extends WithGallery {
        }

        /**
         * The stage of the galleryimage definition allowing to specify Gallery.
         */
        interface WithGallery {
           /**
            * Specifies resourceGroupName, galleryName.
            * @param resourceGroupName The name of the resource group
            * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be created
            * @return the next definition stage
            */
            WithIdentifier withExistingGallery(String resourceGroupName, String galleryName);
        }

        /**
         * The stage of the galleryimage definition allowing to specify Identifier.
         */
        interface WithIdentifier {
           /**
            * Specifies identifier.
            * @param identifier the identifier parameter value
            * @return the next definition stage
            */
            WithLocation withIdentifier(GalleryImageIdentifier identifier);
        }

        /**
         * The stage of the galleryimage definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            * @param location Resource location
            * @return the next definition stage
            */
            WithOsState withLocation(String location);
        }

        /**
         * The stage of the galleryimage definition allowing to specify OsState.
         */
        interface WithOsState {
           /**
            * Specifies osState.
            * @param osState This property allows the user to specify whether the virtual machines created under this image are 'Generalized' or 'Specialized'. Possible values include: 'Generalized', 'Specialized'
            * @return the next definition stage
            */
            WithOsType withOsState(OperatingSystemStateTypes osState);
        }

        /**
         * The stage of the galleryimage definition allowing to specify OsType.
         */
        interface WithOsType {
           /**
            * Specifies osType.
            * @param osType This property allows you to specify the type of the OS that is included in the disk when creating a VM from a managed image. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Windows** &lt;br&gt;&lt;br&gt; **Linux**. Possible values include: 'Windows', 'Linux'
            * @return the next definition stage
            */
            WithCreate withOsType(OperatingSystemTypes osType);
        }

        /**
         * The stage of the galleryimage definition allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description The description of this gallery Image Definition resource. This property is updatable
             * @return the next definition stage
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the galleryimage definition allowing to specify Disallowed.
         */
        interface WithDisallowed {
            /**
             * Specifies disallowed.
             * @param disallowed the disallowed parameter value
             * @return the next definition stage
             */
            WithCreate withDisallowed(Disallowed disallowed);
        }

        /**
         * The stage of the galleryimage definition allowing to specify EndOfLifeDate.
         */
        interface WithEndOfLifeDate {
            /**
             * Specifies endOfLifeDate.
             * @param endOfLifeDate The end of life date of the gallery Image Definition. This property can be used for decommissioning purposes. This property is updatable
             * @return the next definition stage
             */
            WithCreate withEndOfLifeDate(DateTime endOfLifeDate);
        }

        /**
         * The stage of the galleryimage definition allowing to specify Eula.
         */
        interface WithEula {
            /**
             * Specifies eula.
             * @param eula The Eula agreement for the gallery Image Definition
             * @return the next definition stage
             */
            WithCreate withEula(String eula);
        }

        /**
         * The stage of the galleryimage definition allowing to specify HyperVGeneration.
         */
        interface WithHyperVGeneration {
            /**
             * Specifies hyperVGeneration.
             * @param hyperVGeneration The hypervisor generation of the Virtual Machine. Applicable to OS disks only. Possible values include: 'V1', 'V2'
             * @return the next definition stage
             */
            WithCreate withHyperVGeneration(HyperVGeneration hyperVGeneration);
        }

        /**
         * The stage of the galleryimage definition allowing to specify PrivacyStatementUri.
         */
        interface WithPrivacyStatementUri {
            /**
             * Specifies privacyStatementUri.
             * @param privacyStatementUri The privacy statement uri
             * @return the next definition stage
             */
            WithCreate withPrivacyStatementUri(String privacyStatementUri);
        }

        /**
         * The stage of the galleryimage definition allowing to specify PurchasePlan.
         */
        interface WithPurchasePlan {
            /**
             * Specifies purchasePlan.
             * @param purchasePlan the purchasePlan parameter value
             * @return the next definition stage
             */
            WithCreate withPurchasePlan(ImagePurchasePlan purchasePlan);
        }

        /**
         * The stage of the galleryimage definition allowing to specify Recommended.
         */
        interface WithRecommended {
            /**
             * Specifies recommended.
             * @param recommended the recommended parameter value
             * @return the next definition stage
             */
            WithCreate withRecommended(RecommendedMachineConfiguration recommended);
        }

        /**
         * The stage of the galleryimage definition allowing to specify ReleaseNoteUri.
         */
        interface WithReleaseNoteUri {
            /**
             * Specifies releaseNoteUri.
             * @param releaseNoteUri The release note uri
             * @return the next definition stage
             */
            WithCreate withReleaseNoteUri(String releaseNoteUri);
        }

        /**
         * The stage of the galleryimage definition allowing to specify Tags.
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
        interface WithCreate extends Creatable<GalleryImage>, DefinitionStages.WithDescription, DefinitionStages.WithDisallowed, DefinitionStages.WithEndOfLifeDate, DefinitionStages.WithEula, DefinitionStages.WithHyperVGeneration, DefinitionStages.WithPrivacyStatementUri, DefinitionStages.WithPurchasePlan, DefinitionStages.WithRecommended, DefinitionStages.WithReleaseNoteUri, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a GalleryImage update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<GalleryImage>, UpdateStages.WithDescription, UpdateStages.WithDisallowed, UpdateStages.WithEndOfLifeDate, UpdateStages.WithEula, UpdateStages.WithHyperVGeneration, UpdateStages.WithPrivacyStatementUri, UpdateStages.WithPurchasePlan, UpdateStages.WithRecommended, UpdateStages.WithReleaseNoteUri, UpdateStages.WithTags {
    }

    /**
     * Grouping of GalleryImage update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the galleryimage update allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description The description of this gallery Image Definition resource. This property is updatable
             * @return the next update stage
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the galleryimage update allowing to specify Disallowed.
         */
        interface WithDisallowed {
            /**
             * Specifies disallowed.
             * @param disallowed the disallowed parameter value
             * @return the next update stage
             */
            Update withDisallowed(Disallowed disallowed);
        }

        /**
         * The stage of the galleryimage update allowing to specify EndOfLifeDate.
         */
        interface WithEndOfLifeDate {
            /**
             * Specifies endOfLifeDate.
             * @param endOfLifeDate The end of life date of the gallery Image Definition. This property can be used for decommissioning purposes. This property is updatable
             * @return the next update stage
             */
            Update withEndOfLifeDate(DateTime endOfLifeDate);
        }

        /**
         * The stage of the galleryimage update allowing to specify Eula.
         */
        interface WithEula {
            /**
             * Specifies eula.
             * @param eula The Eula agreement for the gallery Image Definition
             * @return the next update stage
             */
            Update withEula(String eula);
        }

        /**
         * The stage of the galleryimage update allowing to specify HyperVGeneration.
         */
        interface WithHyperVGeneration {
            /**
             * Specifies hyperVGeneration.
             * @param hyperVGeneration The hypervisor generation of the Virtual Machine. Applicable to OS disks only. Possible values include: 'V1', 'V2'
             * @return the next update stage
             */
            Update withHyperVGeneration(HyperVGeneration hyperVGeneration);
        }

        /**
         * The stage of the galleryimage update allowing to specify PrivacyStatementUri.
         */
        interface WithPrivacyStatementUri {
            /**
             * Specifies privacyStatementUri.
             * @param privacyStatementUri The privacy statement uri
             * @return the next update stage
             */
            Update withPrivacyStatementUri(String privacyStatementUri);
        }

        /**
         * The stage of the galleryimage update allowing to specify PurchasePlan.
         */
        interface WithPurchasePlan {
            /**
             * Specifies purchasePlan.
             * @param purchasePlan the purchasePlan parameter value
             * @return the next update stage
             */
            Update withPurchasePlan(ImagePurchasePlan purchasePlan);
        }

        /**
         * The stage of the galleryimage update allowing to specify Recommended.
         */
        interface WithRecommended {
            /**
             * Specifies recommended.
             * @param recommended the recommended parameter value
             * @return the next update stage
             */
            Update withRecommended(RecommendedMachineConfiguration recommended);
        }

        /**
         * The stage of the galleryimage update allowing to specify ReleaseNoteUri.
         */
        interface WithReleaseNoteUri {
            /**
             * Specifies releaseNoteUri.
             * @param releaseNoteUri The release note uri
             * @return the next update stage
             */
            Update withReleaseNoteUri(String releaseNoteUri);
        }

        /**
         * The stage of the galleryimage update allowing to specify Tags.
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
