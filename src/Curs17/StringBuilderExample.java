package Curs17;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		reverseString("Java");
		deleteFromString("Eu invat Java");
		replaceFromString("Salut Bogdan", 6, 12, "Oana");
		InsertIntoString ("Salut ", 6,"Ion");
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
	public static void replaceFromString(String text, int strtindex, int endindex, String testToReplace) {
		StringBuilder sb = new StringBuilder(text);
		sb.replace(strtindex, endindex, testToReplace);
		System.out.println(sb);
	}
	public static void InsertIntoString(String text, int indexStart, String testToReplace) {
		StringBuilder sb = new StringBuilder(text);
		sb.insert(indexStart, testToReplace);
		System.out.println(sb);
	}
}
