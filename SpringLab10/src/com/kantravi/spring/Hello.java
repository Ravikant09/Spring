package com.kantravi.spring;

public class Hello {	//Complex or UserDefined Dependency

	private A aobj;		//Setter Injection
	private B bobj;		//Constructor Injection

	public Hello() {
			System.out.println("Hello Default Constructor");
			
	}
	
	static{
			System.out.println("Hello Static Block");
	}
	
	
	
	
	public void setAobj(A aobj) {		//Through S.I
		this.aobj = aobj;
	}


	public Hello(B bobj) {				//Through C.I
		super();
		this.bobj = bobj;
	}
	
	
	public void showHello(){
		System.out.println("showHello in Hello");
		aobj.showA();
		bobj.showB();
	}
	
	
	
	
}


/*Here If A and B bean class compile than only class Hello will run successfully as 
 *Hello Class is depending on Class A and Class B in case any error in class A or B 
 *than we may get null pointer exception while calling showA or showB method   
 *
 */
