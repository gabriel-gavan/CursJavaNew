package Curs8Tema;

import java.util.Random;

import Curs8.ArrayExample2;

public class DuplicateNames {
	
	
	public static void main(String[] args) {
		String[] myStringArray =  {"Maria", "Bob", "Ion", "George", "Oana",	"Bogdan", "Oana", "Ion"};
		
		
		for (int i = 0; i < 8; i++) { 
			
			for (int j = i+1 ; j < 8; j++) { 
				if (myStringArray[i].equals(myStringArray[j])) {
					
					System.out.println("Nume duplicat:" + myStringArray[j]);
					
				}
		}

			
		}
						
	
		
}
	
		}
		