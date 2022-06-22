package Curs8Tema;

import java.util.Scanner;

public class SumaValoriArray {
	
	
	
	public static void main(String[] args) {
		int [] numere = new int[10];
		int sumanumere = 0;
		
		for (int i=0;i<10;i++) {
		System.out.println("Te rog introdu numarul " + (i+1) + " : ");
		Scanner scan = new Scanner(System.in);
		numere[i] = scan.nextInt();
		
		}
		for (int i=0;i<10;i++) {
			sumanumere = sumanumere + numere[i];
		}
		System.out.println(sumanumere);
	}

}
