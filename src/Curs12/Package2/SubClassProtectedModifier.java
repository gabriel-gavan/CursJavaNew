package Curs12.Package2;

import Curs12.Package1.ProtectedAccessModifier;

public class SubClassProtectedModifier extends ProtectedAccessModifier {
	// Subclasa in alt pachet: yes
	public static void main(String[] args) {
		
		SubClassProtectedModifier obj = new SubClassProtectedModifier();
		obj.printMesaj();
	}

}
