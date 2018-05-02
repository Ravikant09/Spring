package com.kantravi.spring;

public class A {			//Simple Dependency

	private int a;			//Setter Injection
	private String msg;		//Setter Injection is
	
	static{
		System.out.println("A-StaticBlock");
	}
	
	public A() {

		System.out.println("A-DefaultConstructor");
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	public void showA(){
		System.out.println("A-showA() method");
		System.out.println(a);
		System.out.println(msg);
	}
	
	
}
