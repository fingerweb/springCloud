package com.erp.basis.all.config;

import java.util.Map;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import com.erp.basis.common.api.ICommonPlugin;

@WebListener
public class InitStageListener implements ServletContextListener, ApplicationListener<ContextRefreshedEvent>{
	
	public void contextInitialized(ServletContextEvent arg0) {
	    System.out.println("IndexListener contextInitialized method");
	}
	
	public void contextDestroyed(ServletContextEvent arg0) {
	    System.out.println("IndexListener contextDestroyed method");
	}
	
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
