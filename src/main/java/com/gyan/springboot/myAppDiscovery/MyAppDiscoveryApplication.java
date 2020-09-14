package com.gyan.springboot.myAppDiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MyAppDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyAppDiscoveryApplication.class, args);
	}

}
