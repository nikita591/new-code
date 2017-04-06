package com.client.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.client.dao.MyDaoInterface;

@Service
//@ComponentScan("com.client.dao")
public class MyService implements MyServiceInterface{
	
	@Autowired
	MyDaoInterface myDao;
	
	
	
	@Override
	public void myserviceMethod(String ename,int empno,int salary)
	{
		
		final Logger logger = LoggerFactory.getLogger(this.getClass());
		try
		{
			
		logger.info("---------In Service-----------");
		logger.info("Staring of Myservice method----");
		myDao.mydaoMethod(ename,empno,salary);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		logger.info("Ending of Myservice method----");
	}

	

}
