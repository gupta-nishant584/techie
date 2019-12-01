package com.bridge.implementor;

public class EmailMessageSender implements MessageSender {

	@Override
	public void sendMessage() {
		System.out.println("Email Message Sender :::::::: Email .......... ");

	}

}
