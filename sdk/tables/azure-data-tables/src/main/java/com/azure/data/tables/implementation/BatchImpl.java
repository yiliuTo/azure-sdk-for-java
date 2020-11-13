// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.data.tables.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.data.tables.implementation.models.BatchRequestBody;
import com.azure.data.tables.implementation.models.BatchSubmitBatchResponse;
import com.azure.data.tables.implementation.models.TableServiceErrorException;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Batch. */
public final class BatchImpl {
    /** The proxy service used to perform REST calls. */
    private final BatchService service;

    /** The service client containing this operation class. */
    private final AzureTableImpl client;

    /**
     * Initializes an instance of BatchImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public BatchImpl(AzureTableImpl client, SerializerAdapter serializerAdapter) {
        this.service = RestProxy.create(BatchService.class, client.getHttpPipeline(), serializerAdapter);
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureTableBatch to be used by the proxy service to perform REST
     * calls.
     */
    @Host("{url}")
    @ServiceInterface(name = "AzureTableServices")
    private interface BatchService {
        @Post("/$batch")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(TableServiceErrorException.class)
        Mono<BatchSubmitBatchResponse> submitBatch(
            @HostParam("url") String url,
            @HeaderParam("Content-Type") String multipartContentType,
            @HeaderParam("x-ms-version") String version,
            @HeaderParam("x-ms-client-request-id") String requestId,
            @HeaderParam("DataServiceVersion") String dataServiceVersion,
            @BodyParam("multipart/mixed") BatchRequestBody body,
            Context context);
    }

    /**
     * The Batch operation allows multiple API calls to be embedded into a single HTTP request.
     *
     * @param body Initial data.
     * @param requestId Provides a client-generated, opaque value with a 1 KB character limit that is recorded in the
     *                  analytics logs when storage analytics logging is enabled.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BatchSubmitBatchResponse> submitBatchWithRestResponseAsync(
        BatchRequestBody body,
        String requestId,
        Context context
    ) {
        final String dataServiceVersion = "3.0";
        return service.submitBatch(this.client.getUrl(), body.getContentType(), this.client.getVersion(), requestId,
            dataServiceVersion, body, context);
    }
}