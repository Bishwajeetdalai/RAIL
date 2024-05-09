package com.bishwa;

import java.io.FileInputStream;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    
    
        Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
       
      SessionFactory  factory=cfg.buildSessionFactory();
      Image i=new Image();
      i.setId(1);
      i.setPersonName("bishwajeet");     
     try {
    	 FileInputStream a=new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\ImageUpload\\src\\main\\java\\sk.jpg.jpeg");
		  byte[] data = new byte[a.available()];
          a.read(data);
          i.setImage(data);

     	}
     
     	catch (Exception e)
     	{
		e.printStackTrace();
     	}
     
     	System.out.println(i);
     	Session session = factory.openSession();     
     	Transaction tx=session.beginTransaction();
  
     	session.save(i);      
     	tx.commit();
     	factory.close();
     	session.close();
    
        System.out.println("Saved successfully.");
     
 
    
    }
}
