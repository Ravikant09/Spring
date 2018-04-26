package com.kantravi.spring;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;

public class MyConfiguration {


	//No A,B or C bean found so all remains uninjected 
	
	
	@Bean(autowire=Autowire.BY_TYPE)
	public Hello hello(){
		return new Hello();
	}
	
}
