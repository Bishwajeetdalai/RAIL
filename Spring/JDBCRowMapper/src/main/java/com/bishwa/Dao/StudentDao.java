package com.bishwa.Dao;

import com.bishwa.Bean.Student;

public interface StudentDao {
	
	public int insert(Student student);
	public Student getStudent(int studentId); 
	
}
