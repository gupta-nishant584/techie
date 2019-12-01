package com.bridge.abstraction;

import com.bridge.implementor.MessageSender;

public class EmailMessage extends Message {

	
	EmailMessage(MessageSender messageSender) {
		super(messageSender);
	}

	@Override
	public void send() {
		messageSender.sendMessage();
	}

}
