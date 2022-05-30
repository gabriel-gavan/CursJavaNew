package curs2;

public class MethodExample {
	/*
	 * numar de camere dinamic
	 * calcul al mp al fiecarei camere
	 * nr total de mp 
	 */
	public static void main(String[] args) {
		
		//room1
		int length = 4;
		int width = 2;
		int totalMP = length*width;
		System.out.println("Aria camerei este: " + totalMP);
		//room2
		int length2 = 3;
		int width2 = 4;
		int totalMP2 = length2*width2;		
		System.out.println("Aria camerei este: " + totalMP2);
		
		MethodExample room = new MethodExample();
		room.calculatArea(4, 2);
		System.out.println(room.calculatArea(4, 2));
		MethodExample room2 = new MethodExample();
		System.out.println(room2.calculatArea(3, 3));
		MethodExample room3 = new MethodExample();
		System.out.println(room3.calculatArea(4, 4));
		
		
		int total = room.calculatArea(4, 2) + room2.calculatArea(3, 3) + room3.calculatArea(4, 4);
		System.out.println(total);
		
		System.out.println(calculateTotal(room.calculatArea(4, 2),room2.calculatArea(3, 3),room3.calculatArea(4, 4)));
	}

	public int calculatArea(int length, int width) {
	return length *width;

	}
	/*
	 * public void calculatArea2(int length, int width) {
	 * System.out.println("Aria camerei este: " + length *width);
	 * 
	 * }
	 */
	public static int calculateTotal(int...rooms) {  //varargs - argumente variabile ->> int...  rooms -> int[] rooms
		int result = 0;
		for (int room : rooms) {
			result = result + room;
		// result = 0 +  8 
			//result = 8 + 12
			//result = 20 + 16
		}
		return result;

	}
}