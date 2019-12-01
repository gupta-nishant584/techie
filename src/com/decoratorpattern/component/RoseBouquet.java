package com.decoratorpattern.component;

public class RoseBouquet implements Bouquet {

	@Override
	public String getDescription() {
		
		return "Rose Bouquet";
	}

	@Override
	public double getPrice() {
		
		return 11.0;
	}

}
