package Curs5Tema;

import java.util.Scanner;

public class numereparewhiletema3 {
	public static void main(String[] args) {
		int numar1 = 0;
		int numar2 = 0;
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter first number: ");
		numar1 = scan.nextInt();
		System.out.println("Please enter the second number ( must be greater than the first entered number): ");
		numar2 = scan.nextInt();
		
				
		int i=0;
		int par = 0;
		int impar = 0;
		
		
		if (numar1>numar2) {
			System.out.println("Second entered number is smaller than the first one. Cannot provide the odd numbers!!!");}
			
				else {	
					System.out.println("The odd numbers between " + numar1 + " and " + numar2 + " are: ");
					
					i = numar1;
					while (i<=numar2)
					{
						if ( i%2==0 )
						System.out.println(i);
						i++;
					}
								
								
								
			
		}
	}
		
	}

