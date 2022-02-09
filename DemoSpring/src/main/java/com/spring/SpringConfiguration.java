package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration 
{
   @Bean
   public Student student()
   {
	   return new Student();
   }
   
   @Bean
   public Course course()
   {
	   return new Course();
   }
   
   @Bean
   public Trainer trainer()
   {
	   return new Trainer();
   }
}
