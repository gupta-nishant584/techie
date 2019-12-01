package com.observer.customized.test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import com.observer.customized.observable.Subject;
import com.observer.customized.observableImpl.Product;
import com.observer.customized.observer.Observer;
import com.observer.customized.observerImpl.Bidder;

class ObserverTest {

	@Test
	void test() {
		Subject product = new Product("Mi Note 7", new BigDecimal(375));
		Observer bidder1 = new Bidder("Bidder 1");
		Observer bidder2 = new Bidder("Bidder 2");
		Observer bidder3 = new Bidder("Bidder 3");
		product.registerObserver(bidder1);
		product.registerObserver(bidder2);
		product.registerObserver(bidder3);
		
		product.setBidAmount(bidder1, new BigDecimal(380));
		product.removeObserver(bidder2);
		product.setBidAmount(bidder3, new BigDecimal(385));
	}

}
