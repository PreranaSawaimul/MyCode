package com.ait;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
public static void main(String[] args) {
	//eager loading
	ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
	System.out.println("************************************************");
	Student ob1=(Student) ctx.getBean("s1");
	System.out.println(ob1);

//	Student ob2=(Student) ctx.getBean("s1");
//	System.out.println(ob2);
//		
//	System.out.println(ob1.hashCode());
//	System.out.println(ob2.hashCode());
//	
	//scope -default=>Singleton eagerly intialised
	
	//prototype--lazy 
	
	//web -application
	//session
	//request
	//application
	
	//autowiring

//	Course c1=new Course();
//	c1.setCoursename("c++");
//	Student s1=new Student();
//	s1.setCourse(c1);//byType and 
}
}
