package com.ezra.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	public String addSilly() {
		System.out.println(getClass()+": ADDING A MEMEBERSHIP Account");
		
		return "";
	}
	public void goToSleep() {
		System.out.println(getClass()+"Sleep()");
		
	}
}
