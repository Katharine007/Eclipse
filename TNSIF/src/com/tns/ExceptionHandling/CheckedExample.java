package com.tns.ExceptionHandling;

import java.io.*;

public class CheckedExample {
	public static void main(String[] args) throws Exception{
		FileReader file = new FileReader("data.txt");
		//showing error here because text is not found so it is showing compilation error
		BufferedReader fileInput = new BufferedReader(file);
		System.out.println(fileInput.readLine());
		fileInput.close();
		//file shd be inside this package
		//surround w try and catch-> compiler not detecting it or add throws declaration
	}

}
