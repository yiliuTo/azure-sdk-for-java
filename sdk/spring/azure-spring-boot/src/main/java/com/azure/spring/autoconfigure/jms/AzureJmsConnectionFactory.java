package com.azure.spring.autoconfigure.jms;

import org.apache.qpid.jms.JmsConnection;
import org.apache.qpid.jms.JmsConnectionFactory;
import org.apache.qpid.jms.JmsQueueConnection;
import org.apache.qpid.jms.JmsTopicConnection;

import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.QueueConnection;
import javax.jms.TopicConnection;

public class AzureJmsConnectionFactory extends JmsConnectionFactory {

    private AzureJmsConnectionListener connectionListener;

    @Override
    public TopicConnection createTopicConnection(String username, String password) throws JMSException {

        JmsTopicConnection topicConnection = (JmsTopicConnection) super.createTopicConnection(username, password);
        topicConnection.addConnectionListener(connectionListener);
        return topicConnection;
    }

    @Override
    public Connection createConnection(String username, String password) throws JMSException {
        JmsConnection connection = (JmsConnection) super.createConnection(username, password);
        connection.addConnectionListener(connectionListener);
        return connection;
    }

    @Override
    public QueueConnection createQueueConnection(String username, String password) throws JMSException {
        JmsQueueConnection queueConnection = (JmsQueueConnection) super.createQueueConnection(username, password);
        queueConnection.addConnectionListener(connectionListener);
        return queueConnection;
    }

    public AzureJmsConnectionListener getConnectionListener() {
        return connectionListener;
    }

    public void setConnectionListener(AzureJmsConnectionListener connectionListener) {
        this.connectionListener = connectionListener;
    }
}
