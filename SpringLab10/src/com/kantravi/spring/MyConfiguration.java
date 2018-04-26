package com.kantravi.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfiguration {

	@Bean(name="aobj")
	@Scope("singleton")
	@Lazy(true)
	public A createA(){
		A aobj=new A();
		aobj.setA(88);					//S.I
		aobj.setMsg("Hey Sunny??");		//S.I
		
		return aobj;
	}
	
	
	@Bean(name="bobj")							//method name b and bean name is createB
	public B createB(){
		B bobj=new B(99,"Hi Guys");		//C.I

		return bobj;
	}
	
	
	@Bean(name="hello")				//method name is hello and bean name is createHello	
	public Hello createHello(A aobj,B bobj){
		Hello h=new Hello(bobj);		//C.I
		h.setAobj(aobj);				//S.I
		
		return h;
	}

}
