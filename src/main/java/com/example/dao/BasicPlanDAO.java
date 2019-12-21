package com.example.dao;

import java.util.List;

import com.example.entity.BasicPlan;

public interface BasicPlanDAO {

	public List<BasicPlan> findAll();
	
	public BasicPlan findBasicPlan();
}
