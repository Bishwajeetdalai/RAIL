package com.bishwa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {

@Id
@Column(name = "answer_id")
	private int answerId;
	private String answer;
	/**
	 * @return the answerId
	 */
	public int getAnswerId() {
		return answerId;
	}
	/**
	 * @param answerId the answerId to set
	 */
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	/**
	 * @return the answer
	 */
	public String getAnswer() {
		return answer;
	}
	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	/**
	 * 
	 */
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param answerId
	 * @param answer
	 */
	public Answer(int answerId, String answer) {
		super();
		this.answerId = answerId;
		this.answer = answer;
	}


}
