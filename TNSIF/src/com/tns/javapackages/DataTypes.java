package com.tns.javapackages;
import java.util.Scanner;
public class DataTypes {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//number
	System.out.println("Enter a number : ");
	int num = sc.nextInt();
	System.out.println("The number is : "+num);
	sc.nextLine();
	//name
	System.out.println("Enter your Name : ");
	String s = sc.nextLine();
	System.out.println("Your Name is : "+s);
	//character
	System.out.println("Enter a character : ");
	char c = sc.next().charAt(0);
	System.out.println("The character is : "+c);
	//float or double
	System.out.println("Enter a float value");
	float f = sc.nextFloat();
	System.out.println("The float value is : "+f);
}
}
