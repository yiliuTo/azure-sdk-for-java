// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.autoconfigure.jms;

import org.apache.qpid.jms.JmsConnectionFactory;
import org.junit.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.autoconfigure.jms.JmsAutoConfiguration;
import org.springframework.boot.test.context.FilteredClassLoader;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.ConnectionFactory;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NonPremiumServiceBusJMSAutoConfigurationTest {

    private static final String CONNECTION_STRING = "Endpoint=sb://host/;SharedAccessKeyName=sasKeyName;"
        + "SharedAccessKey=sasKey";

    @Test
    public void testAzureServiceBusNonPremiumAutoConfiguration() {
        ApplicationContextRunner contextRunner = getEmptyContextRunner();
        contextRunner.withPropertyValues("spring.jms.servicebus.pricing-tier=premium")
                     .run(context -> assertThat(context).doesNotHaveBean(AzureServiceBusJMSProperties.class));

        contextRunner.withPropertyValues("spring.jms.servicebus.enabled=false")
                     .run(context -> assertThat(context).doesNotHaveBean(AzureServiceBusJMSProperties.class));

        contextRunner.withPropertyValues("spring.jms.servicebus.connection-string=" + CONNECTION_STRING)
                     .run(context -> assertThat(context).hasSingleBean(AzureServiceBusJMSProperties.class));
    }

    @Test(expected = IllegalStateException.class)
    public void testAzureServiceBusJMSPropertiesConnectionStringValidation() {
        ApplicationContextRunner contextRunner = getEmptyContextRunner();
        contextRunner.run(context -> context.getBean(AzureServiceBusJMSProperties.class));
    }

    @Test(expected = IllegalStateException.class)
    public void testAzureServiceBusJMSPropertiesPricingTireValidation() {
        ApplicationContextRunner contextRunner = getEmptyContextRunner();
        contextRunner.withPropertyValues(
            "spring.jms.servicebus.pricing-tier=fake",
            "spring.jms.servicebus.connection-string=" + CONNECTION_STRING)
                     .run(context -> context.getBean(AzureServiceBusJMSProperties.class));
    }

    @Test
    public void testAzureServiceBusJMSProperties() {
        ApplicationContextRunner contextRunner = getContextRunnerWithProperties();
        contextRunner.withPropertyValues(
            "spring.jms.servicebus.destination=test",
            "spring.jms.servicebus.subscription=test")
            .run(context -> {
                AzureServiceBusJMSProperties properties = context.getBean(AzureServiceBusJMSProperties.class);
                assertEquals("test", properties.getDestination());
                assertEquals("test", properties.getSubscription());
            });
    }

    @Test
    public void testWithoutServiceBusJMSNamespace() {
        ApplicationContextRunner contextRunner = getEmptyContextRunner();
        contextRunner.withClassLoader(new FilteredClassLoader(JmsConnectionFactory.class))
                     .run(context -> assertThat(context).doesNotHaveBean(AzureServiceBusJMSProperties.class));
    }

    @Test
    public void testCachingConnectionFactoryIsAutowired() {

        ApplicationContextRunner contextRunner = getContextRunnerWithProperties();

        contextRunner.run(
            context -> {
                assertThat(context).hasSingleBean(ConnectionFactory.class);
                assertThat(context).hasSingleBean(JmsTemplate.class);
                ConnectionFactory connectionFactory = context.getBean(ConnectionFactory.class);
                assertTrue(connectionFactory == context.getBean(JmsTemplate.class).getConnectionFactory());
            }
        );
    }

    @Test
    public void testAzureServiceBusJMSPropertiesConfigured() {

        ApplicationContextRunner contextRunner = getContextRunnerWithProperties();

        contextRunner.run(
            context -> {
                assertThat(context).hasSingleBean(AzureServiceBusJMSProperties.class);
                assertThat(context.getBean(AzureServiceBusJMSProperties.class).getConnectionString()).isEqualTo(
                    CONNECTION_STRING);
                assertThat(context.getBean(AzureServiceBusJMSProperties.class).getTopicClientId()).isEqualTo("cid");
                assertThat(context.getBean(AzureServiceBusJMSProperties.class).getIdleTimeout()).isEqualTo(123);
            }
        );
    }

    private ApplicationContextRunner getEmptyContextRunner() {

        return new ApplicationContextRunner()
            .withConfiguration(AutoConfigurations.of(NonPremiumServiceBusJMSAutoConfiguration.class, JmsAutoConfiguration.class))
            .withPropertyValues(
                "spring.jms.servicebus.pricing-tier=basic"
            );
    }

    private ApplicationContextRunner getContextRunnerWithProperties() {

        return new ApplicationContextRunner()
            .withConfiguration(AutoConfigurations.of(NonPremiumServiceBusJMSAutoConfiguration.class, JmsAutoConfiguration.class))
            .withPropertyValues(
                "spring.jms.servicebus.connection-string=" + CONNECTION_STRING,
                "spring.jms.servicebus.topic-client-id=cid",
                "spring.jms.servicebus.idle-timeout=123",
                "spring.jms.servicebus.pricing-tier=basic"
            );
    }
}
