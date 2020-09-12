package com.springcloud.consumer.config;

import javax.servlet.annotation.WebListener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

@WebListener
public class InitStageListener implements ApplicationListener<ContextRefreshedEvent>{

	public void onApplicationEvent(ContextRefreshedEvent event) {
		ApplicationContext ctx = event.getApplicationContext();
		doAdditionalInit(ctx);
	}
	private void doAdditionalInit(ApplicationContext ctx) {
		System.out.println("3");
	}

}