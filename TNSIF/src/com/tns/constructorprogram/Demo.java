package com.tns.constructorprogram;

public class Demo {
public static void main(String[] args) {
	//Default and Parameterized Constructor
	ConstructorProgram sc = new ConstructorProgram(100,"Esther","Mumbai");
	System.out.println(sc);
	ConstructorProgram obj = new ConstructorProgram();
	System.out.println(obj);
	
	//InstanceOf
	boolean output = ((sc) instanceof ConstructorProgram);
	System.out.println(output);
}
}
