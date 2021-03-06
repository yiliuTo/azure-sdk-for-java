/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for WebActivityMethod.
 */
public final class WebActivityMethod extends ExpandableStringEnum<WebActivityMethod> {
    /** Static value GET for WebActivityMethod. */
    public static final WebActivityMethod GET = fromString("GET");

    /** Static value POST for WebActivityMethod. */
    public static final WebActivityMethod POST = fromString("POST");

    /** Static value PUT for WebActivityMethod. */
    public static final WebActivityMethod PUT = fromString("PUT");

    /** Static value DELETE for WebActivityMethod. */
    public static final WebActivityMethod DELETE = fromString("DELETE");

    /**
     * Creates or finds a WebActivityMethod from its string representation.
     * @param name a name to look for
     * @return the corresponding WebActivityMethod
     */
    @JsonCreator
    public static WebActivityMethod fromString(String name) {
        return fromString(name, WebActivityMethod.class);
    }

    /**
     * @return known WebActivityMethod values
     */
    public static Collection<WebActivityMethod> values() {
        return values(WebActivityMethod.class);
    }
}
