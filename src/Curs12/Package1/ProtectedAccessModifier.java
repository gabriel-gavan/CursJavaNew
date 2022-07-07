package Curs12.Package1;

public class ProtectedAccessModifier {
/*Scopul lui este in acelasi pachet si subclase din pachete diferite
 * Clasele nu pot fi declarate ca protected ( se aplica la metoda,..)
 * Aceeasi clasa: Yes
 * Alta clasa  acelasi pachet : Yes
 * subclasa in acelasi pachet: yes
 * Subclasa in alt pachet: yes
 * Alta  clasa in alt pachet:no
 * 
 * 
 */
	protected String mesaj = "Protected Access";
	protected void printMesaj() {
		System.out.println(mesaj);
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ProtectedAccessModifier obj = new ProtectedAccessModifier ();
		}
	}
