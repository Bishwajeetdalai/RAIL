package com.bishwa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext ctx= new AnnotationConfigApplicationContext(javaConfig.class);
        Electric electric=(Electric) ctx.getBean("id");
        electric.printElectricityBill();
        
        
    }
}
