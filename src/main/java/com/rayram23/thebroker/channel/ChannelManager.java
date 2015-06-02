package com.rayram23.thebroker.channel;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.ShutdownListener;

public interface ChannelManager extends ShutdownListener{

	public Channel aquireChannel();
	public void releaseChannal(Channel channel);
	
}
