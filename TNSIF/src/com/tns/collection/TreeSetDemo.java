package com.tns.collection;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TreeSet<String> t = new TreeSet<String>();
        t.add("HTML");
        t.add("Java");
        t.add("HTML");
        // t.add(null); NullPointerException at runtime
        //Equals() and Hashcode()
        System.out.println("Courses are : "+t);
        
	}

}
