package TicketBooking;
import java.util.*;

public class Demo extends Booking{

	public static void main(String[] args) {
		
		char input = 'Y';
		Scanner sc = new Scanner(System.in);
		Booking ob = new Booking();
		
		while (input=='Y' || input== 'y') {
		System.out.println("Press 'Y' to Continue");
		input = sc.next().charAt(0);
		if (input == 'Y' || input =='y') {
			ob.bookTicket();
		}
	}
	}
}
