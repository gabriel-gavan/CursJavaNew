package curs3Tema;

public class Car {
	public static String brand;
	public static String type;
	public static String engine;
	
	public Car( ) {
		
	}
	
	public Car(String brand, String engine) {
		setBrand(brand);
		setEngine(engine);
		type = "Suv";
	}

	public String getBrand() {
		return brand;
	}
	private void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getEngine() {
		return engine;
	}
	private void setEngine(String engine) {
		this.engine = engine;
	}
	
	
	public String carDetails() {
		String cardetails = ("All " + brand + " cars are "+ engine + " and are of type " + type);
		return cardetails;
		//return carDetails;
	}
}
