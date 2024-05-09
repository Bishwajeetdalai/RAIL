package com.bishwa;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	
	@Value("101")
	private int sid;
	
	@Value("Dhoni")
	private String sname;
	
	@Value("Ranchi")
	private String saddress;

	/**
	 * 
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param sid
	 * @param sname
	 * @param saddress
	 */
	public Student(int sid, String sname, String saddress) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.saddress = saddress;
	}

	/**
	 * @return the sid
	 */
	public int getSid() {
		return sid;
	}

	/**
	 * @param sid the sid to set
	 */
	public void setSid(int sid) {
		this.sid = sid;
	}

	/**
	 * @return the sname
	 */
	public String getSname() {
		return sname;
	}

	/**
	 * @param sname the sname to set
	 */
	public void setSname(String sname) {
		this.sname = sname;
	}

	/**
	 * @return the saddress
	 */
	public String getSaddress() {
		return saddress;
	}

	/**
	 * @param saddress the saddress to set
	 */
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + "]";
	}
	
	
	
	
	
}
