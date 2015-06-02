package com.rayram23.thebroker.broker;

import java.util.Set;

import com.rayram23.thebroker.consumer.MessageListener;
import com.rayram23.thebroker.serialize.Serializer;

public class RabbitMqBroker implements Broker{

	public Boolean sendMessage(Object message, String routingKey,
			Boolean mandatory, Boolean immediate) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean sendMessage(Object message, Serializer serializer,
			String routingKey, Boolean mandatory, Boolean immediate) {
		// TODO Auto-generated method stub
		return null;
	}

	public void listenOnQueue(String queueName, MessageListener... listeners) {
		// TODO Auto-generated method stub
		
	}

	public void listenOnRoutingKeys(Set<String> routingKeys,
			MessageListener... listeners) {
		// TODO Auto-generated method stub
		
	}

}
