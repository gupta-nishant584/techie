/**
 * 
 */
package com.behavior.chainresponsibility.concretehandler;

import com.behavior.chainresponsibility.handler.AbstractSupportHandler;

/**
 * @author nishant.gupta1000013
 *
 */
public class TechnicalSupportHandler extends AbstractSupportHandler {
	
	public TechnicalSupportHandler(int level) {
		this.level=level;
	}

	@Override
	protected void handleRequest(String message) {
			System.out.println("TechnicalSupportHandler: Processing request "+message);
	}
}
