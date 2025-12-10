package com.sagnik.companyserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CompanyserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyserverApplication.class, args);
	}

}
