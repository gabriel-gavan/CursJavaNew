package Curs8;

public class ForeachExample {

	public static void main(String[] args) {
		String[] cities = {"Iasi", "Arad", "Cluj", "Alba"};
		//indexul             0       1        2      3
		//System.out.println(cities.length); = 4
		
		for(int i = 0; i < cities.length;i++) {
			System.out.println(cities[i]);
		}
		System.out.println("-----");
		
		for (String oras :cities) {
		System.out.println(oras);
		}
	}

}
