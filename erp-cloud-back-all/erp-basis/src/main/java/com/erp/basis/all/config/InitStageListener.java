package com.erp.basis.all.config;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.erp.basis.common.api.ICommonPlugin;

@Component
public class InitStageListener implements ApplicationListener<ContextRefreshedEvent>{
	
	public void onApplicationEvent(ContextRefreshedEvent event) {
		ApplicationContext ctx = event.getApplicationContext();
		doAdditionalInit(ctx);
	}
	private void doAdditionalInit(ApplicationContext ctx) {
 		Map<String, ICommonPlugin> inits = ctx.getBeansOfType(ICommonPlugin.class);
		for(Map.Entry<String, ICommonPlugin> entry : inits.entrySet()) {
			ICommonPlugin commonPlugin = entry.getValue();
			commonPlugin.init();
		}
	}

}
