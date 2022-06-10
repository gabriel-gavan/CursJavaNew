package curs5;

import java.util.Scanner;

public class ForVSWhile {

	/**
	 * Facem un program care ii cere utilizatorului numere pe care le aduna
	 * userul introduce cate numere doreste (fara limita)
	 * cand doreste sa se opreasca va introduce 0
	 * @throws InterruptedException 
	 * 
	 */
	
	public static void main(String[] args) throws InterruptedException {
		ForVSWhile obj  = new ForVSWhile();
			//obj.rezolvareFor();
		obj.rezolvareWhile();
	}
	
	public void rezolvareFor  () {
	
		Scanner scan = new Scanner (System.in);
		
			System.out.println("Please enter a number");
			int suma = 0;
			for (int i=scan.nextInt();i!=0; i=scan.nextInt()) {
				System.out.println("Please enter a number");
				suma = suma + i;
				// suma += i
				
			}
			System.out.println("Suma curenta este" + suma);
	}
	
	public void rezolvareWhile () {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter a number");
		int suma = 0;
		int i =scan.nextInt();
		
		while (i!=0) {
			System.out.println("Please enter a number");
			suma = suma + i;
			i=scan.nextInt();
			
					}
		System.out.println("Suma curenta este" + suma);
	}
}
