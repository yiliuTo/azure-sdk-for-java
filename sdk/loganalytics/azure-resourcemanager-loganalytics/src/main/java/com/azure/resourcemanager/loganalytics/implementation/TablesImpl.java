// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.loganalytics.LogAnalyticsManager;
import com.azure.resourcemanager.loganalytics.fluent.TablesClient;
import com.azure.resourcemanager.loganalytics.fluent.models.TableInner;
import com.azure.resourcemanager.loganalytics.models.Table;
import com.azure.resourcemanager.loganalytics.models.Tables;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class TablesImpl implements Tables {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TablesImpl.class);

    private final TablesClient innerClient;

    private final LogAnalyticsManager serviceManager;

    public TablesImpl(TablesClient innerClient, LogAnalyticsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Table> listByWorkspace(String resourceGroupName, String workspaceName) {
        PagedIterable<TableInner> inner = this.serviceClient().listByWorkspace(resourceGroupName, workspaceName);
        return inner.mapPage(inner1 -> new TableImpl(inner1, this.manager()));
    }

    public PagedIterable<Table> listByWorkspace(String resourceGroupName, String workspaceName, Context context) {
        PagedIterable<TableInner> inner =
            this.serviceClient().listByWorkspace(resourceGroupName, workspaceName, context);
        return inner.mapPage(inner1 -> new TableImpl(inner1, this.manager()));
    }

    public Table update(String resourceGroupName, String workspaceName, String tableName, TableInner parameters) {
        TableInner inner = this.serviceClient().update(resourceGroupName, workspaceName, tableName, parameters);
        if (inner != null) {
            return new TableImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Table> updateWithResponse(
        String resourceGroupName, String workspaceName, String tableName, TableInner parameters, Context context) {
        Response<TableInner> inner =
            this.serviceClient().updateWithResponse(resourceGroupName, workspaceName, tableName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new TableImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Table get(String resourceGroupName, String workspaceName, String tableName) {
        TableInner inner = this.serviceClient().get(resourceGroupName, workspaceName, tableName);
        if (inner != null) {
            return new TableImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Table> getWithResponse(
        String resourceGroupName, String workspaceName, String tableName, Context context) {
        Response<TableInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, workspaceName, tableName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new TableImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private TablesClient serviceClient() {
        return this.innerClient;
    }

    private LogAnalyticsManager manager() {
        return this.serviceManager;
    }
}
