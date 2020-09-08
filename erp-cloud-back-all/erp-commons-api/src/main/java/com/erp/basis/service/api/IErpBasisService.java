package com.erp.basis.service.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("erp-basis")
public interface IErpBasisService {
	
	@RequestMapping(value="/basis/reply", method=RequestMethod.GET)
	public String basisReply();
		
}
