package com.tnsif.springcoreexample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
  public static void main(String[] args) {
	  
	  //It is theIOC container
	  //It reads and manages the beans
   ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
   College college =(College) context.getBean("collegebean");
   college.show();
  }
}