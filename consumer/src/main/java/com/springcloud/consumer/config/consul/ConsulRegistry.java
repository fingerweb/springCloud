package com.springcloud.consumer.config.consul;

import org.springframework.cloud.consul.discovery.ConsulDiscoveryProperties;
import org.springframework.cloud.consul.discovery.HeartbeatProperties;
import org.springframework.cloud.consul.discovery.TtlScheduler;
import org.springframework.cloud.consul.serviceregistry.ConsulRegistration;
import org.springframework.cloud.consul.serviceregistry.ConsulServiceRegistry;

import com.ecwid.consul.v1.ConsulClient;

public class ConsulRegistry extends ConsulServiceRegistry{
	private ConsulDiscoveryProperties properties;
	public ConsulRegistry(ConsulClient client, 
		ConsulDiscoveryProperties properties, 
		TtlScheduler ttlScheduler,
		HeartbeatProperties heartbeatProperties) {
		super(client,properties,ttlScheduler,heartbeatProperties);	
		this.properties=properties;
	}
	
	@Override
	public void register(ConsulRegistration reg){
		//重新设计id,此处用的是名字也可以用其他方式例如instanceId,host,uri等
		if(properties.isPreferIpAddress()) {
			reg.getService().setId(reg.getService().getName()+"-"
			+reg.getService().getAddress()+"-"+reg.getService().getPort());
		}else{
			reg.getService().setId(reg.getService().getName()+"-"
			+reg.getHost()+"-"+reg.getPort());
		}
		super.register(reg);
	}
}
