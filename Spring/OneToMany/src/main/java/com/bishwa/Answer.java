package com.bishwa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Answer_Q")
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	
	private int id;
	private String answerName;
	private String postedBy;
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
	 * @return the answerName
	 */
	public String getAnswerName() {
		return answerName;
	}
	/**
	 * @param answerName the answerName to set
	 */
	public void setAnswerName(String answerName) {
		this.answerName = answerName;
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
	

}
