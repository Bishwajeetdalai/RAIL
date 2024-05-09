package com.bishwa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bishwa.Bean.Student;
import com.bishwa.Dao.StudentDao;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("My Program started........................");
		ApplicationContext context = new ClassPathXmlApplicationContext("Spconfig.xml");
		 StudentDao studentDao = context.getBean("studentdao", StudentDao.class);

	Student st = new Student();
	    st.setId(3);
	    st.setName("khushi");
	    st.setCity("Indore");
	    st.setState("mp");
	    st.setPincode(446);
		int result = studentDao.insert(st);
		System.out.println("Student added" + result);
		 
		 Student student=studentDao.getStudent(3);
		 System.out.println(student);
    }
}
