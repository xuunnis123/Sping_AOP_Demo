package com.ezra.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ezra.aopdemo.dao.AccountDAO;
import com.ezra.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		
		//read spring config java class -> DemoConfig
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get the bean from spring container
		AccountDAO theAccountDAO=context.getBean("accountDAO",AccountDAO.class);
		
		//get memebership bean from spring container
				MembershipDAO theMembershipDAO=
						context.getBean("membershipDAO",MembershipDAO.class);
				
		//call the business method
		Account myAccount =new Account();
		theAccountDAO.addAccount(myAccount);
		theAccountDAO.doWork();
		
		
		//call the accountdao getter/setter methods
		theAccountDAO.setName("Ezra");
		theAccountDAO.setServiceName("Golden");
		
		String name=theAccountDAO.getName();
		String service=theAccountDAO.getServiceName();
		
		theMembershipDAO.addSilly();
		theMembershipDAO.goToSleep();
		//AOP action end
		//close the context
		context.close();
	}

}
