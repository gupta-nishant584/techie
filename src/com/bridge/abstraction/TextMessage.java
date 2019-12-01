package com.bridge.abstraction;

import com.bridge.implementor.MessageSender;

public class TextMessage extends Message {
	

	public TextMessage(MessageSender messageSender) {
		super(messageSender);		
	}

	@Override
	public void send() {
		messageSender.sendMessage();
	}

}
