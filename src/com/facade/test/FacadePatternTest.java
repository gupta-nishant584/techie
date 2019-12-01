package com.facade.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.facade.controller.OrderPlacementController;
import com.facade.service.OrderServiceFacadeImpl;

public class FacadePatternTest {

	@Test
	public void test() {
		OrderPlacementController orderPlacementController = new OrderPlacementController();
		orderPlacementController.orderServiceFacade = new OrderServiceFacadeImpl();
		
		boolean orderPlaced = orderPlacementController.placeOrder("Wallet");
		
		assertTrue(orderPlaced);
	}

}
