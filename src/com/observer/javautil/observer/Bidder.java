package com.observer.javautil.observer;

import java.util.Observable;
import java.util.Observer;

import com.observer.javautil.observable.Product;

public class Bidder implements Observer {

	String bidderName;
	Product observable;
	
	public Bidder(String bidderName) {
		this.bidderName=bidderName;
	}
	
	@Override
	public void update(Observable observable, Object arg) {
		
		this.observable = (Product) observable;
		String name = this.observable.getObserver().toString();
		if(name.equals(bidderName)) {
			System.out.println("Hello "+bidderName+"! New bid of amount "+this.observable.getBidAmount()+" has been placed on "+this.observable.getProductName()+" by you");
		}
		if(!name.equals(bidderName)) {
			System.out.println("Hello "+bidderName+"! New bid of amount "+this.observable.getBidAmount()+" has been placed on "+this.observable.getProductName()+" by" +name+"");
		}
		
	}

	@Override
	public String toString() {
		return bidderName;
	}

	
}
