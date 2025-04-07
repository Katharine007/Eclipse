package com.tns.Interface;

public class PaymentService {
	public void makePayement(Payment pay, double amt) {
		//create reference of the interface
		//runtime polymorphism using interface
		//make payment -> take payment interface reference, allows any class that implemnts payement interface to use this
	pay.process(amt);
	//during obj creation only able to access method
	}

}
