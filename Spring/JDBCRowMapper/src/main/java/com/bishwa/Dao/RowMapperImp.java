package com.bishwa.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bishwa.Bean.Student;

public class RowMapperImp implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student=new Student();
		student.setId(rs.getInt(1));
		student.setName(rs.getString(2));
		student.setCity(rs.getString(3));
		student.setState(rs.getString(4));
		student.setPincode(rs.getInt(5));
		
		return student;
	}
	
}
