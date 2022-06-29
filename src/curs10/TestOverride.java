package curs10;

public class TestOverride {

	public static void main(String[] args) {
		Shape shape =  new Shape();
		shape.draw();
		shape.printClass();
		System.out.println(shape.nume);
		
		System.out.println("_-----");
	
		Patrat patrat = new Patrat();
		patrat.draw();
		patrat.printClass();
		System.out.println(patrat.nume);
		
		
		
		System.out.println("_-----");
		
		Cerc cerc = new Cerc();
		cerc.draw();
		patrat.printClass();
		System.out.println(cerc.nume);
	}
	
	
}
