//For constructor autowiring always use Constructor Injection otherwise remains UnInjected
package com.kantravi.spring;

public class Hello {	//Complex or UserDefined Dependency

	private A aobj;		//Constructor Injection
	private B bobj;		//Constructor Injection
	private C cobj;		//Constructor Injection
	
	public Hello() {
			System.out.println("Hello Default Constructor");
			
	}
	
	static{
			System.out.println("Hello Static Block");
	}
	
	

	
	public Hello(A aobj, B bobj, C cobj) {

		System.out.println("Hello(A,B,C) ");
		this.aobj = aobj;
		this.bobj = bobj;
		this.cobj = cobj;
	}



	public Hello(A aobj, B bobj) {

		System.out.println("Hello(A,B) ");
		this.aobj = aobj;
		this.bobj = bobj;
	}

	public Hello(B bobj, C cobj) {

		System.out.println("Hello(B,C) ");
		this.bobj = bobj;
		this.cobj = cobj;
	}


	public Hello(A aobj,C cobj) {

		System.out.println("Hello(A,C) ");
		this.aobj = aobj;
		this.cobj = cobj;
	}

	public Hello(A aobj) {

		System.out.println("Hello(A) ");
		this.aobj = aobj;
	}

	public Hello(B bobj) {

		System.out.println("Hello(B) ");
		this.bobj = bobj;
	}

	public Hello(C cobj) {

		System.out.println("Hello(C) ");
		this.cobj = cobj;
	}


	
	public void showHello(){
		System.out.println(aobj);	
		System.out.println(bobj);	
		System.out.println(cobj);

	}
	
	
	
	
}


/*Here If A and B bean class compile than only class Hello will run successfully as 
 *Hello Class is depending on Class A and Class B in case any error in class A or B 
 *than we may get null pointer exception while calling showA or showB method   
 *
 */
