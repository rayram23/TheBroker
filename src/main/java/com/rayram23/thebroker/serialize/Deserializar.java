package com.rayram23.thebroker.serialize;

public interface Deserializar <T> {

	public <T> T deserialize(byte[] message);
	
}
