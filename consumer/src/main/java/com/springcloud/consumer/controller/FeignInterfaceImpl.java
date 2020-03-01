package com.springcloud.consumer.controller;

import org.springframework.web.bind.annotation.RestController;

import com.springcloud.consumer.interf.FeignInterface;

@RestController
public class FeignInterfaceImpl implements FeignInterface{

	public String home(String name) {
		System.out.println(name);
		return null;
	}

}
