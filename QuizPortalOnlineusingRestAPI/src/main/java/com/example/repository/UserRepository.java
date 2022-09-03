package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bean.QuizUser;
@Repository
public interface UserRepository extends JpaRepository<QuizUser, Integer>{
	
	 public QuizUser findByEmailid(String emailid);

}

