package com.example.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="test")
public class Test {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	@ManyToOne
	@JoinColumn(referencedColumnName = "uid")
	private QuizUser userid;
	@ManyToOne
	@JoinColumn(referencedColumnName = "quid")
	private QuizEntity quizid;
	@ManyToOne
	@JoinColumn(referencedColumnName = "qid")
	private Question questionid;
	private int testanswer;
	
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public QuizUser getUserid() {
		return userid;
	}

	public void setUserid(QuizUser userid) {
		this.userid = userid;
	}

	public QuizEntity getQuizid() {
		return quizid;
	}

	public void setQuizid(QuizEntity quizid) {
		this.quizid = quizid;
	}

	public Question getQuestionid() {
		return questionid;
	}

	public void setQuestionid(Question questionid) {
		this.questionid = questionid;
	}

	public int getTestanswer() {
		return testanswer;
	}

	public void setTestanswer(int testanswer) {
		this.testanswer = testanswer;
	}

	@Override
	public String toString() {
		return "Test [tid=" + pid + ", userid=" + userid + ", quid=" + quizid + ", questionid=" + questionid
				+ ", testans=" + testanswer + "]";
	}
	
	

}
