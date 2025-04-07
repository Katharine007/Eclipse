package BankManagement;

public class Demo {
 public static void main(String[] args) {
     Account savings = new SavingsAccount("Alice");
     savings.deposit(1000);
     savings.withdraw(200);
     savings.showHolder();
     System.out.println("Savings Balance: $" + savings.getBalance());

     System.out.println();

     Account checking = new CheckingAccount("Bob");
     checking.deposit(500);
     checking.withdraw(600); // should allow due to overdraft
     checking.showHolder();
     System.out.println("Checking Balance: $" + checking.getBalance());
 }
}
