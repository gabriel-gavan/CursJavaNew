package Curs10Tema;

public class Masina extends Vehicul{

	public Masina(String brand, String nivelPoluare, String vitezaMedie) {
	      super(brand, nivelPoluare, vitezaMedie);
	
}
	@Override
	public String nume (){
		String nume;
		 return nume = "Masina";
	 }
	@Override
	public String motorizare() {
		String motorizare;
			 return motorizare = "Diesel";
	 }
	@Override
	public  void  detaliiVehicul (){
		Masina obj1 = new Masina("Toyota", "5","220");
		 System.out.println("Nivelul de poluare pentru " + obj1.getBrand() + " este euro " + obj1.getNivelPoluare() + " si "
		 		+ "viteza medie atinsa este de "  + obj1.getvitezaMedie() + " km/h");;
	}
}
