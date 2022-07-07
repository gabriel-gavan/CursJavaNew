package Curs12Tema;

public abstract class Account {

	private int accountNumber;
	public Double balance = 150.0;
	Customer accountOwner = new Customer("Gabi","Craiova","gabi@gabi.com");
	
	public Account (int accountNumber, double balance, Customer accountOwner) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountOwner = accountOwner;
	}
	
	public void withdraw(double sumaderetras) throws InsufficientFundsException{
			if (sumaderetras<balance) {
			throw new InsufficientFundsException("Insufficient funds for transaction");
			
		} else {
			double sumaramasa = balance - sumaderetras;
			System.out.println("You are left with " + sumaramasa + " in your account");
		}
	};
		
}