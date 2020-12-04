/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01.implementation;

import com.microsoft.azure.management.cdn.v2020_09_01.OriginGroup;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.cdn.v2020_09_01.OriginGroupUpdateParameters;
import java.util.List;
import com.microsoft.azure.management.cdn.v2020_09_01.SystemData;
import com.microsoft.azure.management.cdn.v2020_09_01.HealthProbeParameters;
import com.microsoft.azure.management.cdn.v2020_09_01.ResourceReference;
import com.microsoft.azure.management.cdn.v2020_09_01.ResponseBasedOriginErrorDetectionParameters;
import com.microsoft.azure.management.cdn.v2020_09_01.OriginGroupResourceState;
import rx.functions.Func1;

class OriginGroupImpl extends CreatableUpdatableImpl<OriginGroup, OriginGroupInner, OriginGroupImpl> implements OriginGroup, OriginGroup.Definition, OriginGroup.Update {
    private final CdnManager manager;
    private String resourceGroupName;
    private String profileName;
    private String endpointName;
    private String originGroupName;
    private OriginGroupUpdateParameters updateParameter;

    OriginGroupImpl(String name, CdnManager manager) {
        super(name, new OriginGroupInner());
        this.manager = manager;
        // Set resource name
        this.originGroupName = name;
        //
        this.updateParameter = new OriginGroupUpdateParameters();
    }

    OriginGroupImpl(OriginGroupInner inner, CdnManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.originGroupName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.profileName = IdParsingUtils.getValueFromIdByName(inner.id(), "profiles");
        this.endpointName = IdParsingUtils.getValueFromIdByName(inner.id(), "endpoints");
        this.originGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "originGroups");
        //
        this.updateParameter = new OriginGroupUpdateParameters();
    }

    @Override
    public CdnManager manager() {
        return this.manager;
    }

    @Override
    public Observable<OriginGroup> createResourceAsync() {
        OriginGroupsInner client = this.manager().inner().originGroups();
        return client.createAsync(this.resourceGroupName, this.profileName, this.endpointName, this.originGroupName, this.inner())
            .map(new Func1<OriginGroupInner, OriginGroupInner>() {
               @Override
               public OriginGroupInner call(OriginGroupInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<OriginGroup> updateResourceAsync() {
        OriginGroupsInner client = this.manager().inner().originGroups();
        return client.updateAsync(this.resourceGroupName, this.profileName, this.endpointName, this.originGroupName, this.updateParameter)
            .map(new Func1<OriginGroupInner, OriginGroupInner>() {
               @Override
               public OriginGroupInner call(OriginGroupInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<OriginGroupInner> getInnerAsync() {
        OriginGroupsInner client = this.manager().inner().originGroups();
        return client.getAsync(this.resourceGroupName, this.profileName, this.endpointName, this.originGroupName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new OriginGroupUpdateParameters();
    }

    @Override
    public HealthProbeParameters healthProbeSettings() {
        return this.inner().healthProbeSettings();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public List<ResourceReference> origins() {
        return this.inner().origins();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public OriginGroupResourceState resourceState() {
        return this.inner().resourceState();
    }

    @Override
    public ResponseBasedOriginErrorDetectionParameters responseBasedOriginErrorDetectionSettings() {
        return this.inner().responseBasedOriginErrorDetectionSettings();
    }

    @Override
    public SystemData systemData() {
        return this.inner().systemData();
    }

    @Override
    public Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes() {
        return this.inner().trafficRestorationTimeToHealedOrNewEndpointsInMinutes();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public OriginGroupImpl withExistingEndpoint(String resourceGroupName, String profileName, String endpointName) {
        this.resourceGroupName = resourceGroupName;
        this.profileName = profileName;
        this.endpointName = endpointName;
        return this;
    }

    @Override
    public OriginGroupImpl withHealthProbeSettings(HealthProbeParameters healthProbeSettings) {
        if (isInCreateMode()) {
            this.inner().withHealthProbeSettings(healthProbeSettings);
        } else {
            this.updateParameter.withHealthProbeSettings(healthProbeSettings);
        }
        return this;
    }

    @Override
    public OriginGroupImpl withOrigins(List<ResourceReference> origins) {
        if (isInCreateMode()) {
            this.inner().withOrigins(origins);
        } else {
            this.updateParameter.withOrigins(origins);
        }
        return this;
    }

    @Override
    public OriginGroupImpl withResponseBasedOriginErrorDetectionSettings(ResponseBasedOriginErrorDetectionParameters responseBasedOriginErrorDetectionSettings) {
        if (isInCreateMode()) {
            this.inner().withResponseBasedOriginErrorDetectionSettings(responseBasedOriginErrorDetectionSettings);
        } else {
            this.updateParameter.withResponseBasedOriginErrorDetectionSettings(responseBasedOriginErrorDetectionSettings);
        }
        return this;
    }

    @Override
    public OriginGroupImpl withTrafficRestorationTimeToHealedOrNewEndpointsInMinutes(Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes) {
        if (isInCreateMode()) {
            this.inner().withTrafficRestorationTimeToHealedOrNewEndpointsInMinutes(trafficRestorationTimeToHealedOrNewEndpointsInMinutes);
        } else {
            this.updateParameter.withTrafficRestorationTimeToHealedOrNewEndpointsInMinutes(trafficRestorationTimeToHealedOrNewEndpointsInMinutes);
        }
        return this;
    }

}