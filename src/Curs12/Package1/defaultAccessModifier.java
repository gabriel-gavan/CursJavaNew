package Curs12.Package1;

class defaultAccessModifier {

	
	/*default inseamna ca nu specificam nici un access modifier
	 * scopul este limitat la pachetul in care se afla
	 * 
	 * same class:yes
	 * subclass in acelasi pachet: yes
	 * Alta clasa in acelasi pachet: yes
	 * alta clasa in alt pachet: no
	 */
	String mesaj = "Default Modifier";
	
	void printMesaj() {
		System.out.println(mesaj);
	}
	
	public static void main(String[] args) {
		defaultAccessModifier obj = new defaultAccessModifier();
		obj.printMesaj();

	}

}
