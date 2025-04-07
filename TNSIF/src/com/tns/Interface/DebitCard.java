package com.tns.Interface;

public class DebitCard implements Payment {
	private String cardNo;

	public DebitCard(String cardNo) {
		super();
		this.cardNo = cardNo;
	}


	@Override
	public void process(double amt) {
		// TODO Auto-generated method stub
		System.out.println("Processing Debit Card Payment of  Rs."+amt+"via Debit Card Number : "+cardNo);
	}

}
