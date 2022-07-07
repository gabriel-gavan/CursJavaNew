package Curs12.Package1;

public class privateaAccessModifier {

	
		/*
		 * Scopul e limitat la clasa in care se afla
		 * Clasa sau interfata nu poate fi declarata private
		 * 
		 * Aceeasi clasa: yet
		 * subclasa acelasi pachet: no
		 * alta clasa acelasi pachet:no
		 * subclasa alt pachet: no
		 * alta clasa alt pachet: no
		 */
	private String mesaj = "Private";
	private privateaAccessModifier() {}
	public static void main(String[] args) {
		
	}

}
