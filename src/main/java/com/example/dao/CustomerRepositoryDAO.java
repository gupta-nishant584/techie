package com.example.dao;


import java.util.List;

import com.example.entity.Customer;

public interface CustomerRepositoryDAO  {

	List<Customer> findAll();
	
	public void saveCustomer(Customer customerVO);
}
