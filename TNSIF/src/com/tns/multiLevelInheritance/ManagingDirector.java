package com.tns.multiLevelInheritance;

import java.util.Date;

public class ManagingDirector extends Employee {
	private String authority;

	public ManagingDirector(String authority) {
		super();
		this.authority = authority;
	}

	public ManagingDirector() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ManagingDirector(int empID, float salary, String name, long phno, Date dateOfBirth, String authority) {
		super(empID, salary,name,phno,dateOfBirth);
		this.authority=authority;
		// TODO Auto-generated constructor stub
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public String toString() {
		return "ManagingDirector [authority=" + authority + ", " + super.toString() + "]";
	}
	 
	
    
}
