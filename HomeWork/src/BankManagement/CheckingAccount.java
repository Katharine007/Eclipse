package BankManagement;

	// CheckingAccount.java
	public class CheckingAccount extends Account {

	    public CheckingAccount(String owner) {
	        super(owner);
	    }

	    @Override
	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited $" + amount + " into Checking Account.");
	    }

	    @Override
	    public void withdraw(double amount) {
	        double overdraftLimit = 100.0;
	        if (balance + overdraftLimit >= amount) {
	            balance -= amount;
	            System.out.println("Withdrew $" + amount + " from Checking Account.");
	        } else {
	            System.out.println("Overdraft limit exceeded in Checking Account.");
	        }
	    }

	    @Override
	    public double getBalance() {
	        return balance;
	    }
	}



