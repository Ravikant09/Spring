//JAVA-Based Configuration
package com.kantravi.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ApplicationContext ac=new AnnotationConfigApplicationContext(MyConfiguration.class);
		
		System.out.println("Spring Is Ready");
		System.out.println("After Container Startup");
		System.out.println("---------------------------------------------------");
		
		Hello h=(Hello)ac.getBean("hello");
		h.showHello();
	
		A ao=(A)ac.getBean("createA");
		ao.showA();
		
		B bo=(B)ac.getBean("b");
		bo.showB();
	}

}
