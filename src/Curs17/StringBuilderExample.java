package Curs17;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		reverseString("Java");
		deleteFromString("Eu invat Java");
	}
 
	public static void reverseString(String text) {
		StringBuilder sb = new StringBuilder(text);
		sb.reverse();
		System.out.println(sb);
	}
	public static void deleteFromString(String text) {
		StringBuilder sb = new StringBuilder(text);
		sb.delete(2,6);
		System.out.println(sb);
	}
}
