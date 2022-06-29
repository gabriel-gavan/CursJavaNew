package curs10;

public class MethodOverlodExample {

	public static void main(String[] args) {
		
		System.out.println(multiply(2,3));
		System.out.println(multiply(2.5,4.5));
	}
 
	public static int multiply (int a, int b) {
		return a*b;
	}
	public static double multiply (double a, double b) {
		return a*b;
	}
}
