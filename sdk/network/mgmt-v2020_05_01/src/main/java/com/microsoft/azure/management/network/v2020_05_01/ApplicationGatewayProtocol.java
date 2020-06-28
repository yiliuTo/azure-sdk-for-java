/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ApplicationGatewayProtocol.
 */
public final class ApplicationGatewayProtocol extends ExpandableStringEnum<ApplicationGatewayProtocol> {
    /** Static value Http for ApplicationGatewayProtocol. */
    public static final ApplicationGatewayProtocol HTTP = fromString("Http");

    /** Static value Https for ApplicationGatewayProtocol. */
    public static final ApplicationGatewayProtocol HTTPS = fromString("Https");

    /**
     * Creates or finds a ApplicationGatewayProtocol from its string representation.
     * @param name a name to look for
     * @return the corresponding ApplicationGatewayProtocol
     */
    @JsonCreator
    public static ApplicationGatewayProtocol fromString(String name) {
        return fromString(name, ApplicationGatewayProtocol.class);
    }

    /**
     * @return known ApplicationGatewayProtocol values
     */
    public static Collection<ApplicationGatewayProtocol> values() {
        return values(ApplicationGatewayProtocol.class);
    }
}
