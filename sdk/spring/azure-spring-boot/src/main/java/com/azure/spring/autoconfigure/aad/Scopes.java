package com.azure.spring.autoconfigure.aad;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Scopes {

    public static final String AAD_GRAPH_API_URI = "https://graph.windows.net/";
    public static final String MICROSOFT_GRAPH_URI = "https://graph.microsoft.com/";
    public static final Set<String> GRAPH_API_PERMISSIONS = Collections.singleton("user.read");
    public static final Set<String> OPENID_PERMISSIONS =
        new HashSet<>(Arrays.asList("openid", "profile", "email", "offline_access"));
}
