package Curs7Tema;

import java.util.Scanner;

public class switchBonusTema {
	public static void main(String[] args) {
		System.out.println("Introdu anul de vechime: ");
		Scanner scan = new Scanner (System.in);
		int an = scan.nextInt();
		
		
		
		int valoarevanzari ;
		
switch (an) {

	case 1: System.out.println("Pentru un an de vechime primesti un bonus de 100 de lei");
			break;
	case 2: System.out.println("Pentru 2 ani de vechime primesti un bonus de 200 de lei");
			break;
	
	case 3:  
		System.out.println("Te rog introdu valoarea vanzarilor: ");
		valoarevanzari = scan.nextInt();

		if (valoarevanzari <= 5000) {
			System.out.println("Pentru 3 ani de vechime si vanzari de " + valoarevanzari + " lei primesti un bonus de 600 de lei");
			break;
	}
		else if (valoarevanzari > 5000 && valoarevanzari <= 10000) {
			int luna ;
			System.out.println("Te rog introdu luna in care s-au efectuat vanzarile: ");
			
			luna = scan.nextInt();
		
			switch (luna) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6: 	System.out.println("Pentru 3 ani de vechime si vanzari de " + valoarevanzari + " de lei " + "in luna " + luna + " primesti un bonus de 800 de lei");
							
			break;
			case 7:
			case 8:
			case 9:
			case 10:
			case 11: System.out.println("Pentru 3 ani de vechime si vanzari de " + valoarevanzari + " de lei " + "in luna " + luna + " primesti un bonus de 1000 de lei");
			break;
			case 12: System.out.println("Pentru 3 ani de vechime si vanzari de " + valoarevanzari + " de lei " + "in luna " + luna + " primesti un bonus de 900 de lei");
					 System.out.println("In Decembrie se vand singure!");
			break;
			default: System.out.println("Te rog introdu o luna valida!");
			break;
			}
		} else if ((valoarevanzari > 10000)){
			System.out.println("Pentru 3 ani de vechime si vanzari de " + valoarevanzari +  " lei primesti un bonus de 1200 de lei");
		}
				
}
	}


}
