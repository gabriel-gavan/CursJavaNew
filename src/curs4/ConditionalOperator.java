package curs4;

import java.util.Scanner;

public class ConditionalOperator {

	/*
	 * program care citeste 2 numere de la tastatura si verifica urmatoarele:
	 * verifica daca fiecare numar este pozitiv
	 * verifica daca ambele numere sunt pozitive
	 * verifica care dintre cele 2 numere este mai mic
	 * 
	 * 
	 */
	
	
	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number");
		num1 = scan.nextInt();
		
		System.out.println("Please enter second number");
		num2 = scan.nextInt();
		scan.close();
		
		//verificam daca num1 este poziv
		if (num1>0) {
			System.out.println("Num1 is positive");
		 } else {
			 System.out.println("Num1 is negative");
			 }
		//result = conditie?expresie1:expresie2
		//result = (num1>0)?"Num1 is positive":"Num1 is negative";
		
		
		
		//verificam daca num2 este poziv
		if (num2>0) {
			System.out.println("Num2 is positive");
		 } else {
			 System.out.println("Num2 is negative");
			 }
		//verificam daca num1 si num2 sunt pozitive
	if (num1>0 && num2>0) {
		System.out.println("Both numbers are positive");
	} else {System.out.println("At least one is negative");
	}
	//verificam care numar e mai mic
	if (num1>num2) {
		System.out.println("Num2 is the smallest");
	 } else if (num1==num2){
		 System.out.println("Both are equal");
		 } else {
			 System.out.println("Num1 is the smallest");
		 }
	 
		

	
	//result = conditie?expresie1:expresie2
	String result;		
	result = (num1>0)?"Num1 is positive":"Num1 is negative";
	System.out.println(result);	
	result = (num2>0)?"Num2 is positive":"Num2 is negative";
	System.out.println(result);
	
	result = (num1>0 && num2>0)?"Both numbers are positive":"At least one is negative";
	System.out.println(result);
	
	result = (num1==num2)?"Numbers are equal" : (num1<num2)?"Nume1 is the smallest" : "Nume2 is the smallest";
	}
}
