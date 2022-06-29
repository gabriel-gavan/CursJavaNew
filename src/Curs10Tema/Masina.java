package Curs10Tema;

public class Masina extends Vehicul{
	private String motorizare;
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
		 System.out.println("Nivelul de poluare pentru masina este :6 si\r\n"
		 		+ "viteza medie atinsa este de 190 km/h");;
	}
}
