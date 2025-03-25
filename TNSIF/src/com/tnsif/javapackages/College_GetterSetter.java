package com.tnsif.javapackages;

public class College_GetterSetter {
	private int id;
	String name;
	protected int marks;
	public String collegeName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collageName) {
		this.collegeName = collageName;
	}
	@Override
	public String toString() {
		return "College_GetterSetter [id=" + id + ", name=" + name + ", marks=" + marks + ", collageName=" + collegeName
				+ "]";
	}
		
}
