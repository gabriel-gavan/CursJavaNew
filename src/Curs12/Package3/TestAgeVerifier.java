package Curs12.Package3;

import java.util.Scanner;

public class TestAgeVerifier {

	public static void main(String[] args) {
		AgeVerifier obj = new AgeVerifier();
		Scanner scan = new Scanner (System.in);
		System.out.println("Introdu varsta");
		int age = scan.nextInt();
		try {
			obj.checkAgeLimit(age);
		} catch (MyAgeException e) {
			System.out.println("Trebuie sa ai 18 ani sa votezi!!");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
