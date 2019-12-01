package com.bridge.test;

import org.junit.jupiter.api.Test;

import com.bridge.abstraction.Message;
import com.bridge.abstraction.TextMessage;
import com.bridge.implementor.EmailMessageSender;
import com.bridge.implementor.TextMessageSender;

class MessageText {

	@Test
	void test() {
		
		System.out.println("Starting test for bridge");
		Message textMessage = new TextMessage(new TextMessageSender());
		textMessage.send();
		
		Message emailMessage = new TextMessage(new EmailMessageSender());
		emailMessage.send();
		System.out.println("End test for bridge");
	}

}
