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
        System.out.println( "Hello World!" );
        
                 ApplicationContext ctx=new ClassPathXmlApplicationContext("hibernatecfg.xml");
                 StudentBean s=   (StudentBean) ctx.getBean("id2");
                 System.out.println(s);
            	
    }
}
