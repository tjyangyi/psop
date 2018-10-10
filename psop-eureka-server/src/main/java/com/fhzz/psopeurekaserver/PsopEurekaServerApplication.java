package com.fhzz.psopeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PsopEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PsopEurekaServerApplication.class, args);
	}
}
