package com.tns.Interface;

public class UPI implements Payment{
	private String upi_id;

	public UPI(String upi_id) {
		super();
		this.upi_id = upi_id;
	}

	@Override
	public void process(double amt) {
		// TODO Auto-generated method stub
		System.out.println("Processing UPI Payment of  Rs."+amt+" via UPI ID : "+upi_id);
	}
    
}
