package com.decoratorpattern.test;

import org.junit.Test;

import com.decoratorpattern.component.Bouquet;
import com.decoratorpattern.component.RoseBouquet;
import com.decoratorpattern.decorator.BouquetDecorator;
import com.decoratorpattern.decorator.GlitterDecorator;

public class BouquetTest {
	
	
	@Test
	public void roseBouquetTest() {
	Bouquet bouquet =  new RoseBouquet();
	BouquetDecorator bouquetDecorator = new GlitterDecorator(bouquet);
	
	/*Rose Bouquet with Glitter Decorator*/
	System.out.println("Rose Bouquet with Glitter has been decorated :: " + bouquetDecorator.getDescription() + "::"+bouquetDecorator.getPrice());
	}
}
