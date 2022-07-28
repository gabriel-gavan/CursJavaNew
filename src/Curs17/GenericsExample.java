package Curs17;

public class GenericsExample {

	public static void main(String[] args) {
		printDetails("Text", false);
		printDetails(123, 'c');
		printDetails(12.5, "Alt String");
		printDetails(true, 44);
	}
 
	public static <T> void printDetails(T obj, T obj2 ) {
		System.out.println("Obiectul meu: " + obj +obj2);
		System.out.println("Data type-ul obiectului meu: " + obj.getClass().getName() + obj2.getClass().getName());
	}
	/*
	public static void printDetails(String Text) {
		System.out.println("Obiectul meu: " + Text);
		System.out.println("Data type-ul obiectului meu: " + Text.getClass());
	}
	
	public static void printDetails(Integer Text) {
		System.out.println("Obiectul meu: " + Text);
		System.out.println("Data type-ul obiectului meu: " + Text.getClass());
	} */
}
