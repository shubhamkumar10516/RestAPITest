package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class RestApiTestApplication {

	@PostConstruct
	public void init() {
		System.out.println("Application started..");
	}
	public static void main(String[] args) {
		SpringApplication.run(RestApiTestApplication.class, args);
		
	
	}

}
