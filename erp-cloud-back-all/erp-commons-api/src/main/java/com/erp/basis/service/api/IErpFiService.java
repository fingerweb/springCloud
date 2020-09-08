package com.erp.basis.service.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("erp-fi")
public interface IErpFiService {
	
	@RequestMapping(value="/fi/reply",method=RequestMethod.GET)
	public String fiReply();
}
