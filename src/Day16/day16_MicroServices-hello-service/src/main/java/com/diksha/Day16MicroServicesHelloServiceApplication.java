package com.diksha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Day16MicroServicesHelloServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day16MicroServicesHelloServiceApplication.class, args);
	}

}
