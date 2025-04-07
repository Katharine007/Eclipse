package com.tns.Interface;

public class Demo {
	public static void main(String args[]) {
		Payment c = new CreditCard("R712 234G 73G5");
		Payment d = new DebitCard("H3T3 767H RY67");
		
		//c.process(88);
		//d.process(99);
		
		//Polymorphism 
		PaymentService ps = new PaymentService();
		ps.makePayement(c, 77);
		ps.makePayement(d, 1000);
	}

}
