package com.erp.basis.all.config.plugin;

import org.springframework.stereotype.Component;

import com.erp.basis.common.api.ICommonPlugin;

@Component
public class CommonPluginB implements ICommonPlugin{

	public void init() {
		System.out.println("CommonPluginB.init()");
	}

	
}
