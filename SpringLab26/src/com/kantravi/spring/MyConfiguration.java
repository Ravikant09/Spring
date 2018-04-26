package com.kantravi.spring;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
	
	@Bean(name="ao")
	public A aobj(){
		A aoj=new A();
		aoj.setA(10);
		aoj.setMsg("Hi Sunny");
		return aoj;
	}
	
	//No B Bean Found So B remains UnInjected
	
	@Bean(name="hello",autowire=Autowire.BY_TYPE)
	public Hello hello(){
		return new Hello();
	}

}
