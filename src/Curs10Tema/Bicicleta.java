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
	public  void  detaliiVehicul (){
		
		Bicicleta obj1 = new Bicicleta("MTB", "0","60");
		 System.out.println("Nivelul de poluare pentru " + obj1.getBrand() + " este euro " + obj1.getNivelPoluare() + " si "
		 		+ "viteza medie atinsa este de "  + obj1.getvitezaMedie() + " km/h");;
	}
}

