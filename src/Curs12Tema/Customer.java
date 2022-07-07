package Curs12Tema;

public class Customer {

	private String name;
	private String address;
	private String email;
	public  Customer (String name, String address, String email) {
		this.setName(name);
		this.address = address;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
