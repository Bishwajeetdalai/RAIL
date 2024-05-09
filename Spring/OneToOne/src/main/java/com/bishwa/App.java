package com.bishwa;

//import javax.transaction.Transaction;

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
        
        //session
        Session s = factory.openSession();
        Transaction t = s.beginTransaction();
        
        //creating question
        Question q1=new Question();
        q1.setQuestionId(121);
        q1.setQuestion("what is java");
        
        //creating answer

        Answer answer=new Answer();
        answer.setAnswerId(131);
        answer.setAnswer("Programming Language");
        q1.setAnswer(answer);
        
    	
        //save
        s.save(q1);
        s.save(answer);
        t.commit();
        
        s.close();
        
        factory.close();
        
    }
}
