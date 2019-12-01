package com.behavior.chainresponsibility.client;

import com.behavior.chainresponsibility.concretehandler.BillingSupportHandler;
import com.behavior.chainresponsibility.concretehandler.GeneralSupportHandler;
import com.behavior.chainresponsibility.concretehandler.TechnicalSupportHandler;
import com.behavior.chainresponsibility.handler.AbstractSupportHandler;

public class RequestorClient {

	public static AbstractSupportHandler getHandlerChain() {
		
		AbstractSupportHandler technicalSupportHandler = new TechnicalSupportHandler(AbstractSupportHandler.TECHNICAL_LEVEL);
		AbstractSupportHandler billingSupportHandler = new BillingSupportHandler(AbstractSupportHandler.BILLING_LEVEL);
		AbstractSupportHandler generalSupportHandler = new GeneralSupportHandler(AbstractSupportHandler.GENERAL_LEVEL);
		
		technicalSupportHandler.setNextHandler(billingSupportHandler);
		billingSupportHandler.setNextHandler(generalSupportHandler);
		
		return technicalSupportHandler;
	}
}
