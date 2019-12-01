package com.decoratorpattern.decorator;

import com.decoratorpattern.component.Bouquet;

public class GlitterDecorator implements BouquetDecorator{
	Bouquet bouquet;
	
	public GlitterDecorator(Bouquet bouquet) {
		this.bouquet = bouquet;
	}
	
	@Override
	public String getDescription() {
		
		return bouquet.getDescription() + " Glitter";
	}

	@Override
	public double getPrice() {
		return bouquet.getPrice() + 4.0;
	}	
}
