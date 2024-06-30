package com.thirdgear.example.erp_api_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.thirdgear.example.erp_api_demo.service.FooService;
import com.thirdgear.example.erp_api_demo.service.TankService;
import com.thirdgear.example.erp_api_demo.service.impl.TankServiceImpl;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@ComponentScan(basePackages = {"com.thirdgear.*"}) 
public class ErpApiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErpApiDemoApplication.class, args);
	}
		
}
