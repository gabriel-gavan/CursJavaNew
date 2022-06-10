package curs5;

import java.util.Scanner;

public class WhileLoopExample {

	public static void main(String[] args) {

		/**
		 * intrebam utilizatorul un numar
		 * vom printa tabla inmultii pana la 10
		 */
		
		System.out.println("Please enter a number :");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		//for
		for(int i =0; i<=10;i++) {
			
			System.out.println(number + "*" + i + " = " + number*i);
			
		}
		
		System.out.println("------------------------------------");
		
		//while
		int x = 0;
		while(x<=10) {
			
			System.out.println(number + "*" + x + " = " + number*x);

			x++;
			
		}
		
		
		
		
		
	}

}
