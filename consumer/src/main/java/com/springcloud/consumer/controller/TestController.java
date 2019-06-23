package com.springcloud.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.consumer.interf.FeignInterface;

@RestController
public class TestController {
	
	@Autowired
	FeignInterface feignInterface;
	
	@GetMapping("/getFeignInterface/{name}")
	public String feign(@PathVariable("name") String name) {
		System.out.println("hello world");
		return feignInterface.home1(name + "!");
	}
	
	@GetMapping("/api/v1/hello")
	public String hello() {
		return "hello my name is consumer";
	}
}
