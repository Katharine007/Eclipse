package com.tns.multiLevelInheritance;
import java.util.Date;
public class Demo {
	    public static void main(String[] args) {
	        // Sample data
	        int empID = 101;
	        float salary = 85000.50f;
	        String name = "Darwin";
	        long phNo = 9876543210L;
	        Date dob = new Date(95, 4, 15); // May 15, 1995 (year offset by 1900)
	        String authority = "Full Access to Company Decisions";

	        // Creating ManagingDirector object
	        ManagingDirector md = new ManagingDirector(empID, salary, name, phNo, dob, authority);

	        // Printing the object
	        System.out.println(md);
	    }
	}


