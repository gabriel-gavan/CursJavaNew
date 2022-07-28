package Curs18Tema;

import java.util.Arrays;

public class ordonareArray {

	static String[] textArray = {"Alba", "Iasi", "Bacau", "Constanta"};
	static Integer[] intArray = {100, 500, 300, 400, 200};
	static Character[] charArray = {'a', 'b', 'd', 'c'};
			
	public static void main(String[] args) {
		System.out.println("-------------------------------------------");
		printDetails (textArray);
		System.out.println("-------------------------------------------");
		printDetails (intArray);
		System.out.println("-------------------------------------------");
		printDetails (charArray);
		System.out.println("-------------------------------------------");
		//printArguments ("1","2","3","4");
		
	}
	
	public static <T> void 		printDetails(T...values){
		System.out.println("Valori nesortate: ");
		for (T value: values) {
			System.out.print("  " + value + " | ");
		}
		System.out.println(" ");
		
		System.out.println("Valori sortate: ");
		for (T value2: values) {
			Arrays.sort(values);
			System.out.print("  " + value2 + " | ");
	
	
		
			//Arrays.sort(values);
		}	
		System.out.println(" ");
	}
}
