package L1BankCalculation;

public class AccountManagement {
	private double balance;
	private String name = "niraj";
	// set balance
	public AccountManagement() 
	{
		balance = 0.00;
	}
	// Deposit
	public void deposit(double amount) {
		balance = balance + amount;
	}
	// withdraw
	public void withdraw(double amount) {
		
		if (amount <= balance) {
			balance = balance - amount;
		}
	
		else 
		{
			System.err.println("Transaction cancle due to insufficent balance");
		}

	}
	// Get balance
	public double getbalance() {
		return balance;
	}
	public String getname() {
		return name;
	}
}
