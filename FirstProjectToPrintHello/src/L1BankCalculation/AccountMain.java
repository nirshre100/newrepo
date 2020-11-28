package L1BankCalculation;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccountManagement acc = new AccountManagement();
		acc.deposit(400);
		AccountManagement name1 = new AccountManagement();
		name1.getname();
		acc.withdraw(350);
		
		
		System.out.println(name1.getname()+ " "  + "Your Current Balance is only $ "  + acc.getbalance());

	}

}
