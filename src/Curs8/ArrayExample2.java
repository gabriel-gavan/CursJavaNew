package Curs8;

import java.util.Random;

public class ArrayExample2 {
	/*
	 * program care genereaza 6 numere intre 0-9
	 * le pune intr-un array
	 * nu pune numere duplicate
	 * printeaza array
	 */
	// constanta
	public final int LENGTH = 6;
	public final int MAX_NUMBERS = 9;
	// int[]  numbers = new int[LENGTH];
	
	public static void main(String[] args) {

		ArrayExample2  obj = new ArrayExample2();
		obj.printArray(obj.generateNumbers());
		
	}

	public int [] generateNumbers() {
		int[] numbers = new int [LENGTH];
		Random random = new Random ();
		
		for (int i=0; i<LENGTH;i++) {
			
			int randomNr = 0;
			do {
				randomNr = random.nextInt(MAX_NUMBERS);
				
			} while (checkForUnicity(numbers, randomNr));
			numbers[i] = randomNr;
		}
		
		return numbers;
	}
	public void printArray(int[] array) {
		for (int nr: array) {
			System.out.print(nr + " | ");
		}
	}
	public boolean checkForUnicity(int[] array, int element) {
	// for each 
		for (int nr : array) { 
			if (nr == element) {
				return true;
			} 
			
		}return false;
	}
}
