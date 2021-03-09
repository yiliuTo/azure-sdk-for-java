package com.azure.spring.test;

import static com.azure.spring.test.EnvironmentVariable.AAD_MULTI_TENANT_CLIENT_ID_1;

public class Constant {
    public static final String MULTI_TENANT_SCOPE_GRAPH_READ =
        toFullNameScope(AAD_MULTI_TENANT_CLIENT_ID_1, "ResourceAccessGraph.Read");

    public static String toFullNameScope(String clientId, String scope) {
        return "api://" + clientId + "/" + scope;
    }

    public static final String AZURE_CLOUD_TYPE_CHINA = "China";
    public static final String AZURE_CLOUD_TYPE_GLOBAL = "Global";
}
