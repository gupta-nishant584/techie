package com.example.service;


import java.util.List;

import com.example.entity.Customer;

public interface CustomerRepositoryService  {

	List<Customer> findAll();
	
	public void saveCustomer(Customer customerVO);
}
