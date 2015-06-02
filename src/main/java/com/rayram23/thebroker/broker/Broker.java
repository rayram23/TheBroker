package com.rayram23.thebroker.broker;

import java.util.Set;

import com.rayram23.thebroker.consumer.MessageListener;
import com.rayram23.thebroker.serialize.Serializer;

public interface Broker{

	/*
	 * 
	 */
	/**
	 * Send a message on the brokers exchange. The message will be published on the exchange defined 
	 * by the broker. The message will be serialized using the serializer provided to the broker during
	 * build or the brokers defualt seriaizer
	 * @param message - the object that will be serialized
	 * @param routingKey - the routing key to publish with
	 * @param madatory - if it is mandatory that this message be delivered to a queue (see rabbit spec)
	 * @param immediate - if this message should be processed on the exchange specified timeout (see rabbit)
	 * @return True if the message will be published at some future time. False otherwiese
	 */
	public Boolean sendMessage(Object message, String routingKey, Boolean mandatory, Boolean immediate);
	/**
	 * Send a message on the brokers exchange. The message will be published on the exchange defined 
	 * by the broker. The message will be serialized using the serializer provided 
	 * @param message - the object to be serialized
	 * @param serializer - the serializer to be used
	 * @param routingKey - the routing key to use when publishing
	 * @param madatory - if it is mandatory that this message be delivered to a queue (see rabbit spec)
	 * @param immediate - if this message should be processed on the exchange specified timeout (see rabbit)
	 * @return - True if the message will be sent at some time in the future false otherwise
	 */
	public Boolean sendMessage(Object message, Serializer serializer, String routingKey, Boolean mandatory, Boolean immediate);
	/**
	 * Adds a single consumer to a rabbitq. Messages that are delivered to the queue are then repeated
	 * to the message listeners
	 * @param queueName - the queue name to consume from
	 * @param listeners - the objects to be notified of a new message
	 */
	public void listenOnQueue(String queueName, MessageListener ... listeners);
	/**
	 * Creates a rabbitmq named queue and adds bindings specified by the routing keys. a single consumer 
	 * is then given exclusive rights to the queue. any messages delivered are then pushed to each listener
	 * @param routingKeys - the bindings to addd to the queue
	 * @param listeners - the objects to be notified
	 */
	public void listenOnRoutingKeys(Set<String> routingKeys, MessageListener ... listeners);
	
}
