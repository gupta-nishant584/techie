package com.observer.javautil.test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import com.observer.javautil.observable.Product;
import com.observer.javautil.observer.Bidder;

public class ObservablePatternTest {
	
	@Test
	public void test() {
		Product product = new Product("L340 Digital Cam",new BigDecimal(325));
		
		Bidder bidder1 = new Bidder("Alen");
		Bidder bidder2 = new Bidder("Mox");
		Bidder bidder3 = new Bidder("Sank");
		
		product.addObserver(bidder1);
		product.addObserver(bidder2);
		product.addObserver(bidder3);
		
		product.setBidAmount(bidder1, new BigDecimal(350));
		product.deleteObserver(bidder2);
		product.setBidAmount(bidder3, new BigDecimal(380));
	}

}
