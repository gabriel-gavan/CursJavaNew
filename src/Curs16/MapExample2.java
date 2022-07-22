package Curs16;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1,"negru");
		map.put(123,"alb");
		map.put(88,"rosu");
		map.put(123,"verde");
		System.out.println(map);
		
		System.out.println("---------");
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(11,"negru");
		map2.put(33,"maro");
		map2.put(888,"rosu");
	
		System.out.println(map2);
		System.out.println("---------");
		map.putAll(map2);
		System.out.println("Updated map: " + map);
	}
	
}
