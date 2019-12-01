package com.bridge.abstraction;

import com.bridge.implementor.MessageSender;

public abstract class Message {
	
	public MessageSender messageSender;
	
	Message(MessageSender messageSender){
		this.messageSender = messageSender;
	}
	
	public abstract void send();
}
