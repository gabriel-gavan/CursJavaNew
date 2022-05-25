package curs1;

public class FirstJavaClass {
	//--> one line comment
	/*
	 * 
	 * --> multiple line comment
	 */
	int age = 23;
	//variabila
	String nume = "Jhonny";
	// nume--> numle ales de user pentru variabila
	//String  --> reprezinta data typul vvariabilei
	//=  --> reprezinta un operator de atribuire
	// "Johnny" -> reprezinta valoarea tinuta in variabila nume
	public static void main(String[] args) {

		FirstJavaClass obiect = new FirstJavaClass();  //instantierea unei clase in Java  important
		obiect.greetings();		
		
	}
	//metoda
	public void greetings() {
		System.out.println("Hello " + nume);
	}
	//public --> access modifier
	//void --> return type
	//greetings --> numele metodei
}
