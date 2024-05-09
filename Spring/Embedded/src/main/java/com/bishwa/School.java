package com.bishwa;

import javax.persistence.Embeddable;

@Embeddable
public class School {

		private String SchoolName;
		private String SchoolAddress;
		/**
		 * 
		 */
		public School() {
			super();
			// TODO Auto-generated constructor stub
		}
		/**
		 * @param schoolName
		 * @param schoolAddress
		 */
		public School(String schoolName, String schoolAddress) {
			super();
			SchoolName = schoolName;
			SchoolAddress = schoolAddress;
		}
		/**
		 * @return the schoolName
		 */
		public String getSchoolName() {
			return SchoolName;
		}
		/**
		 * @param schoolName the schoolName to set
		 */
		public void setSchoolName(String schoolName) {
			SchoolName = schoolName;
		}
		/**
		 * @return the schoolAddress
		 */
		public String getSchoolAddress() {
			return SchoolAddress;
		}
		/**
		 * @param schoolAddress the schoolAddress to set
		 */
		public void setSchoolAddress(String schoolAddress) {
			SchoolAddress = schoolAddress;
		}
		@Override
		public String toString() {
			return "School [SchoolName=" + SchoolName + ", SchoolAddress=" + SchoolAddress + "]";
		}
		
		
}
