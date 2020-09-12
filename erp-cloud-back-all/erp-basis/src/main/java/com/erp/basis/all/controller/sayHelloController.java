package com.erp.basis.all.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sayHelloController {

	@RequestMapping(value="/basis/sayhello",method=RequestMethod.GET)
	public String say(@RequestParam int id) {
		return "Number:" + id +",hello";
	}
	
	@RequestMapping(value="/sayhi",method=RequestMethod.GET)
	public String sayHi(@RequestParam int id) {
		return "Number:" + id +",hi";
	}
}
