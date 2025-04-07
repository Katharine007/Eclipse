package com.tns.association.isa;

public class Employee {
	private String name;
	private int empID;
	private String dept;
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int empID, String dept) {
		super();
		this.name = name;
		this.empID = empID;
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empID=" + empID + ", dept=" + dept + "]";
	}
	
	

}
