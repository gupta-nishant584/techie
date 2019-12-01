package com.observer.customized.observableImpl;

import java.math.BigDecimal;
import java.util.ArrayList;

import com.observer.customized.observable.Subject;
import com.observer.customized.observer.Observer;

public class Product implements Subject {
	
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private String productName;
	private BigDecimal bidAmount;
	private Observer observer;
	
	public Product(String productName, BigDecimal bidAmount) {
		this.productName = productName;
		this.bidAmount = bidAmount;
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
		System.out.println("-----------------"+observer+" has withdrawn from bidding----------------");
	}

	@Override
	public void notifyObserver() {
		System.out.println("-----------------New bid placed----------------");
		observers.forEach(observer -> observer.update(this.observer, productName, bidAmount));
	}

	@Override
	public void setBidAmount(Observer observer, BigDecimal newBidAmount) {
		if(bidAmount.compareTo(newBidAmount)<=-1) {
			this.observer = observer;
			this.bidAmount = newBidAmount;
			notifyObserver();
		}else {
			System.out.println("New Bid Amount cannot be less or equal to current bid amount");
		}

	}

}
