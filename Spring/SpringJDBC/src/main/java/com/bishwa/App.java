package com.bishwa;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.bishwa.Bean.Employee;
import com.bishwa.dao.EmployeeDao;

public class App 
{
	public static void main(String[] args) {
		System.out.println("First SpringJdbc Program");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Spconfig.xml");
//                	JdbcTemplate template=ctx.getBean("jdbcTemplate",JdbcTemplate.class);
//                	
//                	// Insert Query
//            String query ="insert into employee values(?,?,?)";
//            int result= template.update(query,101,"Joy","SoftwareDeveloper");
//            System.out.println("First Record Inserted "+result);

		EmployeeDao emp = ctx.getBean("employeedao", EmployeeDao.class);
		Employee emp1 = new Employee();

		emp1.setEid(101);
		emp1.setEname("roman");
		emp1.setDesgn("Senior SoftwareDeveloper");
		int result = emp.insert(emp1);
		System.out.println("Recorded added " + result);
//		
//		Employee empToUpdate = new Employee();
//        empToUpdate.setEid(102);
//        empToUpdate.setEname("John Doe");
//        empToUpdate.setDesgn("Lead Software Developer");
//        int updateResult = emp.update(empToUpdate);
//        System.out.println("Record updated: " + updateResult);
//
//        int eidToDelete = 102;
//        int deleteResult = emp.delete(eidToDelete);
//        System.out.println("Record deleted: " + deleteResult);

		List<Employee> allEmployees = emp.displayAll();
		System.out.println("All Employees:");
		for (Employee empp : allEmployees) {
			System.out.println(empp.getEid() + " |\t " + empp.getEname() + " \t| " + empp.getDesgn());
		}

		Employee empp = emp.getEmpById(101);
		if (empp != null) {
			System.out.println("\nEmployee found:");
			System.out.println(empp.getEid() + " | " + empp.getEname() + " | " + empp.getDesgn());
		} else {
			System.out.println("Employee with ID 102 not found.");
		}
	}
}
