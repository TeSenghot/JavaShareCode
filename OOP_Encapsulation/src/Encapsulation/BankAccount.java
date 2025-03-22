package Encapsulation;

public class BankAccount {

	private String accountNumber;
	private String accountHoldname;
	private double balance;
	
	//constructor to initialized the fields
	
	public BankAccount(String accountNumber, String accountHoldname, double balance) {
		this.accountNumber=accountNumber;
		this.accountHoldname=accountHoldname;
		this.balance=balance;
	}
	
	
	
	//Getter AccountNumber
	public String getAccountNumber() {
		return accountNumber;
	}
	//Setter AccountNumber
	public String setAccountNumber() {
		this.accountNumber=accountNumber;
	}
	
	
	//Getter AccountHoldNumber
	public String getAccountHoldname() {
		return accountHoldname;
	}
	//Setter AccountHoldNumber
	public String setAccountHoldName() {
		this.accountHoldname=accountHoldname;
	}
	
	
	
	
	
	//Getter for Balance
	public double getBalance() {
		return balance;
	}
	//Setter for Balance
	public void setBalance(double balance) {
		if(balance >= 0)
		this.balance=balance;
		else {
		System.out.println("Balance cannot be negative");
		}
	}
}
