package com.amu.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.amu.school.client")
public class SchoolApplication {
	public static void main(String[] args) {
		SpringApplication.run(SchoolApplication.class, args);
	}
}
