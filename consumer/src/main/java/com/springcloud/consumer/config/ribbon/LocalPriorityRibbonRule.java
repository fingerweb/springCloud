package com.springcloud.consumer.config.ribbon;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.Server;

public class LocalPriorityRibbonRule extends RandomRule{
	private ILoadBalancer loadbalancer;
	
	@Value("${ribbon.rule.server.match}")
	private String serverMatch;
	
	@Override
	public void setLoadBalancer(ILoadBalancer lb) {
		this.loadbalancer=lb;
	}
	
	@Override
	public Server choose(Object key) {
		if(loadbalancer == null)
			return super.choose(key);
		List<Server> serverList = loadbalancer.getReachableServers();
		
		Server matchServer = null;
		
		for(String serverMatchRule : serverMatch.split(","))
		{
			if(StringUtils.isNotEmpty(serverMatchRule) && serverMatchRule.toLowerCase().indexOf("localip") != -1)
			{
				//扩展匹配本地server, 如果本地能匹配,则访问本地
				matchServer = getLocalServer(serverList);
			}else if(StringUtils.isNotEmpty(serverMatchRule))
			{
				matchServer = getMatchServer(serverList, serverMatchRule);
			}
			if(null != matchServer)
			{
				break;
			}
		}
		if(null != matchServer)
		{
			return matchServer;
		}
		return super.choose(loadbalancer, key);
	}
	
	/**
	*	获取本地服务器
	*
	*/
	protected Server getLocalServer(List<Server> serverList) {
		Server match = null;
		
		for(Server server : serverList) {
			String localIp = getHostIp();
			if(StringUtils.isEmpty(localIp)) {
				break;
			}
			if(server.isAlive() && null != localIp && localIp.equals(server.getHost())){
				match = server;
				break;
			}
		}
		return match;
	}
	
	protected Server getMatchServer(List<Server> serverList, String matchRule)
	{
		Server match = null;
		for(Server server : serverList) {
			if(server.isAlive() && null != matchRule && matchRule.equals(server.getHost())){
				match = server;
				break;
			}
		}
		return match;
	}
	
	/**
	*	获取本地Ip
	*
	*/
	private String getHostIp()
    {
        Enumeration<NetworkInterface> interfaces = null;
        try {
            interfaces = NetworkInterface.getNetworkInterfaces();
            while (interfaces.hasMoreElements()) {
                NetworkInterface ni = interfaces.nextElement();
                Enumeration<InetAddress> addresses = ni.getInetAddresses();
                while (addresses.hasMoreElements()) {
                    InetAddress addr = addresses.nextElement();
                    if (addr != null && addr instanceof Inet4Address &&!addr.isLinkLocalAddress()&&!addr.isLoopbackAddress()) {
                        return addr.getHostAddress();
                    }
                }
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
        return null;
    }
}
