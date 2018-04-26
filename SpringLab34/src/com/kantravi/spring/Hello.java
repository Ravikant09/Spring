//For constructor autowiring always use Constructor Injection otherwise remains UnInjected
package com.kantravi.spring;

public class Hello {	//Complex or UserDefined Dependency

	private A aobj;		//Constructor Injection
	private B bobj;		//Constructor Injection

	public Hello() {
			System.out.println("Hello Default Constructor");
			
	}
	
	static{
			System.out.println("Hello Static Block");
	}
	

	public Hello(A aobj, B bobj) {
		System.out.println("Hello(A,B) 2 Arg Constructor");
		this.aobj = aobj;
		this.bobj = bobj;
	}
	public Hello(A aobj) {
		System.out.println("Hello(A) 1 Arg Constructor");
		this.aobj = aobj;
	}
	public Hello(B bobj) {
		System.out.println("Hello(B) 1 Arg Constructor");
		this.bobj = bobj;
	}

	public void showHello(){
		System.out.println(aobj);	//since we have toString in class A
		System.out.println(bobj);	//since we have toString in class B
	}
	
	
	
	
}


/*Here If A and B bean class compile than only class Hello will run successfully as 
 *Hello Class is depending on Class A and Class B in case any error in class A or B 
 *than we may get null pointer exception while calling showA or showB method   
 *
 */
