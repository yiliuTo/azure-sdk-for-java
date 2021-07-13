// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption;

import com.azure.core.util.Context;
import com.azure.resourcemanager.consumption.models.Datagrain;

/** Samples for ReservationsSummaries List. */
public final class ReservationsSummariesListSamples {
    /**
     * Sample code: ReservationSummariesDailyWithBillingAccountId.
     *
     * @param consumptionManager Entry point to ConsumptionManager. Consumption management client provides access to
     *     consumption resources for Azure Enterprise Subscriptions.
     */
    public static void reservationSummariesDailyWithBillingAccountId(
        com.azure.resourcemanager.consumption.ConsumptionManager consumptionManager) {
        consumptionManager
            .reservationsSummaries()
            .list(
                "providers/Microsoft.Billing/billingAccounts/12345",
                Datagrain.DAILY,
                null,
                null,
                "properties/usageDate ge 2017-10-01 AND properties/usageDate le 2017-11-20",
                null,
                null,
                Context.NONE);
    }

    /**
     * Sample code: ReservationSummariesDailyWithBillingProfileId.
     *
     * @param consumptionManager Entry point to ConsumptionManager. Consumption management client provides access to
     *     consumption resources for Azure Enterprise Subscriptions.
     */
    public static void reservationSummariesDailyWithBillingProfileId(
        com.azure.resourcemanager.consumption.ConsumptionManager consumptionManager) {
        consumptionManager
            .reservationsSummaries()
            .list(
                "providers/Microsoft.Billing/billingAccounts/12345:2468/billingProfiles/13579",
                Datagrain.DAILY,
                "2017-10-01",
                "2017-11-20",
                null,
                null,
                null,
                Context.NONE);
    }

    /**
     * Sample code: ReservationSummariesMonthlyWithBillingAccountId.
     *
     * @param consumptionManager Entry point to ConsumptionManager. Consumption management client provides access to
     *     consumption resources for Azure Enterprise Subscriptions.
     */
    public static void reservationSummariesMonthlyWithBillingAccountId(
        com.azure.resourcemanager.consumption.ConsumptionManager consumptionManager) {
        consumptionManager
            .reservationsSummaries()
            .list(
                "providers/Microsoft.Billing/billingAccounts/12345",
                Datagrain.MONTHLY,
                null,
                null,
                "properties/usageDate ge 2017-10-01 AND properties/usageDate le 2017-11-20",
                null,
                null,
                Context.NONE);
    }

    /**
     * Sample code: ReservationSummariesMonthlyWithBillingProfileId.
     *
     * @param consumptionManager Entry point to ConsumptionManager. Consumption management client provides access to
     *     consumption resources for Azure Enterprise Subscriptions.
     */
    public static void reservationSummariesMonthlyWithBillingProfileId(
        com.azure.resourcemanager.consumption.ConsumptionManager consumptionManager) {
        consumptionManager
            .reservationsSummaries()
            .list(
                "providers/Microsoft.Billing/billingAccounts/12345:2468/billingProfiles/13579",
                Datagrain.MONTHLY,
                "2017-10-01",
                "2017-11-20",
                null,
                null,
                null,
                Context.NONE);
    }

    /**
     * Sample code: ReservationSummariesMonthlyWithBillingProfileIdReservationId.
     *
     * @param consumptionManager Entry point to ConsumptionManager. Consumption management client provides access to
     *     consumption resources for Azure Enterprise Subscriptions.
     */
    public static void reservationSummariesMonthlyWithBillingProfileIdReservationId(
        com.azure.resourcemanager.consumption.ConsumptionManager consumptionManager) {
        consumptionManager
            .reservationsSummaries()
            .list(
                "providers/Microsoft.Billing/billingAccounts/12345:2468/billingProfiles/13579",
                Datagrain.MONTHLY,
                "2017-10-01",
                "2017-11-20",
                null,
                "1c6b6358-709f-484c-85f1-72e862a0cf3b",
                "9f39ba10-794f-4dcb-8f4b-8d0cb47c27dc",
                Context.NONE);
    }
}
