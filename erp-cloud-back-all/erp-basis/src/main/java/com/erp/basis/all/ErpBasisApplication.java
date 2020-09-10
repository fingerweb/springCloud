package com.erp.basis.all;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

import com.erp.basis.all.config.InitStageListener;


//开启Feign远程服务调用功能
@EnableFeignClients(basePackages= {"com.erp.basis.service.api"})
@ServletComponentScan
@ComponentScan
@SpringBootApplication
public class ErpBasisApplication {

	public static void main(String[] args) {
		
		SpringApplication application = new SpringApplication(ErpBasisApplication.class);
		//application.addListeners(new InitStageListener());
		application.run(args);
	}

}
