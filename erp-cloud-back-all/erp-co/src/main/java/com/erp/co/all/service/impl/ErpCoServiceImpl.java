package com.erp.co.all.service.impl;

import org.springframework.web.bind.annotation.RestController;

import com.erp.basis.service.api.IErpCoService;

@RestController
public class ErpCoServiceImpl implements IErpCoService{

	public String coReply() {
		return "erp-co";
	}

}
