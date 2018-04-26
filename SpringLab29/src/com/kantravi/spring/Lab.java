//XML Configuration
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
	
		Hello hello=(Hello)ac.getBean("hello");
		hello.showHello();
	}

}


/*Auotwiring with simple type(Here A and B) is not possible Autowiring is possible 
 * only with other or complex bean(Here Hello Bean) 
 */ 
