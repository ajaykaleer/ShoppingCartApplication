package com.shoppingcart.CatalogService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CatalogServiceApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(CatalogServiceApplication.class, args);
		System.out.print("Your catalogService is running");

	}

}
