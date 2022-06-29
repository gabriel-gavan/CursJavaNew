package Curs10Tema;

public class Bicicleta extends Vehicul {

	
	public Bicicleta(String brand, String nivelPoluare, String vitezaMedie) {
	      super(brand, nivelPoluare, vitezaMedie);
	
}
	@Override
	public String nume (){
		String nume;
		 return nume = "Bicicleta";
	 }
	@Override
	public String motorizare() {
		String motorizare;
			 return motorizare = "Lant";
	 }
	@Override
	public  void  detaliiVehicul() {
		 System.out.println("Nivelul de poluare pentru Bicicleta este 0 si\r\n"
		 		+ "viteza medie atinsa este de 10 km/h");;
	}

}