package com.example.service;
import com.example.bean.Adminuser;
import com.example.bean.Question;
import com.example.bean.QuizEntity;
import com.example.bean.QuizUser;
import com.example.bean.Report;
import com.example.bean.Result;
import com.example.bean.Test;
import com.example.repository.AdminRepository;
import com.example.repository.QuestionRepository;
import com.example.repository.QuizRepository;
import com.example.repository.TestRepository;
import com.example.repository.UserRepository;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
	
	
	List<Result> finalList=new ArrayList<>();
	@Autowired
	UserRepository ur;
	@Autowired
	QuizRepository qr;
	@Autowired
	TestRepository tr;
	@Autowired

	QuizUser u;
	@Autowired
	Test t;

	Result r= new Result();
	
	public String userLogin(String email,String password)
	{
		u=ur.findByEmailid(email);
		if(u!=null)
		{
			
		
		if(u.getEmailid().equals(email)&&u.getPassword().equals(password))
		{
			return "login sucessfull";
		}
		else
		{
			return "invalid credentials";
		}
		
		
	}
	else
	{
		return "User not found";
	}
		

  }
	
	
	public String userRegister(QuizUser u)
	{
		if(ur.findByEmailid(u.getEmailid())==null)
		{
			ur.save(u);
			return "registered";
		}
		else
		{
			return "User already exists";
		}
	}
	
	public List<Object> viewAllQuiz()
	{
		return qr.listOfQuiz();
	}
	
	public String takeTest(Test t)
	{
		if(t!=null)
		{
			tr.save(t);
			return "submitted";
		}
		
		else
		{
			return "submission failed";
		}
			
	}
	
	public List<Test> getTestList()
	{
		return tr.findAll();
	}
	
	public List<Result> result()
	{	
		String email="";
		int mark=0;
		List<Test> obj=tr.findAll();
		List<QuizUser> u= ur.findAll();
		for (QuizUser user : u) {
			mark=0;
			email=user.getEmailid();
			System.out.println(user.getEmailid());
			
			for(Test ob :obj)
			{
				if(user.getUid()==ob.getUserid().getUid())
				{
					
					if(ob.getTestanswer()==ob.getQuestionid().getAns())
					{
						mark++;
					}
					System.out.println("inside"+mark);
					
				}
			}
			System.out.println("outside"+mark);
		
			
			
			
			finalList.add(new Result(email,mark));	
		}

		
		System.out.println("final :"+mark);
		
		Collections.sort(finalList);
		
		return finalList;
		
	}
}
