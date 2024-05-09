package com.bishwa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("spconfig.xml");
    	Student student = ctx.getBean("student",Student.class);
    	System.out.println(student);
    	
    	
    	
    }
}
