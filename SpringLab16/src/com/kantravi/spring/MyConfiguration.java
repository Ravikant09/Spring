package com.kantravi.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
	

	@Bean
	public A createA(){
		A aobj=new A();
		aobj.setA(88);					//S.I
		aobj.setMsg("Hey Sunny??");		//S.I
		
		return aobj;
	}
	
	
	@Bean(name="b")							//method name b and bean name is createB
	public B createB(){
		B bobj=new B(99,"Hi Guys");		//C.I

		return bobj;
	}
	
	
	@Bean(name="hello")				//method name is hello and bean name is createHello	
	public Hello createHello(B bobj){
		Hello h=new Hello(bobj);	
		
		return h;
	}

}


/*By Default bean name and method name is same(@Bean)
 * To say method has to called by Spring Conatiner we will use @Bean
 *Place where we describe our own bean so class should be marked with @Configuration
 */ 
