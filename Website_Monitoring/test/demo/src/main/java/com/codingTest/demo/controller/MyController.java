package com.codingTest.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codingTest.demo.entities.Check;
import com.codingTest.demo.services.CheckService;

@RestController
public class MyController {
	
	@Autowired
	private CheckService checkService;
	
	
	// home
	
	@GetMapping("/home")
	public String home() {
		
		return "HomePage";	
		
	}
	
	
	// to get all checks
	
	@GetMapping("/checks")
	public List<Check> getChecks(){
		
		return this.checkService.getChecks();
		
		
	}
	
	@GetMapping("/checks/{checkId}")
	public Check getCheck(@PathVariable String checkId){
		
		return this.checkService.getCheck(Integer.parseInt(checkId));
	}
	
	// add checks

	@PostMapping("/checks")
	public Check addCheck(@RequestBody Check check) {
		
		return this.checkService.addCheck(check);
		
	}
	
	// update checks
	
	@PutMapping("/checks")
	public Check updateCheck(@RequestBody Check check) {
		
		return this.checkService.updateCheck(check);
//		
	}
	
	//status
	
	@GetMapping("/check/{name}")
	public String getDeatils(String name) {
		
		return this.checkService.getDetails(name);
	}
	
	
}
