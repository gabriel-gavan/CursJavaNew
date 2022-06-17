package Curs6Tema;

import java.util.Scanner;

public class SeriaFibonacciWhileEx2 {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner (System.in);
			System.out.println("Introdu cate numere vrei sa aiba sirul Fibonacci:");
				
			 	int n =scan.nextInt();
				int fib1=0;
				int fib2=1;
				int fib3=0;
				int i = 2;
				System.out.println("Seria Fibonacci pentru " + n + " numere: " );
				
				while (i<=n) {
					System.out.println(fib3);
					fib3 = fib1+fib2;
					fib1=fib2;
					fib2=fib3;
					i++;
				}
				
				
			

			}
		}