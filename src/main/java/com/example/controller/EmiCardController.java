package com.example.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.entity.BasicPlan;
import com.example.entity.Customer;
import com.example.entity.GenericDetails;
import com.example.entity.Station;
import com.example.entity.StationBeanList;
import com.example.form.CustomerForm;
import com.example.form.CustomerFormNew;
import com.example.form.Quote;
import com.example.service.BasicPlanService;
import com.example.service.CustomerCrudRepositoryService;
import com.example.service.CustomerRepositoryService;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.example.exception.ResourceNotFoundException;


@RestController
@RequestMapping(value="/v2/RT")
public class EmiCardController {

	@Autowired
	private CustomerRepositoryService customerRepositoryService;
	
	@Autowired
	private CustomerCrudRepositoryService customerCrudRepositoryService;
	
	@Autowired
	private BasicPlanService basicPlanService;
	
	private  final Logger logger=LoggerFactory.getLogger(this.getClass());
	
	
	@RequestMapping(value="/json",method=RequestMethod.GET,produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity parseJsonData(){
		
		RestTemplate restTemplate=new RestTemplate();
		
		/** Get the response in String */
		/*String result=restTemplate.getForObject("https://feeds.citibikenyc.com/stations/stations.json", String.class);
		logger.info("### result ###"+result);*/
		
		/** Convert the String into GSON open library Object*/
		/*Gson g = new Gson();
		Station p = g.fromJson(result, Station.class);*/ //Dependencies issues
		
		Station station=restTemplate.getForObject("https://feeds.citibikenyc.com/stations/stations.json", Station.class);
		logger.info("### station ###"+station);
		
		List<StationBeanList> stationBeanList=null;
		Optional<Station> stationOpt=Optional.ofNullable(station);
		
		if(stationOpt.isPresent() && !stationOpt.get().getExecutionTime().isEmpty()) {
			String executionTime=stationOpt.get().getExecutionTime();
			logger.info("### executionTime ###"+executionTime);
			
			stationBeanList=stationOpt.get().getStationBeanList();
			for(StationBeanList s:stationBeanList) {
				logger.info("### stationBeanList ###"+stationBeanList);
			}
		}
		
		return new ResponseEntity(stationOpt,HttpStatus.OK);
	}
	
	@RequestMapping(value="/EmiCard",method=RequestMethod.POST,produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public BasicPlan createEmiCard(@RequestBody GenericDetails GenericDetails) throws ResourceNotFoundException{
		BasicPlan basicPlan=null;
		HttpStatus status;
		
		//old legacy style code 
		//if(GenericDetails!=null && ( GenericDetails.getEmiCardNo()==null || GenericDetails.getEmiCardNo().equalsIgnoreCase("") || GenericDetails.getEmiCardNo().isEmpty())) {
		
		//Java 8 code with Optional Class
		Optional<GenericDetails> genericDetails=Optional.ofNullable(GenericDetails);
		if(genericDetails.isPresent() && genericDetails.get().getEmiCardNo().isEmpty()) {
			
			logger.info("### GenericDetails Received ###"+GenericDetails);
			basicPlan=basicPlanService.findBasicPlan();	
			if(null==basicPlan) {
				throw new ResourceNotFoundException(" No Offers found for the search crieteria ");
			} 
			status=HttpStatus.FOUND;
			
			Customer customer=new Customer(GenericDetails.getCustomerName(),GenericDetails.getCustomerEmail(),new java.util.Date(),GenericDetails.getCustomerMobile());
			try {
				customerRepositoryService.saveCustomer(customer);
			}catch(Exception e) {e.printStackTrace();}
			
			return basicPlan;
			
			//return new ResponseEntity(basicPlan,status);
		}else {
			StringBuffer sb=new StringBuffer(" Welcome "+GenericDetails.getCustomerName()+" !!!!! Greeting of the day. We are ready to serve you with the More option soon.");
			basicPlan.setPlanName(sb.toString());
			status=HttpStatus.OK;
			return basicPlan;
			//return new ResponseEntity(basicPlan,status);
		}
		
		
	}
}
