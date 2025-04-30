package com.tns.ExceptionHandling;

public class TryCatchFinallyEx {
	public static void main(String[] args) {
		//syntax
		try { //can't be used alone without try...try and catch always together
			//code that may throw an exception
			int result = 10/0;
		}catch(Exception e) {
			//handles exception
			//Mention what kind of exception
			//e acts as an object
			//catch will hold that exception inside the e
			//Exception e -> when udk the name
			//Arithmetic Exception 
			System.out.println("Caught an Exception !!!"+'\n'+"The Exception is : "+e);
		} //try-finally doesnt work, Finally works only with try and catch..not alone
		finally {
			//This block always executes..whether an error occurs or not
			System.out.println("This is finally Block !");
		}
		
	}

}
