package curs3;

import java.util.Scanner;

public class greatestOfThreeNumbers {

	/*program care citeste 3 numere de la tastatura
	 * si verifica pe cel mai mare si printeaza in consola
	 * 	 * daca doua numere sunt egale , va printa "Some numbers are equal"
	 * 
	 */
	
	int number1;
	int number2;
	int number3;
	
	// 1 metoda care citeste de la tastatura cele 3 numere
	public void askTheUserForThreeNumbers () {
		
		System.out.println("Please enter number1: ");
		Scanner scan = new Scanner (System.in);
		number1 = scan.nextInt();
		System.out.println("Please enter number2: ");
		number2 = scan.nextInt();
		System.out.println("Please enter number3: ");
		number3 = scan.nextInt();
		scan.close();
	}
	
	// 2 o metoda care compara numerele si decide care este cel mai mare numar
	
	public void compareTheNumbers() {
		
		/*
		 * if ({
		 *    else if () {
		 *    AND este &&
		 *    or este ||
		 */
		if (number1 > number2 && number1 > number3) {
			System.out.println("The First Number is the greatest");
					}
			else if (number2 > number1 && number2 >number3) {
				System.out.println("The Second Number is the greatest");
			}
				else if (number3 > number1 && number3 > number2){
					System.out.println("The Third Number is the greatest");
		}
					else System.out.println("Some numbers are equal");
	}
}
