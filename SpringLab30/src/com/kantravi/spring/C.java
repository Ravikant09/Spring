package com.kantravi.spring;

public class C {			//Simple Dependency

	private int c;			//Setter Injection
	private String lin;;		//Constructor Injection
	
	static{
		System.out.println("C-StaticBlock");
	}
	
	public C() {

		System.out.println("C-DefaultConstructor");
	}

	

	public void setC(int c) {
		this.c = c;
	}



	public C(String lin) {
		this.lin = lin;
	}



	public String toString() {
		return ""+c+"\t"+lin;
	}
	
	
}


