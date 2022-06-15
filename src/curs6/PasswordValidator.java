package curs6;

import java.util.Scanner;

public class PasswordValidator {
	
	/*
	 * Facem un program care valideaza o parola pe baza unor reguli:
	 * Reguli:
	 * 1. Parola trebuie sa fie de minim 10 caractere
	 * 2. parola trebuie sa contina uppercase
	 * 3. parola nu trebuie sa fie la fel ca username
	 * 
	 * intrebam utilizatorul un username si o parola
	 * il informam care sunt regulile parolei
	 * 
	 * daca parole a valida atunci printam "Parola valida!"
	 * Daca nu , il informam care reguli nu au fost respectate
	 */
	String username;
	Scanner scan = new Scanner (System.in);
	boolean valid = false;
	public void getUsername () {
		System.out.println("Introdu username:");
		username = scan.nextLine();
			}
	
	public String GetPassword () {
		System.out.println("Introdu o parola:");
		String pass = scan.nextLine();
		return pass;
		}
	
	public void printPasswordRules () {
		System.out.println("Reguli:");
		System.out.println("1. Parola trebuie sa fie de minim 10 caractere");
		System.out.println("2. parola trebuie sa contina uppercase");
		System.out.println("3. parola nu trebuie sa fie la fel ca username");
	}
	
	public void checkPasswordRules(String pass) {
		valid = true;
		if (pass.length()<10) {
			valid = false;	
			System.out.println("Parola trebuie sa fie de minim 10 caractere");
		}
		if (pass.equals(pass.toLowerCase())) {
			valid = false;
			System.out.println("Parola trebuie sa contina uppercase");
		}
		if (pass.equals(username)) {
			valid = false;
			System.out.println("Parola nu trebuie sa fie la fel ca username");
		}
	}
	public static void main(String[] args) {
	PasswordValidator validator = new PasswordValidator ();
	 validator.printPasswordRules();
	 validator.getUsername();
	 do { 
		 validator.checkPasswordRules(validator.GetPassword());
		 if (validator.valid == true) {
			 break;
		 }
	 } while  (!validator.valid) ;
	 
	 System.out.println("Parola Valida");}
	 

}
