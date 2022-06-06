package curs4;

import java.util.Scanner;

public class SimpleCalculator {
/*
 * Facem un calculator simplu pentru operatiile de baza : +, * , -, /
 * intrebam useru care e primu numar
 * intrebam useru care e operatia matematica
 * intrebam useru care e numaru doi
 * printam rezultatu sub forma Ex: 2 + 2 = 4
 * 
 */
	int num1;
	int num2;
	char operation;
	int result;
	//o metoda pentru a citi de la tast
	//masina 
	//012345
	
	public void askTheUser () {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		num1= scan.nextInt();
		
		System.out.println("Please enter the operation: ");
		operation = scan.next().charAt(0); //citeste primu caracter introdus
		
		System.out.println("Please enter the Second number: ");
		num2= scan.nextInt();
		
		scan.close();
		
	}
	
	
	//metoda pentru calcul
	public void calculateValues() {
		
		if (operation == '+') { //pentru string nu folosim == ci folosim equals ( ex. Text.equalts (altText))
			
		 result = num1+ num2;
		 printResults();
		
		} else if (operation == '-') {
			 result = num1 -  num2;
			 printResults();	
		} else if (operation == '*' || operation == 'X') {
			 result = num1 *  num2;
			 printResults();	
		} else if (operation == '/' || operation == ':') {
			 result = num1 /  num2;
			 printResults();	
		} else {
			System.out.println("Wrong operation. Please insert only: '+';'-';'*';'/';'X';':'");
		}
		
	}
	public void printResults() {
		System.out.println(num1 + " " + operation + " "+ num2 + " = " + result);
	}
	}
	
	

