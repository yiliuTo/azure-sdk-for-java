/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.commerce.v2015_06_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.commerce.v2015_06_01_preview.ErrorResponseException;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in RateCards.
 */
public class RateCardsInner {
    /** The Retrofit service to perform REST calls. */
    private RateCardsService service;
    /** The service client containing this operation class. */
    private UsageManagementClientImpl client;

    /**
     * Initializes an instance of RateCardsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public RateCardsInner(Retrofit retrofit, UsageManagementClientImpl client) {
        this.service = retrofit.create(RateCardsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for RateCards to be
     * used by Retrofit to perform actually REST calls.
     */
    interface RateCardsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.commerce.v2015_06_01_preview.RateCards list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Commerce/RateCard")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Query("$filter") String filter, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Enables you to query for the resource/meter metadata and related prices used in a given subscription by Offer ID, Currency, Locale and Region. The metadata associated with the billing meters, including but not limited to service names, types, resources, units of measure, and regions, is subject to change at any time and without notice. If you intend to use this billing data in an automated fashion, please use the billing meter GUID to uniquely identify each billable item. If the billing meter GUID is scheduled to change due to a new billing model, you will be notified in advance of the change.
     *
     * @param filter The filter to apply on the operation. It ONLY supports the 'eq' and 'and' logical operators at this time. All the 4 query parameters 'OfferDurableId',  'Currency', 'Locale', 'Region' are required to be a part of the $filter.
     * @return the PagedList<OfferTermInfoInner> object if successful.
     */
    public PagedList<OfferTermInfoInner> list(String filter) {
        PageImpl1<OfferTermInfoInner> page = new PageImpl1<>();
        page.setItems(listWithServiceResponseAsync(filter).toBlocking().single().body());
        page.setNextPageLink(null);
        return new PagedList<OfferTermInfoInner>(page) {
            @Override
            public Page<OfferTermInfoInner> nextPage(String nextPageLink) {
                return null;
            }
        };
    }

    /**
     * Enables you to query for the resource/meter metadata and related prices used in a given subscription by Offer ID, Currency, Locale and Region. The metadata associated with the billing meters, including but not limited to service names, types, resources, units of measure, and regions, is subject to change at any time and without notice. If you intend to use this billing data in an automated fashion, please use the billing meter GUID to uniquely identify each billable item. If the billing meter GUID is scheduled to change due to a new billing model, you will be notified in advance of the change.
     *
     * @param filter The filter to apply on the operation. It ONLY supports the 'eq' and 'and' logical operators at this time. All the 4 query parameters 'OfferDurableId',  'Currency', 'Locale', 'Region' are required to be a part of the $filter.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<OfferTermInfoInner>> listAsync(String filter, final ServiceCallback<List<OfferTermInfoInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(filter), serviceCallback);
    }

    /**
     * Enables you to query for the resource/meter metadata and related prices used in a given subscription by Offer ID, Currency, Locale and Region. The metadata associated with the billing meters, including but not limited to service names, types, resources, units of measure, and regions, is subject to change at any time and without notice. If you intend to use this billing data in an automated fashion, please use the billing meter GUID to uniquely identify each billable item. If the billing meter GUID is scheduled to change due to a new billing model, you will be notified in advance of the change.
     *
     * @param filter The filter to apply on the operation. It ONLY supports the 'eq' and 'and' logical operators at this time. All the 4 query parameters 'OfferDurableId',  'Currency', 'Locale', 'Region' are required to be a part of the $filter.
     * @return the observable to the List&lt;OfferTermInfoInner&gt; object
     */
    public Observable<Page<OfferTermInfoInner>> listAsync(String filter) {
        return listWithServiceResponseAsync(filter).map(new Func1<ServiceResponse<List<OfferTermInfoInner>>, Page<OfferTermInfoInner>>() {
            @Override
            public Page<OfferTermInfoInner> call(ServiceResponse<List<OfferTermInfoInner>> response) {
                PageImpl1<OfferTermInfoInner> page = new PageImpl1<>();
                page.setItems(response.body());
                return page;
            }
        });
    }

    /**
     * Enables you to query for the resource/meter metadata and related prices used in a given subscription by Offer ID, Currency, Locale and Region. The metadata associated with the billing meters, including but not limited to service names, types, resources, units of measure, and regions, is subject to change at any time and without notice. If you intend to use this billing data in an automated fashion, please use the billing meter GUID to uniquely identify each billable item. If the billing meter GUID is scheduled to change due to a new billing model, you will be notified in advance of the change.
     *
     * @param filter The filter to apply on the operation. It ONLY supports the 'eq' and 'and' logical operators at this time. All the 4 query parameters 'OfferDurableId',  'Currency', 'Locale', 'Region' are required to be a part of the $filter.
     * @return the observable to the List&lt;OfferTermInfoInner&gt; object
     */
    public Observable<ServiceResponse<List<OfferTermInfoInner>>> listWithServiceResponseAsync(String filter) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (filter == null) {
            throw new IllegalArgumentException("Parameter filter is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), filter, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<OfferTermInfoInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<OfferTermInfoInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<OfferTermInfoInner>> result = listDelegate(response);
                        List<OfferTermInfoInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<OfferTermInfoInner>> clientResponse = new ServiceResponse<List<OfferTermInfoInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<OfferTermInfoInner>> listDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<OfferTermInfoInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<OfferTermInfoInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
