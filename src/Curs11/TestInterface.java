package Curs11;

public class TestInterface {

	public static void main(String[] args) {
		Tester tester = new Tester();
		tester.setEmail("oana@oana.com");
		tester.setName ("oana");
		
		System.out.println(tester.getName());
		System.out.println(tester.getEmail());
		tester.printNumeDepartament();
		
		Developper developer = new Developper();
		developer.setEmail("Ioana@Ioana.com");
		developer.setName ("Ioana");
		
		System.out.println(developer.getName());
		System.out.println(developer.getEmail());
		developer.printNumeDepartament();
	}

}
