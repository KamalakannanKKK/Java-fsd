package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	
	@GetMapping("/productinfo")
	public Product getProduct() {
		Product product=new Product();
		product.setPid("10");
		product.setProductname("Sugar");
		return product;
	}
	
	

}
