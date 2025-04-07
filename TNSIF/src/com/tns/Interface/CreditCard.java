package com.tns.Interface;

public class CreditCard implements Payment{
	
	private String cardNo;

	public CreditCard(String cardNo) {
		super();
		this.cardNo = cardNo;
	}

	@Override
	public void process(double amt) {
		// TODO Auto-generated method stub
		System.out.println("Processing Credit Card Payment of  Rs."+amt+" via Credit Card Number : "+cardNo);
	}
	
}
