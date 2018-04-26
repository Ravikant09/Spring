package com.kantravi.spring;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Customer {

	private int cId; // C.I
	private String sName; // C.I
	private String email; // C.I
	private Long phone; // C.I

	private List<String> emails; // S.I

	private Set<Long> phones; // S.I

	private Map<String, Long> refs; // S.I

	private Properties myProps; // S.I

	private Address address; // S.I

	private List<Account> accounts; // S.I

	static {
		System.out.println("Customer----->S.B");
	}

	public Customer() {
		System.out.println("Customer----->D.C");
	}

	public Customer(int cId, String sName, String email, Long phone) {
		System.out.println("Customer----->4 Args Constructor");
		this.cId = cId;
		this.sName = sName;
		this.email = email;
		this.phone = phone;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public void setPhones(Set<Long> phones) {
		this.phones = phones;
	}

	public void setRefs(Map<String, Long> refs) {
		this.refs = refs;
	}

	public void setMyProps(Properties myProps) {
		this.myProps = myProps;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public void show() {
		System.out.println(cId);
		System.out.println(sName);
		System.out.println(email);
		System.out.println(phone);

		System.out.println();
		System.out.println("List Of Emails");
		System.out.println(emails);

		System.out.println();
		System.out.println("Set Of Phones");
		System.out.println(phones);

		System.out.println();
		System.out.println("Map Of refs");
		System.out.println(refs);

		System.out.println();
		System.out.println("Properties Of myProps");
		System.out.println(myProps);

		System.out.println();
		
		System.out.println(address);

		System.out.println();
		System.out.println("List Of Accounts");
		for (Account acc : accounts) {
			System.out.println(acc);
		}

		System.out.println("----------------------------------------------------------------------");
		System.out.println(emails.getClass().getName());
		System.out.println(phones.getClass().getName());
		System.out.println(refs.getClass().getName());
		System.out.println(myProps.getClass().getName());
		System.out.println();
	}

}
