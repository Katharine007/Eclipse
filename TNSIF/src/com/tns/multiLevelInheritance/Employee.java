package com.tns.multiLevelInheritance;

import java.util.Date;

public class Employee extends Person{
private int empID;
private float salary;


public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int empID, float salary,String name, long phno, Date dateOfBirth) {
	super(name,phno,dateOfBirth);
	this.empID = empID;
	this.salary = salary;
}
public int getEmpID() {
	return empID;
}
public void setEmpID(int empID) {
	this.empID = empID;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [empID=" + empID + ", salary=" + salary +", "+super.toString() +"]";
}


}
