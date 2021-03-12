package com.azure.spring.autoconfigure.jms;

import org.apache.qpid.jms.JmsConnectionFactory;
import org.apache.qpid.jms.JmsConnectionListener;
import org.apache.qpid.jms.message.JmsInboundMessageDispatch;
import org.springframework.jms.connection.CachingConnectionFactory;

import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Session;
import java.net.URI;

public class AzureJmsConnectionListener implements JmsConnectionListener {

    private CachingConnectionFactory cachingConnectionFactory;

    public AzureJmsConnectionListener(){}

    public AzureJmsConnectionListener(CachingConnectionFactory cachingConnectionFactory){
        this.cachingConnectionFactory = cachingConnectionFactory;
    }

    @Override
    public void onConnectionEstablished(URI remoteURI) {

    }

    @Override
    public void onConnectionFailure(Throwable error) {

    }

    @Override
    public void onConnectionInterrupted(URI remoteURI) {

    }

    @Override
    public void onConnectionRestored(URI remoteURI) {

    }

    @Override
    public void onInboundMessage(JmsInboundMessageDispatch envelope) {

    }

    @Override
    public void onSessionClosed(Session session, Throwable cause) {

    }

    @Override
    public void onConsumerClosed(MessageConsumer consumer, Throwable cause) {

    }

    @Override
    public void onProducerClosed(MessageProducer producer, Throwable cause) {
        System.out.println("========");
        JmsConnectionFactory connectionFactory = (JmsConnectionFactory) cachingConnectionFactory.getTargetConnectionFactory();
        producer.getClass();
    }

    public CachingConnectionFactory getCachingConnectionFactory() {
        return cachingConnectionFactory;
    }

    public void setCachingConnectionFactory(CachingConnectionFactory cachingConnectionFactory) {
        this.cachingConnectionFactory = cachingConnectionFactory;
    }
}
