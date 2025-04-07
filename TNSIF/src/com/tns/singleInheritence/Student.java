package com.tns.singleInheritence;

public class Student extends Citizen{ //Inheritance concept
	private int rollNo;
	private String college;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Default and Parameterized Constructor
	public Student(String name, String aadharNo, String address, long phNo) {
		super(name, aadharNo, address, phNo);
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String aadharNo, String address, long phNo, int rollNo, String college) {
		super(name, aadharNo, address, phNo);
		this.rollNo = rollNo;
		this.college = college;
	}
    
	//Getter Setter for the two variables
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}
    
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", college=" + college + ", "+super.toString()+"]";
	}
	
	

}
