package com.behavior.chainresponsibility.handler;

public abstract class AbstractSupportHandler {
	
	public static final int TECHNICAL_LEVEL = 10;
	public static final int BILLING_LEVEL = 20;
	public static final int GENERAL_LEVEL = 30;
	
	public AbstractSupportHandler nextHandler;
	public int level;
	
	public void setNextHandler(AbstractSupportHandler nextHandler) {
		this.nextHandler = nextHandler;
	}
	
	public void receiveRequest(int level, String message) {
		if(this.level <= level) {
			handleRequest(message);
		}
		if(nextHandler!=null) {
			nextHandler.receiveRequest(level, message);
		}
	}
	
	protected abstract void handleRequest(String message);

}
