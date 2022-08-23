package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/hello")
	public String display() {
		return "Hello kamal";
	}

	@GetMapping("/product/{id}")
	public String getproduct(@PathVariable("id") String id) {
		if(id.equals("1"))
			throw new ProductException();
		else
			return "Product found";
	}
}
