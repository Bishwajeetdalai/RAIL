package com.bishwa;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class javaConfig {

	@Bean(name="id")
	public Electric getElectric() {
		Electric c=new Electric();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter cid , cname ,creading ,preading");
		     int cid=sc.nextInt();
		     String cname=sc.next();
		     double creading=sc.nextDouble();
		    double preading=sc.nextDouble();
		    c.setCid(cid);
		    c.setCname(cname);
		    c.setCreading(creading);
		    c.setPreding(preading);
		    
		    return c;
	}
	
}
