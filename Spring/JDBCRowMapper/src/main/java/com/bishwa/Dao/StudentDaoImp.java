package com.bishwa.Dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.bishwa.Bean.Student;

public class StudentDaoImp implements StudentDao{
	private JdbcTemplate jdbcTemplate;
	public int insert(Student student) {
		 String query = "insert into student(id,name,city,state,pincode) values(?,?,?,?,?)";
		 int r = this.jdbcTemplate.update(query, student.getId(),student.getName(),student.getCity(),student.getState(),student.getPincode());
		return r;
	}
	
	@Override
	public Student getStudent(int studentId) {
		String query="select*from Student where id=?";
		RowMapper<Student> rowMapper=new RowMapperImp();	
		Student record=this.jdbcTemplate.queryForObject(query,rowMapper,studentId);
		return record;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
