package com.kantravi.spring;

public class Address {

	private String street;		//C.I
	private String city;		//C.I
	private String state;		//C.I
	
	static{
		System.out.println("Address----->S.B");
	}
	
	public Address() {
		System.out.println("Address----->D.C");
	}

	public Address(String street, String city, String state) {

		System.out.println("Address----->3-Args Constructor");
		this.street = street;
		this.city = city;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + "]";
	}
	
	
	
	
	
	
}
