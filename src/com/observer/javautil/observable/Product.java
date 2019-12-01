package com.observer.javautil.observable;

import java.math.BigDecimal;
import java.util.Observable;
import java.util.Observer;

public class Product extends Observable {
	
	public String productName;
	public BigDecimal bidAmount;
	public Observer observer;
	
	public Product(String productName, BigDecimal bidAmount) {
		this.productName = productName;
		this.bidAmount=bidAmount;
	}
	
	public String getProductName() {
		return this.productName;
	}
	public BigDecimal getBidAmount() {
		return this.bidAmount;
	}
	public Observer getObserver() {
		return this.observer;
	}

	public void setBidAmount(Observer observer,BigDecimal newBidAmount) {
		System.out.println("--------------------- New Bid Placed -----------------------");
		if(bidAmount.compareTo(newBidAmount)<=-1) {
			this.bidAmount=newBidAmount;
			this.observer= observer;
			
			setChanged();
			notifyObservers();
			
		}else {
			System.out.println("new bid amount cannot be less than or equal to current bid amount "+this.bidAmount);
		}
	}
}
