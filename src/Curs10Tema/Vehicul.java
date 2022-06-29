package Curs10Tema;

public class Vehicul {
 private  String brand;
 private  String nivelPoluare;
 private  String vitezaMedie;



 public Vehicul(String brand, String nivelPoluare, String vitezaMedie) {
     this.brand = brand;
     this.nivelPoluare = nivelPoluare;
     this.vitezaMedie = vitezaMedie;

}

public String nume() {
	String nume = "Vehicul";
	 return nume;
 }
public String motorizare () {
	String motorizare = "Cu Roti";
		 return motorizare ;
 }
public  void  detaliiVehicul() {
	 System.out.println("Nivelul de poluare pentru masina Dacia este :5 si\r\n"
	 		+ "viteza medie atinsa este de 180 km/h");;
}

}
