package Curs6Tema;

import java.util.Scanner;



public class SeriaFibonacciforEx2 {

	public static void main(String[] args) {

	Scanner scan = new Scanner (System.in);
	System.out.println("Introdu cate numere vrei sa aiba sirul Fibonacci:");
		
	 	int n =scan.nextInt();
		int fib1=0;
		int fib2=1;
		int fib3=1;
		int i = 0;
		System.out.println("Seria Fibonacci pentru " + n + " numere: " );
		System.out.println(fib1);
		
		for (i=2;i<=n; i++) {

			
			System.out.println(fib3);
			
			fib3 = fib1+fib2;
			fib1=fib2;
			fib2=fib3;
		
			
		}
	

	}
}