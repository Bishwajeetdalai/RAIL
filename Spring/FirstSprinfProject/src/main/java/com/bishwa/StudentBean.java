package com.bishwa;

public class StudentBean {

	
	private int StdId;
	private String Name;
	private int rollno;
	/**
	 * 
	 */
	public StudentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param stdId
	 * @param name
	 * @param rollno
	 */
	public StudentBean(int stdId, String name, int rollno) {
		super();
		StdId = stdId;
		Name = name;
		this.rollno = rollno;
	}
	/**
	 * @return the stdId
	 */
	public int getStdId() {
		return StdId;
	}
	/**
	 * @param stdId the stdId to set
	 */
	public void setStdId(int stdId) {
		StdId = stdId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * @return the rollno
	 */
	public int getRollno() {
		return rollno;
	}
	/**
	 * @param rollno the rollno to set
	 */
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
	
}
