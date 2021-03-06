/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.Policies;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.Policy;

class PoliciesImpl extends WrapperImpl<PoliciesInner> implements Policies {
    private final DevTestLabsManager manager;

    PoliciesImpl(DevTestLabsManager manager) {
        super(manager.inner().policies());
        this.manager = manager;
    }

    public DevTestLabsManager manager() {
        return this.manager;
    }

    @Override
    public PolicyImpl define(String name) {
        return wrapModel(name);
    }

    private PolicyImpl wrapModel(PolicyInner inner) {
        return  new PolicyImpl(inner, manager());
    }

    private PolicyImpl wrapModel(String name) {
        return new PolicyImpl(name, this.manager());
    }

    @Override
    public Observable<Policy> listAsync(final String resourceGroupName, final String labName, final String policySetName) {
        PoliciesInner client = this.inner();
        return client.listAsync(resourceGroupName, labName, policySetName)
        .flatMapIterable(new Func1<Page<PolicyInner>, Iterable<PolicyInner>>() {
            @Override
            public Iterable<PolicyInner> call(Page<PolicyInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PolicyInner, Policy>() {
            @Override
            public Policy call(PolicyInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Policy> getAsync(String resourceGroupName, String labName, String policySetName, String name) {
        PoliciesInner client = this.inner();
        return client.getAsync(resourceGroupName, labName, policySetName, name)
        .flatMap(new Func1<PolicyInner, Observable<Policy>>() {
            @Override
            public Observable<Policy> call(PolicyInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((Policy)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String labName, String policySetName, String name) {
        PoliciesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, labName, policySetName, name).toCompletable();
    }

}
