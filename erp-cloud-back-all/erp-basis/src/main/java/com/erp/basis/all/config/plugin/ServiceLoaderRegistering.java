package com.erp.basis.all.config.plugin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.erp.basis.all.register.ServiceLoaderRegisteringListener;
import com.erp.basis.common.api.ICommonPlugin;

@Component
public class ServiceLoaderRegistering implements ICommonPlugin{
	@Autowired
	private ServiceLoaderRegisteringListener serviceLoaderRegister;

	public void init(){
		serviceLoaderRegister.register();
	}
}
