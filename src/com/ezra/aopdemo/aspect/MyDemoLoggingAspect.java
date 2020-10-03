package com.ezra.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//this class called Aspect
@Aspect
@Component
public class MyDemoLoggingAspect {
		
		//this is where we add all of our related advices for logging
	
		//lets start with an @Before advice
//		@Before("execution(public void com.ezra.aopdemo.dao.AccountDAO.addAccount())")
//	@Before("execution(public void add*())")
//		@Before("execution(* add*(com.ezra.aopdemo.Account))")	
		
		@Pointcut("execution(* com.ezra.aopdemo.dao.*.*(..))")
		private void forDaoPackage() {}
		
		
		//create pointcut for getter methods
		@Pointcut("execution(* com.ezra.aopdemo.dao.*.get*(..))")
		private void getter() {}
		
		//create pointcut for setter methods
		@Pointcut("execution(* com.ezra.aopdemo.dao.*.set*(..))")
		private void setter() {}
		
		//create pointcut:include package ... exclude getter/setter
		@Pointcut("forDaoPackage() && !( getter() || setter() )")
		private void forDaoPackageNoGetterSetter() {}
		
		@Before("forDaoPackageNoGetterSetter()")
		public void beforeAddAccountAdvice() {
			System.out.println("\n======>Executing @Before adivce on addAccount()");
			
		}
		@Before("forDaoPackageNoGetterSetter()")
		public void performApiAnalytics() {
			System.out.println("\n====> use on performApiAnalytics");
			
		}
		
		
		
}
