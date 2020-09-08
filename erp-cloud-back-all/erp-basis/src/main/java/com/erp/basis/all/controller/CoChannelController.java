package com.erp.basis.all.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.erp.basis.service.api.IErpCoService;

@RestController
public class CoChannelController {

	@Autowired
	private IErpCoService erpCoService;
	
	@RequestMapping(value="/co/reply",method=RequestMethod.GET)
	public String fiRelpy() {
		return erpCoService.coReply();
	}
}
