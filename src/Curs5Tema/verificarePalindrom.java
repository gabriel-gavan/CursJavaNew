package Curs5Tema;

import java.util.Scanner;

public class verificarePalindrom {

	public static void main(String[] args) {
		   
		  String n; 
		  String p="";
		  
		  Scanner scan = new Scanner(System.in);
			System.out.println("Introdu un cuvant sa vedem daca e palindrom:");
			n = scan.nextLine().toLowerCase();
			
			 int length = n.length();   
		      for ( int i = length - 1; i >= 0; i-- )  
		         p = p + n.charAt(i);  
		      if (n.equals(p))  
		         System.out.println("Cuvantul este un palindrom");  
		      else  
		         System.out.println("Cuvantul nu este un palindrom");   
		   }  
		
	

}
