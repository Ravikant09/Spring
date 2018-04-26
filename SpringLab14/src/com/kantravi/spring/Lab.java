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
		

		Customer cust=(Customer)ac.getBean("customer");
		cust.show();
		
	}

}
