package com.erp.co.all.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.erp.basis.service.api.IErpFiService;

@RestController
public class FiChannelController {
	@Autowired
	private IErpFiService erpFiService;
	
	@RequestMapping(value="/fi/reply",method=RequestMethod.GET)
	public String fiRelpy() {
		return erpFiService.fiReply();
	}
}
