package Curs12.Package1;

import Curs12.Package2.SubClassProtectedModifier;

public class SubclassProtectedModifierSamePackage extends ProtectedAccessModifier {

	// Subclasa in acelasi pachet : yes
	public static void main(String[] args) {
		SubClassProtectedModifier obj = new SubClassProtectedModifier();
		obj.printMesaj();
	}

}
