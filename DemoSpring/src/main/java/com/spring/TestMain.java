package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ApplicationContext ctx=new ClassPathXmlApplicationContext("Config.cfg.xml");
    Student ob1=(Student)ctx.getBean("s1");
    System.out.println(ob1);
    
    //Student ob2=(Student)ctx.getBean("s2");
    //System.out.println(ob2);
    
    //System.out.println(ob1.hashCode());
    //System.out.println(ob2.hashCode());
	}

}
