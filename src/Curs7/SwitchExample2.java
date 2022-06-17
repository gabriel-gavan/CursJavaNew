package Curs7;

import java.util.Scanner;

public class SwitchExample2 {
	/*
	 * Facem un program care verifica daca un student are dreptul la bursa de studii
	 * Conditiile sunt:
	 * Sa fie anul 3
	 * Sa aiba un punctaj minim 80 pentru bursa1
	 * Sa aiba un punctaj de 50 pntru bursa 2
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("Introdu in ce an esti: ");
		Scanner scan = new Scanner (System.in);
		int an = scan.nextInt();
		
		
		int punctaj ;
switch (an) {

case 1: 
case 2: System.out.println("Nu esti eligibil pentru bursa");
break;
case 3:  
	System.out.println("Te rog introdu pnctajul: ");
	punctaj = scan.nextInt();
	switch (punctaj) {
	case 50:
		System.out.println("Esti eligibil pentru bursa 2");
		break;
	case 80:
		System.out.println("Esti eigibil pentru bursa 1");
		break;
		default: System.out.println("Te rog introdu o valoare valida!");
		
	}
	break;
	default: System.out.println("Te rog introdu un an valid!");
	break;
}
	}

}
