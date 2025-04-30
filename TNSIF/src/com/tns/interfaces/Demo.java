package com.tnsif.interfaces;

public class Demo {
	public static void main(String[] args) {
		// MyInterface ob = new MyInterface(); -> cannot be implemented
		MyInterface ob = new MyClass(); //creating an instance through it's implementabel class
		ob.display();
	}
//With interface we can achieve 100% abstraction
}
