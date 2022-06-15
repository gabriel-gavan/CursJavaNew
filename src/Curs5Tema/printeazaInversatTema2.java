
package Curs5Tema;

import java.util.Scanner;

public class printeazaInversatTema2 {

	public static void main(String[] args) {
		   
		  String n; 
		  String p="";
		  
		  Scanner scan = new Scanner(System.in);
			System.out.println("Introdu un cuvant:");
			n = scan.nextLine();
			
			 int length = n.length();   
			 int i = length-1 ;
			 while (i>=0) {
				 p = p + n.charAt(i);
				 i--;
			 }
			 
		         System.out.println("Cuvantul inversat este: "+p);   
		   }  
		
	

}
