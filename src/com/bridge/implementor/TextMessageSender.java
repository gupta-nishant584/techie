package com.bridge.implementor;

public class TextMessageSender implements MessageSender {

	@Override
	public void sendMessage() {
		System.out.println("Sending Message from TextMessageSender :::: text......");
	}
}
