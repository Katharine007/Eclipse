package BankManagement;

public class SavingsAccount extends Account{
    
	public SavingsAccount(String owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}

	@Override
	void deposit(double amt) {
		// TODO Auto-generated method stub
		balance=balance+amt;
		System.out.println("Account Holder : "+owner+" Your amount is deposited successfully");
	}

	@Override
	void withdraw(double amt) {
		// TODO Auto-generated method stub
		if (balance<amt) {
			System.out.println("Insufficient Funds...Amount can't be withdrawn");
		}
		else {
			balance=balance-amt;
			System.out.println("Account Holder : "+owner+" Your amount is withdrawn successfully");
		}
	}

	@Override
	double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

}
