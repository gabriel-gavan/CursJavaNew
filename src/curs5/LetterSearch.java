package curs5;

import java.util.Scanner;

public class LetterSearch {

	/**
	 * cerem un string de la tastatura
	 * cautam in stringul respectiv daca contine litera A
	 * daca o gasim, printam litera A exista in text
	 * daca nu o gasim, printam litera a nu exista in text
	 * si printam si de cate ori apare
	 */
	
	public static void main(String[] args) {
	
		System.out.println("Please enter a text: ");
		Scanner scan =  new Scanner(System.in);
		String text =  scan.next().toUpperCase();
		char letter =  'A';
		//text.toUpperCase(); //String ABBA.equalsIgnoreCase('abba')
		System.out.println(text);
		//masina
		//012345(6--> exceptie --> IndexOutOfBoundsException)
	//	boolean letterFound = false;
		int counter = 0;
		
		for(int i = 0;i<text.length();i++) {
			
			if(text.charAt(i)==letter) {
			//	letterFound = true;
				counter++;
			}
		}
		
		if(counter>0) {
			System.out.println("Litera A exista in text de " + counter);
		}else {
			System.out.println("Litera A nu exista in text!");
		}
		
		
	}

}
