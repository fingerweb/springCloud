package com.springcloud.consumer.config.ribbon;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;

@Configuration
public class RibbonClientConfiguration {
	@Bean
	public IRule ribbonRule() {
		return new LocalPriorityRibbonRule();
	}
}
