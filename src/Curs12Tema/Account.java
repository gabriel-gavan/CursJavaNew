package Curs12Tema;

public abstract class Account {

	private int accountNumber;
	public Double balance;// = 150.0;
	Customer accountOwner ;//= new Customer("Gabi","Craiova","gabi@gabi.com");
	
	public Account (int accountNumber, double balance, Customer accountOwner) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountOwner = accountOwner;
	}
	
	public abstract void withdraw(double sumaderetras) throws InsufficientFundsException;;
		
}