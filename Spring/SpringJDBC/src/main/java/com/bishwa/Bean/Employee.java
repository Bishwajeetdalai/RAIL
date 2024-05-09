package com.bishwa.Bean;

public class Employee {
	private int eid;
	private String ename;
	private String Desgn ;
	/**
	 * 
	 */
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param eid
	 * @param ename
	 * @param desgn
	 */
	public Employee(int eid, String ename, String desgn) {
		super();
		this.eid = eid;
		this.ename = ename;
		Desgn = desgn;
	}
	/**
	 * @return the eid
	 */
	public int getEid() {
		return eid;
	}
	/**
	 * @param eid the eid to set
	 */
	public void setEid(int eid) {
		this.eid = eid;
	}
	/**
	 * @return the ename
	 */
	public String getEname() {
		return ename;
	}
	/**
	 * @param ename the ename to set
	 */
	public void setEname(String ename) {
		this.ename = ename;
	}
	/**
	 * @return the desgn
	 */
	public String getDesgn() {
		return Desgn;
	}
	/**
	 * @param desgn the desgn to set
	 */
	public void setDesgn(String desgn) {
		Desgn = desgn;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", Desgn=" + Desgn + "]";
	}
	
}
