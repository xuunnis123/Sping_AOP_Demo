package com.ezra.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.ezra.aopdemo.Account;

@Component
public class AccountDAO {
	private String name;
	private String serviceName;
	
	public void addAccount(Account theAccount) {
		System.out.println(getClass()+":doing my db back");
	}
	
	public boolean doWork() {
		System.out.println(getClass()+"doWork()");
		return true;
	}

	public String getName() {
		System.out.println(getClass()+"getName()");
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass()+"setName()");
		this.name = name;
	}

	public String getServiceName() {
		System.out.println(getClass()+"getServiceName()");
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		System.out.println(getClass()+"setServiceName()");
		this.serviceName = serviceName;
	}
	
}
