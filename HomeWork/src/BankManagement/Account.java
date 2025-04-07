package BankManagement;

public abstract class Account {
	protected String owner; 
	protected Double balance;

	
	public Account(String owner) {
		super();
		this.owner = owner;
		this.balance=0.0;
	}
	abstract void deposit(double amt);
	abstract void withdraw(double amt);
    abstract double getBalance();
    
    
    
    public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	//concrete method to show the acc. holder
    public void showHolder() {
    	System.out.println("Account Holder : "+owner);
    }
    
}
