// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.test.aad.selenium.multitenant;

import com.azure.test.aad.selenium.AADSeleniumITHelper;
import com.azure.test.aad.selenium.role.AADRoleIT;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Collections;

public class AADMultipleTenantIT {
    private static final Logger LOGGER = LoggerFactory.getLogger(AADMultipleTenantIT.class);

    @Test
    public void multipleTenantTest() throws InterruptedException {
        AADSeleniumITHelper aadSeleniumITHelper = new AADSeleniumITHelper(AADRoleIT.DumbApp.class,
            Collections.emptyMap(), true);
        String httpResponse = aadSeleniumITHelper.httpGet("api/home");
        Assert.assertTrue(httpResponse.contains("home"));
    }

    @EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)
    @SpringBootApplication
    @RestController
    public static class DumbApp {

        @GetMapping(value = "/api/home")
        public ResponseEntity<String> home(Principal principal) {
            LOGGER.info(((OAuth2AuthenticationToken) principal).getAuthorities().toString());
            return ResponseEntity.ok("home");
        }
    }
}
