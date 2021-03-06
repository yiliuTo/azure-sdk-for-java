/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_08_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.databoxedge.v2019_08_01.DataBoxEdgeDevice;
import rx.Observable;
import com.microsoft.azure.management.databoxedge.v2019_08_01.DataBoxEdgeDeviceStatus;
import com.microsoft.azure.management.databoxedge.v2019_08_01.DeviceType;
import java.util.List;
import com.microsoft.azure.management.databoxedge.v2019_08_01.RoleTypes;

class DataBoxEdgeDeviceImpl extends GroupableResourceCoreImpl<DataBoxEdgeDevice, DataBoxEdgeDeviceInner, DataBoxEdgeDeviceImpl, DataBoxEdgeManager> implements DataBoxEdgeDevice, DataBoxEdgeDevice.Definition, DataBoxEdgeDevice.Update {
    DataBoxEdgeDeviceImpl(String name, DataBoxEdgeDeviceInner inner, DataBoxEdgeManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<DataBoxEdgeDevice> createResourceAsync() {
        DevicesInner client = this.manager().inner().devices();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<DataBoxEdgeDevice> updateResourceAsync() {
        DevicesInner client = this.manager().inner().devices();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<DataBoxEdgeDeviceInner> getInnerAsync() {
        DevicesInner client = this.manager().inner().devices();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public List<RoleTypes> configuredRoleTypes() {
        return this.inner().configuredRoleTypes();
    }

    @Override
    public String culture() {
        return this.inner().culture();
    }

    @Override
    public DataBoxEdgeDeviceStatus dataBoxEdgeDeviceStatus() {
        return this.inner().dataBoxEdgeDeviceStatus();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String deviceHcsVersion() {
        return this.inner().deviceHcsVersion();
    }

    @Override
    public Long deviceLocalCapacity() {
        return this.inner().deviceLocalCapacity();
    }

    @Override
    public String deviceModel() {
        return this.inner().deviceModel();
    }

    @Override
    public String deviceSoftwareVersion() {
        return this.inner().deviceSoftwareVersion();
    }

    @Override
    public DeviceType deviceType() {
        return this.inner().deviceType();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String friendlyName() {
        return this.inner().friendlyName();
    }

    @Override
    public String modelDescription() {
        return this.inner().modelDescription();
    }

    @Override
    public Integer nodeCount() {
        return this.inner().nodeCount();
    }

    @Override
    public String serialNumber() {
        return this.inner().serialNumber();
    }

    @Override
    public SkuInner sku() {
        return this.inner().sku();
    }

    @Override
    public String timeZone() {
        return this.inner().timeZone();
    }

    @Override
    public DataBoxEdgeDeviceImpl withDataBoxEdgeDeviceStatus(DataBoxEdgeDeviceStatus dataBoxEdgeDeviceStatus) {
        this.inner().withDataBoxEdgeDeviceStatus(dataBoxEdgeDeviceStatus);
        return this;
    }

    @Override
    public DataBoxEdgeDeviceImpl withDescription(String description) {
        this.inner().withDescription(description);
        return this;
    }

    @Override
    public DataBoxEdgeDeviceImpl withEtag(String etag) {
        this.inner().withEtag(etag);
        return this;
    }

    @Override
    public DataBoxEdgeDeviceImpl withFriendlyName(String friendlyName) {
        this.inner().withFriendlyName(friendlyName);
        return this;
    }

    @Override
    public DataBoxEdgeDeviceImpl withModelDescription(String modelDescription) {
        this.inner().withModelDescription(modelDescription);
        return this;
    }

    @Override
    public DataBoxEdgeDeviceImpl withSku(SkuInner sku) {
        this.inner().withSku(sku);
        return this;
    }

}
