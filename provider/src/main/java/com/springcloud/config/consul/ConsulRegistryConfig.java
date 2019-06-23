package com.springcloud.config.consul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.consul.discovery.ConsulDiscoveryProperties;
import org.springframework.cloud.consul.discovery.HeartbeatProperties;
import org.springframework.cloud.consul.discovery.TtlScheduler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ecwid.consul.v1.ConsulClient;

@Configuration
public class ConsulRegistryConfig{
	@Autowired(required = false)
	private TtlScheduler ttlScheduler;
	//重写register方法
	@Bean
	public ConsulRegistry consulServiceRegistry(ConsulClient consulClient, 
		ConsulDiscoveryProperties properties, 
		HeartbeatProperties heartbeatProperties){
			return new ConsulRegistry(consulClient,properties,ttlScheduler,heartbeatProperties);
		}
}
