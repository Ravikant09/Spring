//XML Configuration
package com.kantravi.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac=new ClassPathXmlApplicationContext("myConfiguration.xml");
		System.out.println("Spring Is Ready");
		System.out.println("After Container Startup");
		System.out.println("---------------------------------------------------");
		
		Hello h=(Hello)ac.getBean("hello");	
//ac.getBean("hello") means get the bean whose ID is hello.Return type of ac is object 
		h.showHello();

		System.out.println("---------------------------------------------------");
			
		Hello h2=(Hello)ac.getBean("hello");	
		Hello h3=(Hello)ac.getBean("hello");	

		System.out.println(h2==h3);
		
	//Note By Default Scope is Singleton so True if Prototype than false 
		
		
	}

}
