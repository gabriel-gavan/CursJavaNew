package curs3;

public class StaticvsNonStatic {
	
	public static String nume;
	public static String departament = "QA";

	public static void main(String[] args) {
		
	//obiect1
		StaticvsNonStatic person1 = new StaticvsNonStatic();
		person1.nume = "Johnny ";
		System.out.println(person1.nume + departament);
		
	//obiect2
		StaticvsNonStatic person2 = new StaticvsNonStatic();
		person2.nume = "Bravo ";
		System.out.println(person2.nume + departament);
		
	//obiect3
		StaticvsNonStatic person3 = new StaticvsNonStatic();
		person3.nume = "Trei ";
		System.out.println(person3.nume + departament);
		departament = "Dev";
		System.out.println(person3.nume + departament);
		
		System.out.println("---------");
		
		System.out.println(person1.nume + departament);
		System.out.println(person2.nume + departament);
		System.out.println(person3.nume + departament);
	}

}
