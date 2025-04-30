package com.tns.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public final class LinkedhashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<Integer> lset = new LinkedHashSet<Integer>();
        lset.add(10);
        lset.add(30);
        lset.add(5);
        lset.add(15);
        lset.add(null);
        System.out.println("LinkedHashSet : "+lset);
        // Collections.sort(lset); Cannot sort it directly
        ArrayList<Integer> arr = new ArrayList<>(lset);
        Collections.sort(arr);
        System.out.println("LinkedHashSet : "+lset);
        //TreeSet<Integer>
	}

}
