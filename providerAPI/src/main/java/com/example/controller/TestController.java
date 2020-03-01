package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.service.PersonDataService;

@RestController
public class TestController {
	
	@GetMapping("/v2/api")
	public String sayHello() {
		return "providerAPI : sayHello()";
	}
	
	@GetMapping("/getGroupName")
	public String getGroupName() {
		return PersonDataService.personGroup.getGroupName() + "11";
	}
}
