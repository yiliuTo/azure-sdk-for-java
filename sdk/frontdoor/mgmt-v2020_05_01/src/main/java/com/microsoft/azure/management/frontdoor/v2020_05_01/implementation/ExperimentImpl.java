/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.frontdoor.v2020_05_01.implementation;

import com.microsoft.azure.management.frontdoor.v2020_05_01.Experiment;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.frontdoor.v2020_05_01.ExperimentUpdateModel;
import java.util.Map;
import com.microsoft.azure.management.frontdoor.v2020_05_01.State;
import com.microsoft.azure.management.frontdoor.v2020_05_01.NetworkExperimentResourceState;
import rx.functions.Func1;

class ExperimentImpl extends CreatableUpdatableImpl<Experiment, ExperimentInner, ExperimentImpl> implements Experiment, Experiment.Definition, Experiment.Update {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String profileName;
    private String experimentName;
    private ExperimentUpdateModel updateParameter;

    ExperimentImpl(String name, NetworkManager manager) {
        super(name, new ExperimentInner());
        this.manager = manager;
        // Set resource name
        this.experimentName = name;
        //
        this.updateParameter = new ExperimentUpdateModel();
    }

    ExperimentImpl(ExperimentInner inner, NetworkManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.experimentName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.profileName = IdParsingUtils.getValueFromIdByName(inner.id(), "NetworkExperimentProfiles");
        this.experimentName = IdParsingUtils.getValueFromIdByName(inner.id(), "Experiments");
        //
        this.updateParameter = new ExperimentUpdateModel();
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Experiment> createResourceAsync() {
        ExperimentsInner client = this.manager().inner().experiments();
        return client.createOrUpdateAsync(this.resourceGroupName, this.profileName, this.experimentName, this.inner())
            .map(new Func1<ExperimentInner, ExperimentInner>() {
               @Override
               public ExperimentInner call(ExperimentInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Experiment> updateResourceAsync() {
        ExperimentsInner client = this.manager().inner().experiments();
        return client.updateAsync(this.resourceGroupName, this.profileName, this.experimentName, this.updateParameter)
            .map(new Func1<ExperimentInner, ExperimentInner>() {
               @Override
               public ExperimentInner call(ExperimentInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ExperimentInner> getInnerAsync() {
        ExperimentsInner client = this.manager().inner().experiments();
        return client.getAsync(this.resourceGroupName, this.profileName, this.experimentName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new ExperimentUpdateModel();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public State enabledState() {
        return this.inner().enabledState();
    }

    @Override
    public EndpointInner endpointA() {
        return this.inner().endpointA();
    }

    @Override
    public EndpointInner endpointB() {
        return this.inner().endpointB();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public NetworkExperimentResourceState resourceState() {
        return this.inner().resourceState();
    }

    @Override
    public String scriptFileUri() {
        return this.inner().scriptFileUri();
    }

    @Override
    public String status() {
        return this.inner().status();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ExperimentImpl withExistingNetworkExperimentProfile(String resourceGroupName, String profileName) {
        this.resourceGroupName = resourceGroupName;
        this.profileName = profileName;
        return this;
    }

    @Override
    public ExperimentImpl withEndpointA(EndpointInner endpointA) {
        this.inner().withEndpointA(endpointA);
        return this;
    }

    @Override
    public ExperimentImpl withEndpointB(EndpointInner endpointB) {
        this.inner().withEndpointB(endpointB);
        return this;
    }

    @Override
    public ExperimentImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public ExperimentImpl withResourceState(NetworkExperimentResourceState resourceState) {
        this.inner().withResourceState(resourceState);
        return this;
    }

    @Override
    public ExperimentImpl withDescription(String description) {
        if (isInCreateMode()) {
            this.inner().withDescription(description);
        } else {
            this.updateParameter.withDescription(description);
        }
        return this;
    }

    @Override
    public ExperimentImpl withEnabledState(State enabledState) {
        if (isInCreateMode()) {
            this.inner().withEnabledState(enabledState);
        } else {
            this.updateParameter.withEnabledState(enabledState);
        }
        return this;
    }

    @Override
    public ExperimentImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.inner().withTags(tags);
        } else {
            this.updateParameter.withTags(tags);
        }
        return this;
    }

}
