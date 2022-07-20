package Curs15;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		
		System.out.println(list.size());
		//add elements
		list.add("Oana");
		list.add("Ioana");
		list.add("Maria");
		list.add("Ion");
		
		System.out.println(list.size());
		//for each
		for (String nume : list) {
			System.out.println(list.indexOf(nume) +  " : " + nume);
		}
		
		System.out.println("--------");
		//adaugare pe indexul 0 al unui now item
		list.add(0,"Bogdan");
		for (String nume : list) {
			System.out.println(list.indexOf(nume) +  " : " + nume);
	}
		System.out.println(list.get(3));
		System.out.println("--------");
		//remove an item in the list
		list.remove(0);
		list.remove("Maria");
		for (String nume : list) {
			System.out.println(list.indexOf(nume) +  " : " + nume);
	}
		System.out.println("--------");
		//update an item in the list
		list.set(0, "Carmen");
		for (String nume : list) {
			System.out.println(list.indexOf(nume) +  " : " + nume);
	}
		System.out.println("--------");
		//check if an item exist in the list
		
		System.out.println(list.contains("Matei"));
}
}