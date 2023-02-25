package com.br.p2as.p2as.Api.Gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class P2asApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(P2asApiGatewayApplication.class, args);
	}

}
