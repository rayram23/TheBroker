package com.rayram23.thebroker.serialize;

public interface Serializer{

	public byte[] serialize(Object o);
	public String getContentType();
	public String getEncoding();
}
