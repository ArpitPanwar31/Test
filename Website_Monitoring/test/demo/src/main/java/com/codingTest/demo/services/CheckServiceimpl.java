package com.codingTest.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.codingTest.demo.dao.CheckDao;
import com.codingTest.demo.entities.Check;

@Service
public class CheckServiceimpl implements CheckService {
	
//	@Autowired
//	private CheckDao checkDao;

	List<Check> list;
	
	public CheckServiceimpl() {
		
		list = new ArrayList<>();
		list.add(new Check(145,"Google","https://www.google.co.in/",12.13,"up"));
		list.add(new Check(321,"Youtube","https://www.youtube.co.in/",09.20,"down"));
		
		
	}
	
	
	@Override
	public List<Check> getChecks() {
		
		
		return list;
		//return checkDao.findAll();
	}


	@Override
	public Check getCheck(Integer checkId) {
		
		Check c = null;
		for(Check check:list) {
			
			if(check.getCheckId()==checkId)
			{
				c=check;	
			}
					
			
		}
		
		return c;
		//return checkDao.getOne(checkId);
	}


	@Override
	public Check addCheck(Check check) {
		
		list.add(check);
		//checkDao.save(check);

		return check;
	}


	@Override
	public Check updateCheck(Check check) {
		
		list.forEach(e ->{
			if(e.getCheckId()==check.getCheckId()) {
				e.setStatus(check.getStatus());
			}
		});
		//checkDao.save(check);
		return check;
	}


	@Override
	public String getDetails(String name) {
		
		String status="";
		for(Check c:list) {
			
			if(c.getWebsiteName()==name)
			{
				status = c.getStatus();
				break;
			}
					
			
		}
		
		

		return status;
	}
}
