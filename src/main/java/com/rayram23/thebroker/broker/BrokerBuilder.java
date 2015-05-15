package com.rayram23.thebroker.broker;

public class BrokerBuilder {

	private int maxConcurrentOutgoingMessages = 1;
	private int maxPendingOutgoingMessages = -1;
	private String rabbitHost = "loalhost";
	private int rabbitPort = 5672;
	private String userName = "guest";
	private String password = "guest";
	private String vHost;
	private String exchange;
	
	protected BrokerBuilder(){
		
	}
	public BrokerBuilder setMaxConcurrentOutgoingMessages(int max){
		if(max <= 0){
			throw new IllegalArgumentException("Max Concurrent Outgoing messages must be a positive number");
		}
		this.maxConcurrentOutgoingMessages = max;
		return this;
	}
	public BrokerBuilder setMaxPendingOutGoingMessages(int maxPending){
		this.maxPendingOutgoingMessages = maxPending;
		return this;
	}
	public BrokerBuilder setRabbitHost(String host){
		this.rabbitHost = host;
		return this;
	}
	public BrokerBuilder setRabbitPort(int port){
		this.rabbitPort = port;
		return this;
	}
	public BrokerBuilder setUserName(String userName){
		this.userName = userName;
		return this;
	}
	public BrokerBuilder setPassWord(String password){
		this.password = password;
		return this;
	}
	public BrokerBuilder setVHost(String vhost){
		this.vHost = vhost;
		return this;
	}
	public BrokerBuilder setexchange(String exchange){
		this.exchange = exchange;
		return this;
	}
	public BrokerBuilder setEncoding(String encoding){
		this.encoding = encoding;
		return this;
	}
	public BrokerBuilder setContentType(String contentType){
		this.contentType = contentType;
		return this;
	}
	public Broker build()
	
	}
	
	
	
	
	
}
