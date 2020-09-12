package com.erp.basis.all.register;

import java.util.ServiceLoader;

import com.erp.basis.common.api.IExtStartListener;

public class ServiceLoaderRegisteringListener {
	public void register(){
		ServiceLoader<IExtStartListener> exstartListener = ServiceLoader.load(IExtStartListener.class);
		for(IExtStartListener ex : exstartListener) {
			ex.invoke();
		}
	}
}
