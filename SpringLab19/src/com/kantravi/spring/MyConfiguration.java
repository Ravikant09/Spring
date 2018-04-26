package com.kantravi.spring;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
	
	@Bean(name="ao")
	//Here bean id is ao but bean property/variable is aobj so remains uninject 
	public A aobj(){
		A aoj=new A();
		aoj.setA(10);
		aoj.setMsg("Hi Sunny");
		return aoj;
	}
	
	@Bean
	//Here bean id is bobj and bean property/variable is bobj so inject successfully
	public B bobj(){
		B b=new B(40,"Good Morning");
		return b;
				
	}
	
	@Bean(name="hello",autowire=Autowire.BY_NAME )
	public Hello hello(){
		return new Hello();
	}

}
