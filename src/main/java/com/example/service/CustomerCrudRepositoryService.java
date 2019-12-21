package com.example.service;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.Customer;

public interface CustomerCrudRepositoryService extends CrudRepository<Customer, Long> {

	List<Customer> findByEmail(String email);

}
