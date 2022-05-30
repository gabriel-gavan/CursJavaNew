package curs2;

public class Tester {

	//variabile 
	
	String nume;
	int RatePerHour;

	
	
	//constructor default - metodas speciala pentru a putea crea o instanta din acea clasa
	public Tester( ) {
		
	}
	
	public Tester(String nume, int ratePerHour ) {
		setNume(nume);
		setRatePerHour(ratePerHour);
	}
	
	//metode getter & setter
	
	public String getNume() {
		return nume;
	}
	private void setNume(String nume) {
		this.nume = nume;
	}
	
	//Tester tester1 = new Tester();
	//tester1.setNume("Oana")
	//tester1.getNume() --> Oana
	
	//Tester tester2 = new Tester();
	//tester2.setNume("Diana")
	//tester2.getNume() --> Diana
	
	public int getRatePerHour() {
		return RatePerHour;
	}
	
	public void setRatePerHour(int ratePerHour) {
		RatePerHour = ratePerHour;
	}
	
	
	
}
