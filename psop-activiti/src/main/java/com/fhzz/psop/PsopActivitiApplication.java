package com.fhzz.psop;

import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//这里要加上exclude = SecurityAutoConfiguration.class 否则启动报错
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class PsopActivitiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PsopActivitiApplication.class, args);
	}
}
