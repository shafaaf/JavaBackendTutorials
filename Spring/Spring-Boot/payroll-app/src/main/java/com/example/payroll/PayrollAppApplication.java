package com.example.payroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication is a meta-annotation that pulls in component scanning, autoconfiguration, and property support
@SpringBootApplication
public class PayrollAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayrollAppApplication.class, args);
	}
}
