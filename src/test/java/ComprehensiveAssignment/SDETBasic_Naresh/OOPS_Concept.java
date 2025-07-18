package ComprehensiveAssignment.SDETBasic_Naresh;

public class OOPS_Concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//Base class Account
class Account {
 private double balance;
 private double interestRate;

 public Account(double balance, double interestRate) {
     this.balance = balance;
     this.interestRate = interestRate;
 }

 public void deposit(double amount) {
     this.balance += amount;
 }

 public void withdraw(double amount) {
     if (this.balance >= amount) {
         this.balance -= amount;
     } else {
         System.out.println("Insufficient balance.");
     }
 }

 public double calculateInterest() {
     return this.balance * this.interestRate;
 }

 public void addInterest() {
     double interest = calculateInterest();
     this.balance += interest;
 }

 public double getBalance() {
     return this.balance;
 }

 public double getInterestRate() {
     return this.interestRate;
 }

 public void setInterestRate(double interestRate) {
     this.interestRate = interestRate;
 }
}

//Derived class SavingsAccount
class SavingsAccount extends Account {
 public SavingsAccount(double balance, double interestRate) {
     super(balance, interestRate);
 }

 @Override
 public void withdraw(double amount) {
     if (getBalance() - amount >= 100) {
         super.withdraw(amount);
     } else {
         System.out.println("Minimum balance of 100 must be maintained.");
     }
 }
}

//Derived class CurrentAccount
class CurrentAccount extends Account {
 private double overdraftLimit;

 public CurrentAccount(double balance, double interestRate, double overdraftLimit) {
     super(balance, interestRate);
     this.overdraftLimit = overdraftLimit;
 }

 @Override
 public void withdraw(double amount) {
     if (getBalance() + overdraftLimit >= amount) {
         super.withdraw(amount);
     } else {
         System.out.println("Withdrawal amount exceeds overdraft limit.");
     }
 }

//Main class to test the program
 
 public static void main(String[] args) {
     // Create objects of different account types
     SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);
     CurrentAccount currentAccount = new CurrentAccount(2000, 0.03, 500);

     // Perform operations on savings account
     savingsAccount.deposit(500);
     savingsAccount.addInterest();
     System.out.println("Savings Account Balance: " + savingsAccount.getBalance()); // Expected output: 1575.0
     savingsAccount.withdraw(1000);
     System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
     savingsAccount.withdraw(476);
     System.out.println("Savings Account Balance: " + savingsAccount.getBalance());

     // Perform operations on current account
     currentAccount.deposit(1000);
     currentAccount.addInterest();
     System.out.println("Current Account Balance: " + currentAccount.getBalance()); // Expected output: 3090.0
     currentAccount.withdraw(2600);
     System.out.println("Current Account Balance: " + currentAccount.getBalance());
     currentAccount.withdraw(600);
     System.out.println("Current Account Balance: " + currentAccount.getBalance());
 }
}
