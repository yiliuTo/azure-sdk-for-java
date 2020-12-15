// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.sample.aad.controller;

import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OnDemandController {
    @GetMapping("/arm")
    @ResponseBody
    public String arm(
        @RegisteredOAuth2AuthorizedClient("arm") OAuth2AuthorizedClient oAuth2AuthorizedClient
    ) {
        return "arm";
    }
}
