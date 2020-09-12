package com.erp.basis.all.register;

import com.erp.basis.common.api.IExtStartListener;

public class InitPlanA implements IExtStartListener {

	public void invoke(){
		System.out.println("InitPlanAListener.invoke()");
	}
}