// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.implementation;

import com.azure.resourcemanager.hdinsight.HDInsightManager;
import com.azure.resourcemanager.hdinsight.fluent.models.ExtensionInner;
import com.azure.resourcemanager.hdinsight.models.Extension;

public final class ExtensionImpl implements Extension {
    private ExtensionInner innerObject;

    private final HDInsightManager serviceManager;

    ExtensionImpl(ExtensionInner innerObject, HDInsightManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String workspaceId() {
        return this.innerModel().workspaceId();
    }

    public String primaryKey() {
        return this.innerModel().primaryKey();
    }

    public ExtensionInner innerModel() {
        return this.innerObject;
    }

    private HDInsightManager manager() {
        return this.serviceManager;
    }
}
