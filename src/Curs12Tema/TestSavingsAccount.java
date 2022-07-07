package Curs12Tema;

import java.util.Scanner;

public class TestSavingsAccount {

	public static void main(String[] args) {
		Customer customer = new Customer("Gabi", "Craiova", "gabi@gabi.com");
        SavingsAccounts account = new SavingsAccounts (12345, 5000.0, customer);
        System.out.println("Hi " + customer.getName());
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the amount to widraw:");
        double withdraw = scan.nextDouble();
        
        try {
			account.withdraw(withdraw);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
