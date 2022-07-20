package Curs15Tema;

import java.util.ArrayList;
import java.util.List;

public class Contains {

	public static void main(String[] args) {
		List<String> list1= new ArrayList<>();
		list1.add("Product1");
		list1.add("Product2");
		list1.add("Product3");
		list1.add("Product4");
		list1.add("Product5");
		
		
		for (String nume : list1) {
			System.out.println(list1.indexOf(nume) +  " : " + nume);
		}
		
		List<String> list2= new ArrayList<>();
		
		list2.add("Product1");
		list2.add("Product2");
		list2.add("Product6");
		list2.add("Product4");
		list2.add("Product8");
		
		System.out.println("-----------");
		//for each
		for (String nume : list2) {
			System.out.println(list2.indexOf(nume) +  " : " + nume);
		}
		//check if an item exist in the list
		
		System.out.println("-----------");
				
		for (String nume : list1) {
			if (list2.contains(nume)) {
		
		System.out.print("Yes,");
		} else System.out.print("No,");
		
		
		//for each
		}
}}
