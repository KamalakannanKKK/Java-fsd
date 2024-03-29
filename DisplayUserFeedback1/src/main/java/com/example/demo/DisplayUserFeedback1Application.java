package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@ComponentScan(basePackages="com")

@EntityScan(basePackages="com")
@EnableJpaRepositories(basePackages="com")
public class DisplayUserFeedback1Application {

	public static void main(String[] args) {
		SpringApplication.run(DisplayUserFeedback1Application.class, args);
	}

}
