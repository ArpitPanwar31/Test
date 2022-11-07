package com.codingTest.demo.services;

import java.util.List;

import com.codingTest.demo.entities.Check;


public interface CheckService {
	
	public List<Check> getChecks();
	
	public Check getCheck(Integer checkId);

	public Check addCheck(Check check);

	public Check updateCheck(Check check);

	public String getDetails(String name);
	

}
