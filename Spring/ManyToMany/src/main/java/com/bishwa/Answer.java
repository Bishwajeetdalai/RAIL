package com.bishwa;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Answer {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Answer;
    private String postedBy;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Question> questions;
	/**
	 * 
	 */
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param answer
	 * @param postedBy
	 * @param questions
	 */
	public Answer(int id, String answer, String postedBy, List<Question> questions) {
		super();
		this.id = id;
		Answer = answer;
		this.postedBy = postedBy;
		this.questions = questions;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the answer
	 */
	public String getAnswer() {
		return Answer;
	}
	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(String answer) {
		Answer = answer;
	}
	/**
	 * @return the postedBy
	 */
	public String getPostedBy() {
		return postedBy;
	}
	/**
	 * @param postedBy the postedBy to set
	 */
	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}
	/**
	 * @return the questions
	 */
	public List<Question> getQuestions() {
		return questions;
	}
	/**
	 * @param questions the questions to set
	 */
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	
    
}
