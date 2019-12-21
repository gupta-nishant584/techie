package com.example.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;

import javax.transaction.Transactional;

import com.example.common.QueryProperties;
import com.example.common.ProjectConstants;

import com.example.dao.BasicPlanDAO;
import com.example.entity.BasicPlan;

@Repository
public class BasicPlanDAOImpl implements BasicPlanDAO {

	private final Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private  EntityManager entityManager;
	
	@Autowired
	private QueryProperties queryProperties;
	
	ProjectConstants ProjectConstants;
	
	@Override
	@Transactional
	public List<BasicPlan> findAll() {
		logger.info("#### Calling BASIC_PLAN_ALL QUERY #####");
		return entityManager.createQuery(ProjectConstants.BASIC_PLAN_ALL).getResultList();
	}

	@Override
	@Transactional
	public BasicPlan findBasicPlan() {
		List<BasicPlan> basePlanList=null;
		BasicPlan basicPlan=null;
		
		logger.info("#### Calling BASIC_PLAN #####");
		basePlanList=entityManager.createQuery(ProjectConstants.BASIC_PLAN).getResultList();
		if(basePlanList!=null && basePlanList.size()>0) {
			basicPlan=basePlanList.get(0);
		}
		logger.info("#### basicPlan #####"+basicPlan);
		return basicPlan;
		
	}

}
