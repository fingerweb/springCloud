package com.erp.fi.all.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.erp.basis.service.api.IErpBasisService;

@RestController
public class BasisChannelController {
	
	@Autowired
	private IErpBasisService erpBasisService;
	
	@RequestMapping(value="/basis/reply",method=RequestMethod.GET)
	public String fiRelpy() {
		return erpBasisService.basisReply();
	}
}
