/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The effective route configured on the virtual hub or specified resource.
 */
public class VirtualHubEffectiveRoute {
    /**
     * The list of address prefixes.
     */
    @JsonProperty(value = "addressPrefixes")
    private List<String> addressPrefixes;

    /**
     * The list of next hops.
     */
    @JsonProperty(value = "nextHops")
    private List<String> nextHops;

    /**
     * The type of the next hop.
     */
    @JsonProperty(value = "nextHopType")
    private String nextHopType;

    /**
     * The ASPath of this route.
     */
    @JsonProperty(value = "asPath")
    private String asPath;

    /**
     * The origin of this route.
     */
    @JsonProperty(value = "routeOrigin")
    private String routeOrigin;

    /**
     * Get the list of address prefixes.
     *
     * @return the addressPrefixes value
     */
    public List<String> addressPrefixes() {
        return this.addressPrefixes;
    }

    /**
     * Set the list of address prefixes.
     *
     * @param addressPrefixes the addressPrefixes value to set
     * @return the VirtualHubEffectiveRoute object itself.
     */
    public VirtualHubEffectiveRoute withAddressPrefixes(List<String> addressPrefixes) {
        this.addressPrefixes = addressPrefixes;
        return this;
    }

    /**
     * Get the list of next hops.
     *
     * @return the nextHops value
     */
    public List<String> nextHops() {
        return this.nextHops;
    }

    /**
     * Set the list of next hops.
     *
     * @param nextHops the nextHops value to set
     * @return the VirtualHubEffectiveRoute object itself.
     */
    public VirtualHubEffectiveRoute withNextHops(List<String> nextHops) {
        this.nextHops = nextHops;
        return this;
    }

    /**
     * Get the type of the next hop.
     *
     * @return the nextHopType value
     */
    public String nextHopType() {
        return this.nextHopType;
    }

    /**
     * Set the type of the next hop.
     *
     * @param nextHopType the nextHopType value to set
     * @return the VirtualHubEffectiveRoute object itself.
     */
    public VirtualHubEffectiveRoute withNextHopType(String nextHopType) {
        this.nextHopType = nextHopType;
        return this;
    }

    /**
     * Get the ASPath of this route.
     *
     * @return the asPath value
     */
    public String asPath() {
        return this.asPath;
    }

    /**
     * Set the ASPath of this route.
     *
     * @param asPath the asPath value to set
     * @return the VirtualHubEffectiveRoute object itself.
     */
    public VirtualHubEffectiveRoute withAsPath(String asPath) {
        this.asPath = asPath;
        return this;
    }

    /**
     * Get the origin of this route.
     *
     * @return the routeOrigin value
     */
    public String routeOrigin() {
        return this.routeOrigin;
    }

    /**
     * Set the origin of this route.
     *
     * @param routeOrigin the routeOrigin value to set
     * @return the VirtualHubEffectiveRoute object itself.
     */
    public VirtualHubEffectiveRoute withRouteOrigin(String routeOrigin) {
        this.routeOrigin = routeOrigin;
        return this;
    }

}
