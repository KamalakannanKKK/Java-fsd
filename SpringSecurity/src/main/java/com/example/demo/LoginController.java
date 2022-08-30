package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@GetMapping("/")
	public String index() {
		return ("<h1>Home Page</h1><br><a href=\"/login\">Go to login page</a>");
	}

	@GetMapping("/users")
	public String user() {
		return ("<h1>Welcome User</h1><br><a href=\"/logout\">Logout</a>");
	}
}