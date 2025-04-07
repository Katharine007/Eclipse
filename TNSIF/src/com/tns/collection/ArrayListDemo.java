package com.tns.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(); //raw = any dataType
		System.out.println("The size of arraylist "+list.isEmpty());
		System.out.println("The size of arraylist "+list.size());
		list.add(2); //can add duplicate elements
		list.add("Abc");
		list.add(null); //can add null in integer
		list.add(2221);
		list.add(true);
		System.out.println("The size of arraylist "+list.size());
		System.out.println(list);
		System.out.println(list.contains(55));
		System.out.println(list.remove("Abc"));
		System.out.println("The size of arraylist "+list.get(0));
		System.out.println(list);
		list.clear();
		System.out.println(list);
		ArrayList <Integer> list1= new ArrayList();
		list1.add(2);
		list1.add(221);
		list1.add(20);
		System.out.println("Before Sorting : "+list1);
		Collections.sort(list1);
		System.out.println("After Sorting : "+list1);
	}

}
