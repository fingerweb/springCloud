package com.erp.fi.all;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//开启Feign远程服务调用功能
@EnableFeignClients(basePackages= {"com.erp.basis.service.api"})
public class ErpFiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErpFiApplication.class, args);
	}

}
