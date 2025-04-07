package com.tns.association.hasa;
//entity = has a relationship
public class Person {
	private String name; //person has an address
	private Address address; //using user defined entity 
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
    
	
}
