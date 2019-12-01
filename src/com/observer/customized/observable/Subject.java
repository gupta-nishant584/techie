package com.observer.customized.observable;

import java.math.BigDecimal;

import com.observer.customized.observer.Observer;

public interface Subject {

	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObserver();
	public void setBidAmount(Observer observer,BigDecimal newBidAmount);
	
}
