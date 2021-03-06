/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_12_01.implementation;

import com.microsoft.azure.management.containerservice.v2020_12_01.PrivateLinkResource;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class PrivateLinkResourceImpl extends WrapperImpl<PrivateLinkResourceInner> implements PrivateLinkResource {
    private final ContainerServiceManager manager;
    PrivateLinkResourceImpl(PrivateLinkResourceInner inner, ContainerServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ContainerServiceManager manager() {
        return this.manager;
    }

    @Override
    public String groupId() {
        return this.inner().groupId();
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
    public String privateLinkServiceID() {
        return this.inner().privateLinkServiceID();
    }

    @Override
    public List<String> requiredMembers() {
        return this.inner().requiredMembers();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
