package curs4Tema;

import java.util.Scanner;

public class CalculFactura {

	public double calculatePercentage(double obtained, double total) {
        return obtained * 100 / total;	
	}
	
	public static void main(String[] args) {
		double valoarefactura;
		double valoarefactura1;
		double valoarefactura2;
		double percentage1;
		double percentage2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu valoarea facturii");
		valoarefactura = scan.nextDouble();
		
		percentage1 = valoarefactura *5/100;
		percentage2 = valoarefactura *10/100;
		valoarefactura1 = valoarefactura - percentage1;
		
		valoarefactura2 = valoarefactura - percentage2;
		
		double result;
		double result2;
		result = (valoarefactura>100)? valoarefactura2 : valoarefactura1;
		result2 = (valoarefactura>100)? 10 : 5;
		System.out.println("Valoarea facturii cu un discount de " + result2 +" % " + "aplicat este de " + result + " lei");
	}
	
}
