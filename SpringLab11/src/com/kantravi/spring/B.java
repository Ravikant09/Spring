package com.kantravi.spring;

public class B {			//Simple Dependency

	private int b;			//Constructor Injection
	private String str;		//Constructor Injection
	
	static{
		System.out.println("B-StaticBlock");
	}
	
	public B() {

		System.out.println("B-DefaultConstructor");
	}

	public B(int b, String str) {
		this.b = b;
		this.str = str;
	}

	public void showB(){
		System.out.println("B-showB() method");
		System.out.println(b);
		System.out.println(str);
	}

	
	
}


