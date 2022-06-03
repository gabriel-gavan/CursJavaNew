package curs3Tema;

public class TestCar {

	public static void main(String[] args) {
		Car obiect = new Car();
		System.out.println(obiect.carDetails());
		
		Car obiect2 = new Car();
		Car.type = "Sedan";
		//Car.brand = "Cucu";
		System.out.println(obiect2.carDetails());
		System.out.println(obiect.carDetails());
	}

}


//Sunt corecte conform executiei din TestCar?
//Cred ca da :D