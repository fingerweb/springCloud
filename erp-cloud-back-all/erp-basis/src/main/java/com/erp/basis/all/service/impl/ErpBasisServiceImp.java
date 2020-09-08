package com.erp.basis.all.service.impl;

import org.springframework.web.bind.annotation.RestController;

import com.erp.basis.service.api.IErpBasisService;

@RestController
public class ErpBasisServiceImp implements IErpBasisService{
	
	public String basisReply() {
		return "erp-basis";
	}

}
