package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DeployAwsAppApplication {
    @GetMapping("/")
	public String Home() {
		return "Spring Boot Appis Successfully Deployed !!!!!!!";
	}
    
	public static void main(String[] args) {
		SpringApplication.run(DeployAwsAppApplication.class, args);
	}

}
