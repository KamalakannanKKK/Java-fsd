package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.bean.QuizEntity;

@Repository
public interface QuizRepository extends JpaRepository<QuizEntity, Integer>{

	@Query("select q.title,count(distinct q.quizno) from QuizEntity as q group by q.quizno")
	public List<Object> listOfQuiz();
	
}
