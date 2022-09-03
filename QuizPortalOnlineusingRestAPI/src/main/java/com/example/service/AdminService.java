package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.Adminuser;
import com.example.bean.Question;
import com.example.bean.QuizEntity;
import com.example.bean.Report;
import com.example.repository.AdminRepository;
import com.example.repository.QuestionRepository;
import com.example.repository.QuizRepository;
import com.example.repository.UserRepository;



@Service
public class AdminService {
	@Autowired
	QuestionRepository qs;
	@Autowired
	QuizRepository qr;
	@Autowired
	UserRepository ur;
	@Autowired
	Report rep;
	@Autowired
	AdminRepository adm;
	
	
	
	
	
	public String addQuestion(Question q)
	{
		if(q!=null)
		{
			qs.save(q);
			return "question added";
		}
		else
		{
			return "failed to add";
		}
		
	}
	
	public String addQuiz(QuizEntity q)
	{
		
		if(q!=null)
		{
			qr.save(q);
			return "quiz added";
		}
		else
		{
			return "failed to add";
		}
	}
	
	public List<QuizEntity> viewAllQuiz()
	{
		return qr.findAll();
	}
	
	public Report quizInfo()
	{
		rep.setUsers(ur.findAll().size());
		rep.setQuestions(qs.findAll().size());
		rep.setQuiz(qr.listOfQuiz());
		
		return rep;

	}
	
	

}
