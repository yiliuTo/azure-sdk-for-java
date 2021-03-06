/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.cdn.v2020_09_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.cdn.v2020_09_01.Validates;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.cdn.v2020_09_01.ValidateSecretOutput;
import com.microsoft.azure.management.cdn.v2020_09_01.ValidateSecretInput;

class ValidatesImpl extends WrapperImpl<ValidatesInner> implements Validates {
    private final CdnManager manager;

    ValidatesImpl(CdnManager manager) {
        super(manager.inner().validates());
        this.manager = manager;
    }

    public CdnManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ValidateSecretOutput> secretMethodAsync(ValidateSecretInput validateSecretInput) {
        ValidatesInner client = this.inner();
        return client.secretMethodAsync(validateSecretInput)
        .map(new Func1<ValidateSecretOutputInner, ValidateSecretOutput>() {
            @Override
            public ValidateSecretOutput call(ValidateSecretOutputInner inner) {
                return new ValidateSecretOutputImpl(inner, manager());
            }
        });
    }

}
