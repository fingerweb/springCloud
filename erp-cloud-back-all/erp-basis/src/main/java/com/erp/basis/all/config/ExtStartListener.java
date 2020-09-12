package com.erp.basis.all.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.erp.basis.all.register.ServiceLoaderRegisteringListener;

@Configuration
public class ExtStartListener {
	
	@Bean
	public ServiceLoaderRegisteringListener serviceLoaderRegisteringListener(){
		return new ServiceLoaderRegisteringListener();
	}
}
