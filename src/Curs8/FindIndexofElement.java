package Curs8;

public class FindIndexofElement {

	int[] numbers  = {3,4,5,8,7,9};
		
	public static void main(String[] args) {
/* 
 * Avem un array de tip integer
 * vrem sa printam care este elementul si indexul unui anume element
 * Ex: index pentru element 8 este 3
 * rezolvare cu for
 * rezolvare cu For Each
 */
		FindIndexofElement obj = new FindIndexofElement();
		System.out.println("Rezolvare cu For: ");
		obj.rezolvareCuFor(9);
		System.out.println("Rezolvare cu For Each : ");
		obj.rezolvareCuForeach(9);
		System.out.println("Rezolvare cu While : ");
		obj.rezolvareCUWhile(9);
	}

	public void rezolvareCuFor(int element) {
		for (int i = 0; i< numbers.length;i++) {
			if (numbers[i] == element) {
				System.out.println("index pentru element " + element + " este " + i);
			}
		}
	}
	public void rezolvareCuForeach(int element) {
		int i = 0;
		for (int  nr : numbers) {
			if ( nr  == element) {
				System.out.println("index pentru element " + element + " este " + i);
			}
			i++;
		}
	}
	public void rezolvareCUWhile(int element) {
		int i = 0;
		while (i<numbers.length) {
			if (numbers[i] == element) {
			System.out.println("index pentru element " + element + " este " + i);
		}
			i++;
		}
	}
}
