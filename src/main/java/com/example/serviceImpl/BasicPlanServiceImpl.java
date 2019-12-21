package com.example.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.BasicPlanDAO;
import com.example.entity.BasicPlan;
import com.example.service.BasicPlanService;

@Service
public class BasicPlanServiceImpl implements BasicPlanService{
	
	@Autowired
	BasicPlanDAO basicPlanDAO;
	
	@Override
	public List<BasicPlan> findAll(){
		return basicPlanDAO.findAll();
	}
	
	@Override
	public BasicPlan findBasicPlan() {
		return basicPlanDAO.findBasicPlan();
	}

}
