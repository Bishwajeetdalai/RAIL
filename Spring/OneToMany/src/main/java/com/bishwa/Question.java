package com.bishwa;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name="Question_data")

public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	
	private int id;
	private String QuestionName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="qid")
	@OrderColumn(name="type")
	
	private List<Answer> answer;

	/**
	 * 
	 */
	public Question() {
		super();
		// TODO Auto-generated constructor stub
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
	 * @return the questionName
	 */
	public String getQuestionName() {
		return QuestionName;
	}

	/**
	 * @param questionName the questionName to set
	 */
	public void setQuestionName(String questionName) {
		QuestionName = questionName;
	}

	/**
	 * @return the answer
	 */
	public List<Answer> getAnswer() {
		return answer;
	}

	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	

}

