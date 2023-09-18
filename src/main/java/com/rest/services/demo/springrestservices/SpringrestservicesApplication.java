package com.rest.services.demo.springrestservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringrestservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringrestservicesApplication.class, args);
		System.out.print("Running on port 8080");
	}

}
