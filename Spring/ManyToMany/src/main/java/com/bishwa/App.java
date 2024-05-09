package com.bishwa;

import java.util.Arrays;

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
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        Question q1 = new Question();
        q1.setQuestion("Name high level Languages");
        
        Question q2 = new Question();
        q2.setQuestion("Name Programming Languages");
        
        Answer a1 = new Answer();
        a1.setAnswer("Python");
        a1.setPostedBy("Ryan");
        a1.setQuestions(Arrays.asList(q1,q2));
        
        Answer a2 = new Answer();
        a2.setAnswer("Java");
        a2.setPostedBy("Josh");
        a2.setQuestions(Arrays.asList(q1,q2));
        
        Answer a3 = new Answer();
        a3.setAnswer("C#");
        a3.setPostedBy("Craig");
        a3.setQuestions(Arrays.asList(q1,q2));
        q1.setAnswers(Arrays.asList(a1,a2,a3));
        q2.setAnswers(Arrays.asList(a1,a2,a3));
        
        session.persist(q1);
        session.persist(q2);

        transaction.commit();
        session.close();
        sessionFactory.close();
        
    }
}
