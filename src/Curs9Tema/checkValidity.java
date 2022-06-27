package Curs9Tema;

import java.util.Scanner;

public class checkValidity {

	public static void main(String[] args) {
		
		
		String curs;
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert course name");
		curs = scan.nextLine();
		
		int years;
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Insert experience years");
		years = scan2.nextInt();
		
		
		String schedule;
		Scanner scan3 = new Scanner(System.in);
		System.out.println("Insert schedule");
		schedule = scan3.nextLine();
		
		Qualification teach = new Qualification(curs,years,schedule);
	    teach.Verify();
	}

}
