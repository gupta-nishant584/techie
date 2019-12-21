package com.example.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.common.QueryProperties;
import com.example.dao.CustomerRepositoryDAO;
import com.example.entity.Customer;

@Repository
public class CustomerRepositoryDAOImpl implements CustomerRepositoryDAO{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	 @Autowired
	 private EntityManager entityManager;
	 
	 @Autowired
	 QueryProperties queryProperties;


	@Override
	public List<Customer> findAll() {
		logger.debug("1=> queryProperties.getQueryForFindAll() => "+queryProperties.getQueryForFindAll());
		return entityManager.createQuery(queryProperties.getQueryForFindAll()).getResultList();
	}
	
	
	@Override
	public void saveCustomer(Customer customerVO) {
		logger.info(":::::: Persisting the details :::::: "+customerVO);
		entityManager.merge(customerVO);
		logger.info(":::::: Persisted Successfully :::::: "+customerVO);
	}

}
