package curs4;

public class BitWiseOperator {

	public static void main(String[] args) {
		
		/**
		 * && --> AND   --> short circuit
		 * (x !=0) && (1/x>5) -- evalueaza  x !=0 si daca este true evalueaza (1/x>5) dupa aceea aplica conditia &
		 * 
		 * 
		 * & --> AND
		 * (x !=0) && (1/x>5) -- evalueaza  x !=0 dupa aceea evalueaza (1/x>5) dupa aceea aplica conditia &
		 * 
		 * 
		 * a||b --> evalueaza a si daca a este false -> evalueaza b
		 * 
		 * a|b --> evalueaza a si dupa evalueaza b si dupa aplica |
		 * 
		 */
		int x = 0;
		if ((x !=0) && (1/x>5)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
