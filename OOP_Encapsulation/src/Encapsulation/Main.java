package Encapsulation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create and modifying the account details using encapsulation method
		BankAccount account = new BankAccount("ABA00152","TE SENGHOT", 100.0);
		
		//access and modifying the account details using encapsulations methods
		
		System.out.println("Account Number:"+account.getAccountNumber());
		System.out.println("Account Holdname:"+account.getAccountHoldname());
		System.out.println("Account Balance:"+account.getBalance());
		
		
		//Attempt to Set a new balance
		account.setBalance(500.0);
		System.out.println("Update Balance:"+account.getBalance());
		
		
		//attempt to set a nagative balance (should not be allowed)
		account.setBalance(-100.0);
		
	}

}
