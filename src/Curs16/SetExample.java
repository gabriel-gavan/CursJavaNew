package Curs16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		System.out.println(set.size());
		set.add("mov");
		set.add("galben");
		set.add("rosu");
		System.out.println(set.size());
		
		boolean verificaSet = set.isEmpty();
		System.out.println(verificaSet);
		set.remove("galben");
		for (String x: set) {
			System.out.println(x);
		}
			System.out.println("-----------");
			Iterator<String> iterator = set.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
			System.out.println("-----------");
			set.add("negru");
			System.out.println(set.contains("negru"));
			
			for (String x: set) {
				System.out.println(x);
				
		}
			System.out.println("-----------");
			set.clear();
			for (String x: set) {
				System.out.println(x);
				
		}
		}
	}


