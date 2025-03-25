package com.tnsif.javapackages;
import java.util.Scanner;
public class CheckDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		boolean check = sc.hasNextInt();
		
		if (check) { //check==true
			int num=sc.nextInt();
		    System.out.println("Valid Data Type and you Entered : "+num);
		}
		else {
			System.out.println("Invalid Data Type");
	}

	}
}
