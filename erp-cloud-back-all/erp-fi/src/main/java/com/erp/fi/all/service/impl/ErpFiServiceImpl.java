package com.erp.fi.all.service.impl;

import org.springframework.web.bind.annotation.RestController;

import com.erp.basis.service.api.IErpFiService;

@RestController
public class ErpFiServiceImpl implements IErpFiService{

	public String fiReply() {
		return "erp-fi";
	}

}
