package Curs10Tema;

public class Vehicul {
 private  String brand;
 private  String nivelPoluare;
 private  String vitezaMedie;



 public Vehicul(String brand, String nivelPoluare, String vitezaMedie) {
     this.setBrand(brand);
     this.setNivelPoluare(nivelPoluare);
     this.vitezaMedie = vitezaMedie;

}

public String getBrand() {
	return brand;
	}
public void setBrand(String brand) {
	this.brand =  brand;
	}


public String getvitezaMedie() {
	return vitezaMedie;
	}
public void setvitezaMedie(String vitezaMedie) {
	this.vitezaMedie =  vitezaMedie;
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

public String getNivelPoluare() {
	return nivelPoluare;
}

public void setNivelPoluare(String nivelPoluare) {
	this.nivelPoluare = nivelPoluare;
}

}
