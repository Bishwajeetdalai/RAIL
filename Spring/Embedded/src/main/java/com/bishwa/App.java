package com.bishwa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration cfg=new Configuration(); 
   	    cfg.configure("hibernate.cfg.xml");
   	    SessionFactory factory=cfg.buildSessionFactory();
   	   
   	   
   	 Session session = factory.openSession(); 
   	  Transaction t = session.beginTransaction(); 
   	  
   	  Student s=new Student();
   	  s.setId(3);
   	  s.setSName("jeet");
   	  s.setRollno(103);
   	  School s1=new School();
   	  s1.setSchoolName("world");
   	  s1.setSchoolAddress("durg1");
   	  
   	  s.setSchool(s1);
   	  session.save(s);
   	  t.commit();
   	  session.close();
   	  factory.close();
        
    }
}
