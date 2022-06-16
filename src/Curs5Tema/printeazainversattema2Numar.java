package Curs5Tema;

import java.util.Scanner;

public class printeazainversattema2Numar {
	public static void main(String[] args) {
		int reverse = 0; 
	      int remainder;
	      Scanner scan = new Scanner(System.in);
	      System.out.println("Introdu un numar:");
	      int nr = scan.nextInt();

	      while(nr != 0) {
	         // Ex : 123
	         remainder = nr%10;
	         //la prima rulare reminder este = 3
	         //la a doua rulare reinder este = 2
	         //la a treia rulare reminder este = 1
	         reverse = reverse*10 + remainder;
	         // la prima rulare reverse = 3
	         //la a doua rulare reverse este = 32
	         // la treia rulare reverse este = 321
	         nr = nr/10;
	         //la prima rulare nr = 12
	         //la a doua rulare nr  este = 1
	         //la a treia rulare nr este = 0

	}
	      System.out.println(reverse);
	   }
}