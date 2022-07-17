package Curs12Tema;

import Curs12.Package3.MyAgeException;

public class SavingsAccounts extends Account{

	public SavingsAccounts(int accountNumber, double balance, Customer accountOwner) {
		super(accountNumber, balance, accountOwner);
	}
	@Override	
	
		public void withdraw(double sumaderetras) throws InsufficientFundsException{ {
		
			//double sumaramasa = balance - sumaderetras;
			if (sumaderetras>balance) {
				System.out.println("The amount you entered is greater than the available: " + balance);
			    System.out.println("Thank you for using the ATM!");
			throw new InsufficientFundsException("Insufficient funds for transaction");}
			
		 else {
			 double sumaramasa = balance - sumaderetras;
			System.out.println("Please pick your money!");
			System.out.println("Your new balance is " + sumaramasa);
		}
		
	}
	

}
}
