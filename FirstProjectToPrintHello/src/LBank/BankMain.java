package LBank;

public class BankMain {

	public static void main(String[] args) {

		// for deposit
		Account cust1 = new Account();
		cust1.deposit(1000);

		Account cust2 = new Account();
		cust2.deposit(8000);
		cust2.withdraw(9000);

		System.out.println("Cust1 Balance is :- " + cust1.getbalance());
		System.out.println("Cust2 Balance is :- " + cust2.getbalance());

	}
}
