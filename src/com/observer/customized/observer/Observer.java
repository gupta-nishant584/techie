package com.observer.customized.observer;

import java.math.BigDecimal;

public interface Observer {
	
	public void update(Observer observer, String productName, BigDecimal newBidAmount);
}
