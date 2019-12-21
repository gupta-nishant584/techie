package com.example.service;

import java.util.List;
import com.example.entity.BasicPlan;


public interface BasicPlanService {
	
	public List<BasicPlan> findAll();
	public BasicPlan findBasicPlan();

}
