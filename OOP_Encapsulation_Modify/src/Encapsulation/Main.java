package Encapsulation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create and modifying the account details using encapsulation method
		BankAccount account1 = new BankAccount("ABA00152","TE SENGHOT", 500.00);
		BankAccount for_update_account1 = new BankAccount("ABA00152","TE SENGHOT", 500.00);
		//access and modifying the account details using encapsulations methods
		
		System.out.println("Account Number:"+account1.getAccountNumber());
		System.out.println("Account Holdname:"+account1.getAccountHoldname());
		System.out.println("Account Balance:"+account1.getBalance());
		
		//Attempt to Set a new balance
		for_update_account1.setBalance(1700.00);
		for_update_account1.setAccountHoldName("Te RICKY");
		
		System.out.println("Update Balance:"+for_update_account1.getAccountHoldname());
		System.out.println("Total Balance: "+(account1.getBalance()+for_update_account1.getBalance())+"$");
		

		
	}

}
