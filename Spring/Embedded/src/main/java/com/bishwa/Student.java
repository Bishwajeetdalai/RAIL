package com.bishwa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_Record")
public class Student {

		@Id
		 private int id;
		 private String SName;
		 private int Rollno;
		 private String ADDRESS;
		 private School school;
		/**
		 * 
		 */
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		/**
		 * @param id
		 * @param sName
		 * @param rollno
		 * @param aDDRESS
		 * @param school
		 */
		public Student(int id, String sName, int rollno, String aDDRESS, School school) {
			super();
			this.id = id;
			SName = sName;
			Rollno = rollno;
			ADDRESS = aDDRESS;
			this.school = school;
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
		 * @return the sName
		 */
		public String getSName() {
			return SName;
		}
		/**
		 * @param sName the sName to set
		 */
		public void setSName(String sName) {
			SName = sName;
		}
		/**
		 * @return the rollno
		 */
		public int getRollno() {
			return Rollno;
		}
		/**
		 * @param rollno the rollno to set
		 */
		public void setRollno(int rollno) {
			Rollno = rollno;
		}
		/**
		 * @return the aDDRESS
		 */
		public String getADDRESS() {
			return ADDRESS;
		}
		/**
		 * @param aDDRESS the aDDRESS to set
		 */
		public void setADDRESS(String aDDRESS) {
			ADDRESS = aDDRESS;
		}
		/**
		 * @return the school
		 */
		public School getSchool() {
			return school;
		}
		/**
		 * @param school the school to set
		 */
		public void setSchool(School school) {
			this.school = school;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", SName=" + SName + ", Rollno=" + Rollno + ", ADDRESS=" + ADDRESS
					+ ", school=" + school + "]";
		}
		 
		
		 
}
