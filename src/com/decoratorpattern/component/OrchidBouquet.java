package com.decoratorpattern.component;

public class OrchidBouquet implements Bouquet {

	@Override
	public String getDescription() {
		
		return "Orchid Bouquet";
	}

	@Override
	public double getPrice() {
		return 21.0;
	}
}
