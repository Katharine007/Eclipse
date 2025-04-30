package com.tns.collection.comparator;

import java.util.Comparator;

public class SortName implements Comparator <Student>{

	@Override
	public int compare(Student a, Student b) {
		// TODO Auto-generated method stub
		return a.name.compareTo(b.name);
	}
	

}
