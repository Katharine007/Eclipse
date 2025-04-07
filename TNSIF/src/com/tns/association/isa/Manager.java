package com.tns.association.isa;
//extends meaning is a relationship
public class Manager extends Employee{
	private int teamSize;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, int empID, String dept) {
		super(name, empID, dept);
		// TODO Auto-generated constructor stub
	}

	public Manager(int teamSize) {
		super();
		this.teamSize = teamSize;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	@Override
	public String toString() {
		return "Manager [teamSize=" + teamSize + "]";
	}
	
	

}
