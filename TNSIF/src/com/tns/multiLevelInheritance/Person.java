package com.tns.multiLevelInheritance;

import java.util.Date;

public class Person {
 private String name;
 private long phNo;
 private Date dateOfBirth;
 
 
 
public Person() {
	super();
	// TODO Auto-generated constructor stub
}
public Person(String name, long phNo, Date dateOfBirth) {
	super();
	this.name = name;
	this.phNo = phNo;
	this.dateOfBirth = dateOfBirth;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getPhNo() {
	return phNo;
}
public void setPhNo(long phNo) {
	this.phNo = phNo;
}
public Date getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
@Override
public String toString() {
	return "Person [name=" + name + ", phNo=" + phNo +", dateOfBirth=" +dateOfBirth+ "]";
}
 
 
}
