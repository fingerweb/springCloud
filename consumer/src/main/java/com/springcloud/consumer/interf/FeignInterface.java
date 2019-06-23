package com.springcloud.consumer.interf;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="provider")
public interface FeignInterface {
	@RequestMapping(value="/api/v1/",method = RequestMethod.GET)
	public String home1(@RequestParam(value = "name") String name);
}
