package com.bishwa.dao;

import java.util.List;

import com.bishwa.Bean.Employee;

public interface EmployeeDao {
	public int insert(Employee employee);
	public int update(Employee employee);
	public int delete(int eidToDelete);
	public List<Employee> displayAll();
	public Employee getEmpById(int i);
}
