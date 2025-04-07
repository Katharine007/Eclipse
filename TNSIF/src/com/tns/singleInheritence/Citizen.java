package com.tns.singleInheritence;

public class Citizen { //Citizen is the unit and it binds the below data
	private String name;
	private String aadharNo;
	private String address;
	private long phNo;
	
	//Constructor
	public Citizen(String name, String aadharNo, String address, long phNo) {
		//super();
		this.name = name;
		this.aadharNo = aadharNo;
		this.address = address;
		this.phNo = phNo;
	}
	public Citizen() {
		//super();
		// TODO Auto-generated constructor stub
		System.out.println("Citizen Default Constructor");
	}
	
	//Getter and Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", aadharNo=" + aadharNo + ", address=" + address + ", phNo=" + phNo + "]";
	}
    
	
}
