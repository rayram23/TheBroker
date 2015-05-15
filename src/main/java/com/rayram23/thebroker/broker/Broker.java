package com.rayram23.thebroker.broker;

import java.util.Set;

import com.rayram23.thebroker.consumer.MessageListener;
import com.rayram23.thebroker.serialize.Serializer;

public interface Broker{

	/**
	 * Listen to a specific queue
	 * @param queueName
	 * @return true if listening to the queue was successful, false otherwise
	 */
	public Boolean consumeFromQueue(String queueName, MessageListener listener);
	public Boolean consumeFromExchange(Set<String> bindings, MessageListener listener);
	public Boolean publish(Serializer serizliazer, Object message, String routingKey);
	public Boolean publish(Object message, String routingKey);
	public Boolean init();
	
}
