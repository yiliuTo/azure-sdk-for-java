/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01.implementation;

import com.microsoft.azure.management.cdn.v2020_09_01.AFDOriginGroup;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.cdn.v2020_09_01.AFDOriginGroupUpdateParameters;
import com.microsoft.azure.management.cdn.v2020_09_01.SystemData;
import com.microsoft.azure.management.cdn.v2020_09_01.LoadBalancingSettingsParameters;
import com.microsoft.azure.management.cdn.v2020_09_01.HealthProbeParameters;
import com.microsoft.azure.management.cdn.v2020_09_01.ResponseBasedOriginErrorDetectionParameters;
import com.microsoft.azure.management.cdn.v2020_09_01.EnabledState;
import com.microsoft.azure.management.cdn.v2020_09_01.AfdProvisioningState;
import com.microsoft.azure.management.cdn.v2020_09_01.DeploymentStatus;
import rx.functions.Func1;

class AFDOriginGroupImpl extends CreatableUpdatableImpl<AFDOriginGroup, AFDOriginGroupInner, AFDOriginGroupImpl> implements AFDOriginGroup, AFDOriginGroup.Definition, AFDOriginGroup.Update {
    private final CdnManager manager;
    private String resourceGroupName;
    private String profileName;
    private String originGroupName;
    private AFDOriginGroupUpdateParameters updateParameter;

    AFDOriginGroupImpl(String name, CdnManager manager) {
        super(name, new AFDOriginGroupInner());
        this.manager = manager;
        // Set resource name
        this.originGroupName = name;
        //
        this.updateParameter = new AFDOriginGroupUpdateParameters();
    }

    AFDOriginGroupImpl(AFDOriginGroupInner inner, CdnManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.originGroupName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.profileName = IdParsingUtils.getValueFromIdByName(inner.id(), "profiles");
        this.originGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "originGroups");
        //
        this.updateParameter = new AFDOriginGroupUpdateParameters();
    }

    @Override
    public CdnManager manager() {
        return this.manager;
    }

    @Override
    public Observable<AFDOriginGroup> createResourceAsync() {
        AFDOriginGroupsInner client = this.manager().inner().aFDOriginGroups();
        return client.createAsync(this.resourceGroupName, this.profileName, this.originGroupName, this.inner())
            .map(new Func1<AFDOriginGroupInner, AFDOriginGroupInner>() {
               @Override
               public AFDOriginGroupInner call(AFDOriginGroupInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<AFDOriginGroup> updateResourceAsync() {
        AFDOriginGroupsInner client = this.manager().inner().aFDOriginGroups();
        return client.updateAsync(this.resourceGroupName, this.profileName, this.originGroupName, this.updateParameter)
            .map(new Func1<AFDOriginGroupInner, AFDOriginGroupInner>() {
               @Override
               public AFDOriginGroupInner call(AFDOriginGroupInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<AFDOriginGroupInner> getInnerAsync() {
        AFDOriginGroupsInner client = this.manager().inner().aFDOriginGroups();
        return client.getAsync(this.resourceGroupName, this.profileName, this.originGroupName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new AFDOriginGroupUpdateParameters();
    }

    @Override
    public DeploymentStatus deploymentStatus() {
        return this.inner().deploymentStatus();
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
    public LoadBalancingSettingsParameters loadBalancingSettings() {
        return this.inner().loadBalancingSettings();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public AfdProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public ResponseBasedOriginErrorDetectionParameters responseBasedAfdOriginErrorDetectionSettings() {
        return this.inner().responseBasedAfdOriginErrorDetectionSettings();
    }

    @Override
    public EnabledState sessionAffinityState() {
        return this.inner().sessionAffinityState();
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
    public AFDOriginGroupImpl withExistingProfile(String resourceGroupName, String profileName) {
        this.resourceGroupName = resourceGroupName;
        this.profileName = profileName;
        return this;
    }

    @Override
    public AFDOriginGroupImpl withHealthProbeSettings(HealthProbeParameters healthProbeSettings) {
        if (isInCreateMode()) {
            this.inner().withHealthProbeSettings(healthProbeSettings);
        } else {
            this.updateParameter.withHealthProbeSettings(healthProbeSettings);
        }
        return this;
    }

    @Override
    public AFDOriginGroupImpl withLoadBalancingSettings(LoadBalancingSettingsParameters loadBalancingSettings) {
        if (isInCreateMode()) {
            this.inner().withLoadBalancingSettings(loadBalancingSettings);
        } else {
            this.updateParameter.withLoadBalancingSettings(loadBalancingSettings);
        }
        return this;
    }

    @Override
    public AFDOriginGroupImpl withResponseBasedAfdOriginErrorDetectionSettings(ResponseBasedOriginErrorDetectionParameters responseBasedAfdOriginErrorDetectionSettings) {
        if (isInCreateMode()) {
            this.inner().withResponseBasedAfdOriginErrorDetectionSettings(responseBasedAfdOriginErrorDetectionSettings);
        } else {
            this.updateParameter.withResponseBasedAfdOriginErrorDetectionSettings(responseBasedAfdOriginErrorDetectionSettings);
        }
        return this;
    }

    @Override
    public AFDOriginGroupImpl withSessionAffinityState(EnabledState sessionAffinityState) {
        if (isInCreateMode()) {
            this.inner().withSessionAffinityState(sessionAffinityState);
        } else {
            this.updateParameter.withSessionAffinityState(sessionAffinityState);
        }
        return this;
    }

    @Override
    public AFDOriginGroupImpl withTrafficRestorationTimeToHealedOrNewEndpointsInMinutes(Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes) {
        if (isInCreateMode()) {
            this.inner().withTrafficRestorationTimeToHealedOrNewEndpointsInMinutes(trafficRestorationTimeToHealedOrNewEndpointsInMinutes);
        } else {
            this.updateParameter.withTrafficRestorationTimeToHealedOrNewEndpointsInMinutes(trafficRestorationTimeToHealedOrNewEndpointsInMinutes);
        }
        return this;
    }

}