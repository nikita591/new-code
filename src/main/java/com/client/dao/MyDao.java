package com.client.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class MyDao implements MyDaoInterface {
	final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	
	public void mydaoMethod(String ename,int empno,int salary) {
		
		
		logger.info("Staring of Dao method----");
		// TODO Auto-generated method stub
		try
		{
		logger.info("--------In Dao---------");
		logger.info("Values Fetch from Controller ----");
		logger.info("Employee Name is "+ename);
		logger.info("Employee ID is "+empno);
		logger.info("Employee Salary is "+salary);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		logger.info("Ending of Dao method----");
		
	}
	
	

}
