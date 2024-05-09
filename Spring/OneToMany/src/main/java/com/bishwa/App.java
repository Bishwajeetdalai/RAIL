package com.bishwa;

import java.util.ArrayList;

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
       Configuration cfg=new Configuration();
       cfg.configure("hibernate.cfg.xml");
	   SessionFactory factory=cfg.buildSessionFactory();
	   
	 Session session = factory.openSession(); 
	  
	 Transaction t = session.beginTransaction();   	   
	   
	Answer a=new Answer();
	a.setAnswerName("python is Programming Language");
	a.setPostedBy("Siddrath");
	
	Answer a1=new Answer();
	a1.setAnswerName("python is platform independent");
	a1.setPostedBy("A");
	
	Answer a2=new Answer();
	a2.setAnswerName("ReactJs is Programming Language");
	a2.setPostedBy("Bishwajeet Dalai");
	
	Answer a3=new Answer();
	a3.setAnswerName("C++ is Programming Language");
	a3.setPostedBy("Ankit Nashine");
	
	ArrayList<Answer>list1=new ArrayList<>();
	list1.add(a);
	list1.add(a1);
	
	ArrayList<Answer>list2=new ArrayList<>();
	list2.add(a2);
	list2.add(a3);
	
	Question q=new Question();
	q.setQuestionName("What is Python");
	q.setAnswer(list1);
	
	Question q1=new Question();
	q1.setQuestionName("What is Reactjs");
	q1.setAnswer(list2);
	
	session.persist(q);
	session.persist(q1);
	t.commit();
	session.close();
	factory.close();
	System.out.println("data saved");

    }
}
