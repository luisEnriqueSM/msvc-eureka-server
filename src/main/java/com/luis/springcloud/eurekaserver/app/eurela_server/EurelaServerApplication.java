package com.luis.springcloud.eurekaserver.app.eurela_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurelaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurelaServerApplication.class, args);
	}

}
