package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController {
	@GetMapping("/info")
 public Product display() {
	 RestTemplate t=new RestTemplate();
	 Product y=t.getForObject("http://localhost:8081/productinfo",Product.class);
	 return y;
 }
}
