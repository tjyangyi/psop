package com.fhzz.psop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PsopAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(PsopAdminApplication.class, args);
	}

}
