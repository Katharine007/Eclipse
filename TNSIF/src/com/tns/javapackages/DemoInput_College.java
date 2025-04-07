package com.tns.javapackages;

public class DemoInput_College {
	public static void main(String[] args) {
College_GetterSetter ob = new College_GetterSetter();
ob.getId();
ob.setId(2);
ob.setCollegeName("MVJ");
ob.setMarks(20);
ob.setName("Deborah");
System.out.println(ob);
}
}