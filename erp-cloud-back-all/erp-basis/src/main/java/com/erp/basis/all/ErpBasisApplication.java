package com.erp.basis.all;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//����FeignԶ�̷�����ù���
@EnableFeignClients(basePackages= {"com.erp.basis.service.api"})
public class ErpBasisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErpBasisApplication.class, args);
	}

}
