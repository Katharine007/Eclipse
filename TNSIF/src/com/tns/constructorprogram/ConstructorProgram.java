package com.tns.constructorprogram;

public class ConstructorProgram {

//Variable
private int customerId;
private String customerName;
private String customerCity;

//default and parameterized constructor
public ConstructorProgram() {
	super();
	// TODO Auto-generated constructor stub
}
public ConstructorProgram(int customerId, String customerName, String customerCity) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.customerCity = customerCity;
}

//getter and setter
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerCity() {
	return customerCity;
}
public void setCustomerCity(String customerCity) {
	this.customerCity = customerCity;
}

//toString
@Override
public String toString() {
	return "ConstructorProgram [customerId=" + customerId + ", customerName=" + customerName + ", customerCity="
			+ customerCity + "]";
}

}
