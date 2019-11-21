// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.amqp.implementation.handler;

import com.azure.core.amqp.exception.AmqpErrorContext;
import com.azure.core.amqp.exception.AmqpException;
import org.apache.qpid.proton.engine.EndpointState;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import reactor.test.StepVerifier;

public class HandlerTest {
    private Handler handler;

    @BeforeEach
    public void setup() {
        handler = new TestHandler();
    }

    @Test
    public void initialHandlerState() {
        // Act & Assert
        StepVerifier.create(handler.getEndpointStates())
            .expectNext(EndpointState.UNINITIALIZED)
            .then(handler::close)
            .verifyComplete();
    }

    @Test
    public void initialErrors() {
        // Act & Assert
        StepVerifier.create(handler.getErrors())
            .then(handler::close)
            .verifyComplete();
    }

    @Test
    public void propagatesStates() {
        // Act & Assert
        StepVerifier.create(handler.getEndpointStates())
            .expectNext(EndpointState.UNINITIALIZED)
            .then(() -> handler.onNext(EndpointState.ACTIVE))
            .expectNext(EndpointState.ACTIVE)
            .then(() -> handler.onNext(EndpointState.ACTIVE))
            .then(handler::close)
            .verifyComplete();
    }

    @Test
    public void propagatesErrors() {
        // Arrange
        final AmqpErrorContext context = new AmqpErrorContext("test namespace.");
        final Throwable exception = new AmqpException(false, "Some test message.", context);

        // Act & Assert
        StepVerifier.create(handler.getErrors())
            .then(() -> handler.onNext(exception))
            .expectNext(exception)
            .then(handler::close)
            .verifyComplete();
    }

    private static class TestHandler extends Handler {
        TestHandler() {
            super("test-connection-id", "test-hostname");
        }
    }
}
