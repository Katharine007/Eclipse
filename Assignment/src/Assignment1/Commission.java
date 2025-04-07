package Assignment1;

import java.util.Scanner;

public class Commission {
private String Name;
private long phone;
private double sales_amount;
private String address;

void acceptDetails() {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter your Name : ");
	Name=sc.nextLine();
	System.out.println("Enter your Address : ");
	address=sc.nextLine();
	System.out.println("Enter your Phone Number : ");
	phone=sc.nextLong();
	System.out.println("Enter the Sales Amount : ");
	sales_amount = sc.nextDouble();
}

void calcCommission() {
	double comm =0;
	//checking
	if (sales_amount >= 100000) {
        comm = 0.10 * sales_amount;
    } else if (sales_amount >= 50000) {
        comm= 0.05 * sales_amount;
    } else if (sales_amount >= 30000) {
        comm= 0.03 * sales_amount;
    } else {
        comm= 0; 
    }
	System.out.println("The Sales Commision is : "+comm);
}	
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Commission ob = new Commission();
	ob.acceptDetails();
	ob.calcCommission();

	}

}
