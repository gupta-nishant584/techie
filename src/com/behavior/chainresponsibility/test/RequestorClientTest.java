package com.behavior.chainresponsibility.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.behavior.chainresponsibility.client.RequestorClient;
import com.behavior.chainresponsibility.handler.AbstractSupportHandler;

class RequestorClientTest {

	@Test
	void test() {
		AbstractSupportHandler handler = RequestorClient.getHandlerChain();
		
		handler.receiveRequest(AbstractSupportHandler.TECHNICAL_LEVEL, ":::: Technical issue raised ::::");
		System.out.println("-------------------------------------------");
		
		handler.receiveRequest(AbstractSupportHandler.BILLING_LEVEL, ":::: Billing issue raised ::::");
		System.out.println("-------------------------------------------");
		
		handler.receiveRequest(AbstractSupportHandler.GENERAL_LEVEL, ":::: General issue raised ::::");
		System.out.println("-------------------------------------------");
		
		
	}

}
