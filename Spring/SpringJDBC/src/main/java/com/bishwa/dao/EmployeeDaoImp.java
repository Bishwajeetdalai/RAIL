package com.bishwa.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.bishwa.Bean.Employee;

public class EmployeeDaoImp implements EmployeeDao{
	
private JdbcTemplate jdbctemplate;
	
	public void setDataSource(DataSource dataSource) {
        this.jdbctemplate = new JdbcTemplate(dataSource);
    }

	public int insert(Employee emp) {
		String query = "insert into employee value(?,?,?)";
		int r = this.jdbctemplate.update(query, emp.getEid(), emp.getEname(), emp.getDesgn());
		return r;
	}
	
	public int update(Employee employee) {
        String query = "update employee set ename=?, desgn=? where eid=?";
        return jdbctemplate.update(query, employee.getEname(), employee.getDesgn(), employee.getEid());
    }

    public int delete(int eid) {
        String query = "delete from employee where eid=?";
        return jdbctemplate.update(query, eid);
    }

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	
	public List<Employee> displayAll() {
        String query = "select * from employee";
        return jdbctemplate.query(query, new BeanPropertyRowMapper<>(Employee.class));
    }
	
	public Employee getEmpById(int eid) {
        String query = "select * from employee where eid=?";
        return jdbctemplate.queryForObject(query, new Object[]{eid}, new BeanPropertyRowMapper<>(Employee.class));
    }
}
