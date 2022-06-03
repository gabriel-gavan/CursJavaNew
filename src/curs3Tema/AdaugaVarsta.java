package curs3Tema;

import java.util.Scanner;

public class AdaugaVarsta {
	int varsta;
	
	public void askTheUserForAge() {
		System.out.println("Please enter your age: " +"\n");
		Scanner scan = new Scanner(System.in);
		varsta = scan.nextInt();
		
	}
	
	
	public void verificaVarsta() {
				
		if(varsta<18) {
			System.out.println("Esti minor!");	
			
		}
		else  if (varsta >=  18 && varsta <= 65){
			System.out.println("Esti adult!");
		}
		else {System.out.println("Esti batran");
			
		}
	}
	
}

