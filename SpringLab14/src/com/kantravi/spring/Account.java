package com.kantravi.spring;

public class Account {

	private int accno;		//S.I
	private String atype;	//S.I
	private double bal;		//S.I
	
	static{
		System.out.println("Account----->S.B");
	}
	public Account() {
		System.out.println("Account---->D.C");
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public void setAtype(String atype) {
		this.atype = atype;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", atype=" + atype + ", bal=" + bal + "]";
	}
	
	
	
	
}
