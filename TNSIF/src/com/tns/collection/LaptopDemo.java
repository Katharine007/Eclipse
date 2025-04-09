package com.tns.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopDemo {
	public static void main(String[] args) {
		List<Laptop> laps = new ArrayList<Laptop>();
		laps.add(new Laptop("Dell",15,169999));
		laps.add(new Laptop("Asus",22,178946));
		//laps is the list and new Laptop().. is the object
		//instead of creating 1 list object and 2 laptop obj, we can do this directly
		laps.add(new Laptop("Apple",2,177878));
		//now we are sorting according to ram
		
		Collections.sort(laps);
		//collection.sort will call this compareTo method and do the comparision 
		//for each loop
		for (Laptop l: laps) {
			System.out.println(l);
		}
	}
}
