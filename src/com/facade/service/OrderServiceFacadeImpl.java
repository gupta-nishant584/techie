package com.facade.service;

import com.facade.model.Product;

public class OrderServiceFacadeImpl implements OrderServiceFacade {
	
	public boolean placeOrder(String productId) {
		boolean orderPlaced = false;
		
		
		Product product = new Product();
		product.setProductId(productId);
		product.setName("new");
	
		boolean makePaymentFlag = ProductAvailabilityService.isAvailable(product);
		if(makePaymentFlag) {
			System.out.println("Product is available");
			
			if(PaymentService.makePayment()) {
				System.out.println("Payment is done");
				
				ShippingService.shipProduct(product);
				System.out.println("Shipping service notified");
				orderPlaced = true;
			}
		}
		System.out.println("Order has been placed");
		return orderPlaced;
	}

}
