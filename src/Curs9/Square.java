package Curs9;

public class Square extends Shape{

	public Square(String name, String color) {
		super(name, color);
		// TODO Auto-generated constructor stub
	}

	public String shapeName = "Patrat";
	public String shapeColor = "Negru";
	
	/*
	public Square (String name, String color) {
		this.shapeName = name;
		this.shapeColor = color;
	}
	public Square () {}
	*/
	public Square () {}
	public void displayDetails( ) {
		System.out.println(" Clasa copil este: Shape name is : " + super.shapeName + " and the color is " + shapeColor);
		super.displayDetails();
	}
}
