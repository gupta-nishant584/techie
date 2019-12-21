package com.example.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.entity.Customer;
import com.example.form.CustomerForm;
import com.example.form.CustomerFormNew;
import com.example.service.CustomerCrudRepositoryService;
import com.example.service.CustomerRepositoryService;



@RestController
@RequestMapping(value = "/v2", produces=MediaType.APPLICATION_JSON_VALUE)

public class CustomerController {
	
	@Autowired
	DataSource dataSource;

	@Autowired
	CustomerRepositoryService customerRepositoryService;
	
	@Autowired
	CustomerCrudRepositoryService customerCrudRepositoryService;

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping("/hello")
	public String getHello() {
		
		logger.debug("DATASOURCE =" + dataSource);
		

		List<Customer> list = customerRepositoryService.findAll();
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Customer customer = (Customer) iterator.next();	
			logger.info("Customer Data => "+customer.toString());
		}
		
		List<Customer> list2 = customerCrudRepositoryService.findByEmail("111@yahoo.com");
		for (Iterator iterator = list2.iterator(); iterator.hasNext();) {
			Customer customer = (Customer) iterator.next();	
			logger.info("One Customer Data => "+customer.toString());
		}
		
		RestTemplate restTemplate = new RestTemplate();
        String quote2 = restTemplate.getForObject("http://localhost:8080/v2/user4/", String.class);
        return quote2;
        
        
	}
	
	@RequestMapping(value = "/user/", method = RequestMethod.GET)
    public ResponseEntity<List<Customer>> listAllUsers() {
		List<Customer> list = customerRepositoryService.findAll();
        if (list == null || list.isEmpty()) {
            return new ResponseEntity<List<Customer>>(list, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Customer>>(list, HttpStatus.OK);
    }
	
	@RequestMapping(value = "/user2/", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
    public List<Customer> listAllUsers2() {
		List<Customer> list = customerRepositoryService.findAll();
        return list;
    }
	
	@RequestMapping(value = "/user3/", method = RequestMethod.GET)
    public ResponseEntity<List<CustomerForm>> listAllUsers3() {
		List<Customer> list = customerRepositoryService.findAll();
		List<CustomerForm> list2 = new ArrayList<>();
		
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Customer customer = (Customer) iterator.next();
			CustomerForm customerForm = new CustomerForm();
			customerForm.setType("success");
			customerForm.setValue(customer);
			list2.add(customerForm);
			
		}
        if (list2 == null || list2.isEmpty()) {
            return new ResponseEntity<List<CustomerForm>>(list2, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<CustomerForm>>(list2, HttpStatus.OK);
    }
	
	@RequestMapping(value = "/user4/", method = RequestMethod.GET)
    public ResponseEntity<List<CustomerFormNew>> listAllUsers4() {
		List<Customer> list = customerRepositoryService.findAll();
		List<CustomerFormNew> list2 = new ArrayList<>();
		CustomerFormNew customerForm = new CustomerFormNew();
		customerForm.setType("success");
		customerForm.setValue(list);
		list2.add(customerForm);

        if (list2 == null || list2.isEmpty()) {
            return new ResponseEntity<List<CustomerFormNew>>(list2, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<CustomerFormNew>>(list2, HttpStatus.OK);    
    }
}
