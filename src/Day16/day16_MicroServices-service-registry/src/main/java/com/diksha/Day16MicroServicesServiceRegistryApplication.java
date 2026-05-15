package com.diksha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Day16MicroServicesServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day16MicroServicesServiceRegistryApplication.class, args);
	}

}
