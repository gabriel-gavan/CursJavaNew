package Curs11;

public class Tester implements Angajat {
	String name;
	String email;
	@Override
	public void setName(String name) {
	this.name = name;
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setEmail(String email) {
		this.email = email;
		
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}
	public void printNumeDepartament() {
		System.out.println("QA");
}
}
