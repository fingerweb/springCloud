package com.erp.basis.all.register;

import com.erp.basis.common.api.IExtStartListener;

public class InitPlanB implements IExtStartListener {
	
	public void invoke(){
		System.out.println("InitPlanBListener.invoke()");
	}
}