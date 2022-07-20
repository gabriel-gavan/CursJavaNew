package Curs13Tema;

import java.io.IOException;
import java.util.Scanner;

import Curs13.PropertiesFileProcessor;

public class vanzareLegume extends Legume{

	public static void main(String[] args) throws IOException {
	      Legume propFile = new Legume();
	      propFile.scrieCaloriiLegume();
	      //propFile.citesteCaloriiLegume("Morcov");
	   
	      Scanner scan= new Scanner(System.in);
	      String leguma;
	      
	      
	      do {
	            System.out.println("Introdu o leguma: ");
	            try{
	            leguma = scan.nextLine();
	         // propFile.citesteCaloriiLegume(leguma);
	            String calorie = propFile.citesteCaloriiLegume(leguma);
	               if(calorie != null) {
	                  System.out.println("Leguma aleasa de tine are " + calorie + " calorii");
	                  break;
	               }
	               System.out.println("Nu vindem aceasta leguma");

	            /* if (leguma == "") {
	                  System.out.println("Trebuie introdusa o leguma");
	               }
	               else {
	                  propFile.citesteCaloriiLegume(leguma);
	                  continue;
	               }*/
	         }
	             catch(NullPointerException e) {
	                System.out.println("Trebuie introdusa o leguma!!!");
	                continue;
	            }
	         }
	      while (true);
	}
	   }


