package Curs10Tema;

public class TestVehicul {
	
	
	public static void main(String[] args) {
		Vehicul obj1 = new Bicicleta("MTB","Nu Polueaza", "10 km");
		Vehicul obj2 = new Masina("Nissan Qashqai","Euro 6", "180 km");
		obj1.detaliiVehicul();
		obj2.detaliiVehicul();
		verificaMotorizarea(obj1);
		verificaMotorizarea(obj2);

	}

	 public static void verificaMotorizarea(Vehicul obiect) {
			
			if(obiect instanceof Bicicleta) {
				System.out.println(obiect.nume());
				System.out.println(obiect.motorizare());
			}else if(obiect instanceof Masina) {
				System.out.println(obiect.nume());
				System.out.println(obiect.motorizare());
			}
		}

	 
}