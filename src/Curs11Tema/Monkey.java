package Curs11Tema;

public class Monkey extends Primate implements BasicNeeds {
	
	private String eat = "mostly erbivore";

	@Override
	public String eat() {
				// TODO Auto-generated method stub
		return this.eat;
	}

	@Override
	public void sleep() {
		System.out.println("I need to sleep!");
		
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
	}
	@Override
	void speak( ) {
			System.out.println("cannot speak");
	}

}
