package Curs16;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		String[] myStringArray = {"Oana","Bogdan","IOn","Ion","Maria","Oana","Bogdan","Ion","Oana","Maria"};

		for (int i = 0; i<myStringArray.length;i++) {
			for (int j = i+1; j<myStringArray.length;j++) {
				if (myStringArray[i].equals(myStringArray[j])) {
					System.out.println("nume duplicat gasit: " + myStringArray[i]);
				}
			}
		}
		
		System.out.println("----------");
		Set<String> duplicate = findDuplicates(myStringArray);
		System.out.println(Arrays.toString(myStringArray));
		
		for (String nume : duplicate) {
			System.out.println("nume duplicate: " + nume);
		}
	}
	public static Set<String> findDuplicates(String[] array) {
		Set<String> duplicateNames = new HashSet<String>();
		for (int i = 0; i<array.length;i++) {
			for (int j = i+1; j<array.length;j++) {
				if (array[i].equals(array[j])) {
					duplicateNames.add(array[i]);
					break;
				}
			}
		}
		return duplicateNames;
	}
}
