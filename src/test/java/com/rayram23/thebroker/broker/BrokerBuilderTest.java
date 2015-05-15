package com.rayram23.thebroker.broker;

import static org.junit.Assert.*;

import org.junit.Test;


public class BrokerBuilderTest  {

	private BrokerBuilder testClass = new BrokerBuilder();
	
	@Test
	public void testSetMaxConcurrentOutgoingMessagesNegativeValue(){
		boolean exception = false;
		try{
			this.testClass.setMaxConcurrentOutgoingMessages(-100);

		}
		catch(IllegalArgumentException e){
			exception  = true;
		}
		assertTrue(exception);
	}
	@Test
	public void testSetMaxConcurrentOutgoingMessageZeroValue(){
		boolean exception = false;
		try{
			this.testClass.setMaxConcurrentOutgoingMessages(0);

		}
		catch(IllegalArgumentException e){
			exception  = true;
		}
		assertTrue(exception);
	}
	@Test
	public void setMaxConcurrentOutgoingMessagePositiveValue(){
		boolean exception = false;
		try{
			this.testClass.setMaxConcurrentOutgoingMessages(20);

		}
		catch(IllegalArgumentException e){
			exception  = true;
		}
		assertFalse(exception);
	}
}
