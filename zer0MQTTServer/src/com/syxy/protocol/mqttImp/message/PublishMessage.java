package com.syxy.protocol.mqttImp.message;

import java.io.IOException;
import java.nio.ByteBuffer;


/**
 * <li>MQTT协议Publish消息类型实现类，发布消息的消息类型
 * <li>作者 zer0
 * <li>创建日期 2015-3-2
 */
public class PublishMessage extends Message {
	
	public PublishMessage(){
		
	}
	
	public PublishMessage(HeaderMessage headerMessage){
		super(headerMessage);
	}
	
	@Override
	public byte[] encode() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message decode(ByteBuffer byteBuffer, int messageLength) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int messageLength() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void handlerMessage() {
		// TODO Auto-generated method stub
		
	}


}
