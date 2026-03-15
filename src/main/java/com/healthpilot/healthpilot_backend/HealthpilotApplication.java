package com.healthpilot.healthpilot_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HealthpilotApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthpilotApplication.class, args);
		System.out.println("Api is started");
	}

}
