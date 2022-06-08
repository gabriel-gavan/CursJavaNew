package curs4Tema;

import java.util.Scanner;

public class homeWork3 {
	public static void main(String[] args) {
		int punctaj;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu punctajul");
		punctaj = scan.nextInt();
	
		String result;
		result = (punctaj<80)?"S": (punctaj<90)?"B":"FB";
		System.out.println(result);
		
		String print;
		print = (result=="S") ? "Ai primit : Slab" : (result == "B")?"Ai primit : Bine" : "Ai primit : Foarte Bine";
		System.out.println(print);
	}
}
