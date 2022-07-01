package Curs11Tema;



public class ExecuteBasicNeeds {

	public static void main(String[] args) {
		Human obj1 = new Human();
		Monkey obj2 = new Monkey();
		
		verificaPrimate(obj1);
		verificaPrimate(obj2);

	}

	 public static void verificaPrimate(Primate obiect) {
			
			if(obiect instanceof Human) {
				System.out.println("Primate dataType instance of Human:");
				System.out.println("------------------------------------");
				obiect.walk();
				obiect.run();
				System.out.println(((Human) obiect).eat());
				obiect.speak();
				((Human) obiect).sleep();
				
			}else if(obiect instanceof Monkey) {
				System.out.println("Primate dataType instance of Monkey:");
				System.out.println("------------------------------------");
				obiect.walk();
				obiect.run();
				((Monkey) obiect).sleep();
				
				System.out.println(((Monkey) obiect).eat());
				obiect.speak();
			}
		}

	 
}
