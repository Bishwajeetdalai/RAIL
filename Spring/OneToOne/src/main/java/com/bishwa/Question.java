package com.bishwa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	@Column(name = "question_id")
	
	private int questionId;
	
	private String question;
	
	@OneToOne
	private Answer answer;
	
	/**
	 * @return the questionId
	 */
	public int getQuestionId() {
		return questionId;
	}
	/**
	 * @param questionId the questionId to set
	 */
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}
	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}
	/**
	 * @return the answer
	 */
	public Answer getAnswer() {
		return answer;
	}
	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	/**
	 * @param questionId
	 * @param question
	 * @param answer
	 */
	public Question(int questionId, String question, Answer answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
	}
	/**
	 * 
	 */
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
