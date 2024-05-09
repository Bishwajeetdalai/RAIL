package com.bishwa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bishwa.dao.StudentDao;
import com.bishwa.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program Started!" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("Spconfig.xml");
        StudentDao st = context.getBean("studentDao", StudentDao.class);
        Student std = new Student(1,"bishwa","durg",23);
        
        int result = st.insert(std);
        
        System.out.println("Data inserted Successfully "+result);
        
        
    }
}
