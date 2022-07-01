package Curs11Tema;

public class Human extends Primate implements BasicNeeds {
	

	private String eat = "Omnivore";

	@Override
	public String eat() {
				// TODO Auto-generated method stub
		return eat;
	}

	@Override
	public void sleep() {
		System.out.println("I need to sleep!");
		
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		
	}

}
