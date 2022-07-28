package Curs17;

public class TestTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tester t1 = new Tester<Integer>(123);
		t1.printAge();
		
		
		//@SuppressWarnings("rawtypes")
		Tester t2 = new Tester("old");
		t2.printAge();
	}

}
