package com.erp.basis.service.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("erp-co")
public interface IErpCoService {
	
	@RequestMapping(value="/co/reply", method=RequestMethod.GET)
	public String coReply();
		
}
