/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * A condition for the delivery rule.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "name", defaultImpl = DeliveryRuleCondition.class)
@JsonTypeName("DeliveryRuleCondition")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "RemoteAddress", value = DeliveryRuleRemoteAddressCondition.class),
    @JsonSubTypes.Type(name = "RequestMethod", value = DeliveryRuleRequestMethodCondition.class),
    @JsonSubTypes.Type(name = "QueryString", value = DeliveryRuleQueryStringCondition.class),
    @JsonSubTypes.Type(name = "PostArgs", value = DeliveryRulePostArgsCondition.class),
    @JsonSubTypes.Type(name = "RequestUri", value = DeliveryRuleRequestUriCondition.class),
    @JsonSubTypes.Type(name = "RequestHeader", value = DeliveryRuleRequestHeaderCondition.class),
    @JsonSubTypes.Type(name = "RequestBody", value = DeliveryRuleRequestBodyCondition.class),
    @JsonSubTypes.Type(name = "RequestScheme", value = DeliveryRuleRequestSchemeCondition.class),
    @JsonSubTypes.Type(name = "UrlPath", value = DeliveryRuleUrlPathCondition.class),
    @JsonSubTypes.Type(name = "UrlFileExtension", value = DeliveryRuleUrlFileExtensionCondition.class),
    @JsonSubTypes.Type(name = "UrlFileName", value = DeliveryRuleUrlFileNameCondition.class),
    @JsonSubTypes.Type(name = "HttpVersion", value = DeliveryRuleHttpVersionCondition.class),
    @JsonSubTypes.Type(name = "Cookies", value = DeliveryRuleCookiesCondition.class),
    @JsonSubTypes.Type(name = "IsDevice", value = DeliveryRuleIsDeviceCondition.class)
})
public class DeliveryRuleCondition {
}