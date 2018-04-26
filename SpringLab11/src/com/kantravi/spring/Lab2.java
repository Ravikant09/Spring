//XML Configuration
package com.kantravi.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac=new AnnotationConfigApplicationContext(MyConfiguration.class);
		System.out.println("Spring Is Ready");
		System.out.println("After Container Startup");
		System.out.println("---------------------------------------------------");
		
		A h=(A)ac.getBean("aobj");	
//ac.getBean("hello") means get the bean whose ID is hello.Return type of ac is object 
		h.showA();

		
		
	}

}
