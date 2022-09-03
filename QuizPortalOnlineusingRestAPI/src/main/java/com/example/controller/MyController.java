package com.example.controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.Adminuser;
import com.example.bean.Question;
import com.example.bean.QuizEntity;
import com.example.bean.QuizUser;
import com.example.bean.Report;
import com.example.bean.Result;
import com.example.bean.Test;
import com.example.repository.AdminRepository;
import com.example.adminlogin.APIResponse;
import com.example.adminlogin.LoginRequestDTO;
import com.example.adminlogin.LoginService;
import com.example.adminlogin.SignUpRequestDTO;
import com.example.adminlogin.JwtUtils;
import com.example.service.AdminService;
import com.example.service.UserService;

@RestController
@RequestMapping("mcq")
public class MyController {
	@Autowired
	UserService us;
	@Autowired
	private AdminRepository userRepository;
	@Autowired
	private LoginService loginService;

	@Autowired
	private JwtUtils jwtUtils;
	@Autowired
	AdminService as;

	// user login
	@PostMapping(value = "userLogin", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String userLogin(@RequestBody QuizUser u) {
		return us.userLogin(u.getEmailid(), u.getPassword());
	}

	// user register
	@PostMapping(value = "userRegister", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String userRegiter(@RequestBody QuizUser u) {
		return us.userRegister(u);
	}

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

	// Add Questions
	@PostMapping(value = "addQuestions", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String addQuestion(@RequestBody Question q) {
		return as.addQuestion(q);
	}

	// Add Quiz
	@PostMapping(value = "addQuiz", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String addQuiz(@RequestBody QuizEntity q) {
		return as.addQuiz(q);
	}

	// View All Quiz
	@GetMapping(value = "viewAllQuiz", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<QuizEntity> viewAllQuiz() {
		return as.viewAllQuiz();
	}

	// Quiz info
	@GetMapping(value = "quizinfo", produces = MediaType.APPLICATION_JSON_VALUE)
	public Report quizinfo() {
		return as.quizInfo();
	}

	// View Quiz
	@GetMapping(value = "viewQuiz", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Object> viewQuiz() {
		return us.viewAllQuiz();
	}

	// Take Test
	@PostMapping(value = "takeTest", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String takeTest(@RequestBody Test t) {
		return us.takeTest(t);
	}

	// Get All Test
	@GetMapping(value = "getAllTest", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Test> getAllTest() {
		return us.getTestList();
	}

	//Get result
	@GetMapping(value = "getresult", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Result> getresult() {
		return us.result();
	}

	//Get Admin Result
	@GetMapping(value = "getAdminResult", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Result> getAdminResult() {
		return us.result();
	}

}
