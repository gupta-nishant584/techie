package com.example.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CustomerRepositoryDAO;
import com.example.entity.Customer;
import com.example.service.CustomerRepositoryService;

@Service
@Transactional
public class CustomerRepositoryServiceImpl implements CustomerRepositoryService{

	 @Autowired
	 CustomerRepositoryDAO customerRepositoryDAO;


	@Override
	public List<Customer> findAll() {
		return customerRepositoryDAO.findAll();
	}

	
	@Override
	public void saveCustomer(Customer customerVO) {
		customerRepositoryDAO.saveCustomer(customerVO);
		
	}

}
