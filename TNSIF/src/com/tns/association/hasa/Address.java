package com.tns.association.hasa;

public class Address {
	private int dorrNo;
	private String street;
	private String city;
	private String state;
	private int pincode;
	public Address(int dorrNo, String street, String city, String state, int pincode) {
		super();
		this.dorrNo = dorrNo;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDorrNo() {
		return dorrNo;
	}
	public void setDorrNo(int dorrNo) {
		this.dorrNo = dorrNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [dorrNo=" + dorrNo + ", street=" + street + ", city=" + city + ", state=" + state + ", pincode="
				+ pincode + "]";
	}
	
	

}
