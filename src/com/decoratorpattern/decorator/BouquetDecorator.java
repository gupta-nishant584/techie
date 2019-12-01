package com.decoratorpattern.decorator;

import com.decoratorpattern.component.Bouquet;

public interface BouquetDecorator extends Bouquet{
	
	public String getDescription();
}
