package com.kantravi.spring;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
	
	@Bean(name="ao1")
	public A aobj1(){
		A aoj=new A();
		aoj.setA(10);
		aoj.setMsg("Hi Mohan");
		return aoj;
	}
	
	@Bean(name="ao2")
	public A aobj2(){
		A aoj=new A();
		aoj.setA(10);
		aoj.setMsg("Hi Sunny");
		return aoj;
	}
	
	//More Than One Bean Found So Exception
	
	@Bean
	public B bobj(){
		B b=new B(40,"Good Morning");
		return b;
				
	}
		
	@Bean(name="hello",autowire=Autowire.BY_TYPE)
	public Hello hello(){
		return new Hello();
	}

}
