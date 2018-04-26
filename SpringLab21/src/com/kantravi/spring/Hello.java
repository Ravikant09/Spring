//For byType autowiring always use Setter Injection otherwise remains UnInjected
package com.kantravi.spring;

public class Hello {	//Complex or UserDefined Dependency

	private A aobj;		//Setter Injection
	private B bobj;		//Setter Injection
	private C cobj;		//Setter Injection
	
	public Hello() {
			System.out.println("Hello Default Constructor");
			
	}
	
	static{
			System.out.println("Hello Static Block");
	}
	
	public void setAobj(A aobj) {
		this.aobj = aobj;
	}

	public void setBobj(B bobj) {
		this.bobj = bobj;
	}


	public void setCobj(C cobj) {
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
