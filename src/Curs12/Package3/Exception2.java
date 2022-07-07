package Curs12.Package3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		try {
		System.out.println("Insert nr1");
		int num1 = scan.nextInt();
		
		System.out.println("Insert nr2");
		int num2 = scan.nextInt();
		num2 = (Integer)null;
		int sum = num1/num2;
		System.out.println("Suma este: " + sum);
		}
		catch(ArithmeticException e ) {
			System.out.println("Do not divide by 0");
		}
		catch(InputMismatchException e ) {
			System.out.println("Put only numbers");
		}
		catch(NullPointerException e ) {
			System.out.println("You have null");
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
		System.out.println("Code that i want to run!");
	
 //-----------------------/
	try {
		System.out.println("Insert nr1");
		int num1 = scan.nextInt();
		
		System.out.println("Insert nr2");
		int num2 = scan.nextInt();
		num2 = (Integer)null;
		int sum = num1/num2;
		System.out.println("Suma este: " + sum);
		}
	
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
		System.out.println("Code that i want to run!");
	}
}

