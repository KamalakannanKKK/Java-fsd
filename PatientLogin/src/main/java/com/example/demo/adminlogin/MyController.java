package com.example.demo.adminlogin;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.adminlogin.APIResponse;
import com.example.demo.adminlogin.JwtUtils;
import com.example.demo.adminlogin.LoginRequestDTO;
import com.example.demo.adminlogin.LoginService;
import com.example.demo.adminlogin.SignUpRequestDTO;


@RestController
@RequestMapping("patient")
public class MyController {
	@Autowired
	private AdminRepository userRepository;

	@Autowired
	private LoginService loginService;

	@Autowired
	private JwtUtils jwtUtils;
	@Autowired
	AdminService as;

	
	// admin login
	@PostMapping(value = "adminLogin", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<APIResponse> login(@RequestBody LoginRequestDTO loginRequestDTO) {

		APIResponse apiResponse = loginService.login(loginRequestDTO);

		return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
	}

	// adminSignup
	@PostMapping(value = "signup", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<APIResponse> signUp(@RequestBody SignUpRequestDTO signUpRequestDTO) {

		APIResponse apiResponse = loginService.signUp(signUpRequestDTO);

		return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
	}

	// admin change password
	@PutMapping(value = "changepassword/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Adminuser> updateTutorial(@PathVariable("id") long id, @RequestBody Adminuser newtutorial) {

		// Serach for record in table
		Optional<Adminuser> tutorialData = userRepository.findById(id);
		if (tutorialData.isPresent()) {
			Adminuser oldtutorial = tutorialData.get();
			oldtutorial.setPassword(newtutorial.getPassword());
			return new ResponseEntity<>(userRepository.save(oldtutorial), HttpStatus.OK);

		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	// Token authentication
	@GetMapping("/authenttoken")
	public ResponseEntity<APIResponse> privateApi(@RequestHeader(value = "authorization") String auth)
			throws Exception {
		APIResponse apiResponse = new APIResponse();

		jwtUtils.verify(auth);

		apiResponse.setData("Authentication done with token and Admin Can Do Modification");
		return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
	}

	
}
