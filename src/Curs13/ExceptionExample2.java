package Curs13;

import java.util.Scanner;

public class ExceptionExample2 {
	
public static void main(String[] args) {
	ExceptionExample2 obj= new ExceptionExample2();
	obj.divission();
	}

public void divission() {
	Scanner scan= new Scanner(System.in);
	int num1,num2,sum;
	
	
	do {
		try { 
			System.out.println("Please enter number1: ");
		
			try{
				num1 = Integer.parseInt(scan.next());
			
		}
			 catch(NumberFormatException e) {
				 System.out.println("Please enter only numeric inputs!");
				 continue;
				
			}
		
			
		System.out.println("Please enter number2: ");
		try{
			num2 = Integer.parseInt(scan.next());
		
	}
		 catch(NumberFormatException e) {
			 System.out.println("Please enter only numeric inputs!");
			 continue;
			
		}
		
		if (num1==0 || num2 ==0)
			throw new ArithmeticException("One of the numbers is 0. Try again!");
		num2 = scan.nextInt();
		sum = num1/num2;
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	while (true);
}
}
