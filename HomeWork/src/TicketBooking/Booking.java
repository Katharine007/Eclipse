package TicketBooking;

public class Booking {
	static int ticket = 10;
	static {
		System.out.println("Welcome to Online Ticket Booking System");
		System.out.println("Current Available Ticket(s) : "+ticket);
	}
	
	public void bookTicket() {
		if (ticket <= 0) {
			System.out.println("All tickets are sold out!");
		} else {
			ticket--;
			System.out.println("Ticket successfully booked.");
			System.out.println("Current Available Ticket(s) : "+ticket);
		}
	}

	
	public static void displayAvail() {
		System.out.println("Current Available Ticket(s) : "+ticket);
	}

	@Override
	public String toString() {
		return "TicketBooking [ticketsAvailable=" + ticket + "]";
	}
}

