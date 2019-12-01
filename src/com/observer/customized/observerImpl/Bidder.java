package com.observer.customized.observerImpl;

import java.math.BigDecimal;

import com.observer.customized.observer.Observer;

public class Bidder implements Observer {

	String bidderName;
	
	public Bidder(String bidderName) {
		this.bidderName = bidderName;
	}
	
	@Override
	public void update(Observer observer, String productName, BigDecimal newBidAmount) {
		if(observer.toString().equals(bidderName)) {
			System.out.println("Hello "+ bidderName+"! New bid of amount  "+newBidAmount+" has been placed on "+productName+" by you");
		}
		if(!observer.toString().equals(bidderName)) {
			System.out.println("Hello "+ bidderName+"! New bid of amount  "+newBidAmount+" has been placed on "+productName+" by "+observer+"");
		}
	}

	@Override
	public String toString() {
		return bidderName;
	}
	

}
