package com.facade.controller;

import com.facade.service.OrderServiceFacade;

public class OrderPlacementController {
	
	public OrderServiceFacade orderServiceFacade;
	boolean orderPlaced = false;
	
	public boolean placeOrder(String productId) {
		orderPlaced = orderServiceFacade.placeOrder(productId);
		if(orderPlaced) {
			System.out.println("Order Placed Successfully");
		}else {
			System.out.println("Order Placed not successful");
		}
		return orderPlaced;
	}
}
