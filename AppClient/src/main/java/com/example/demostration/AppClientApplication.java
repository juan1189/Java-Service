package com.example.demostration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example")
@SpringBootApplication
public class AppClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppClientApplication.class, args);
	}
}
