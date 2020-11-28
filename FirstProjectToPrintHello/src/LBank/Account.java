package LBank;

public class Account {

	private double balance;

	// set balance
	public Account() 
	{
		balance = 0.0;
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
}
