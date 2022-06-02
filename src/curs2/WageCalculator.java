package curs2;

public class WageCalculator {
	int hoursWorked = 40;
	int age = 25;

	public static void main(String[] args) {
	
		Tester tester1 = new Tester("Ion",20,25);
		tester1.nume = "Ion";
		
		Tester tester2 = new Tester("Maria",10,30);
		tester2.nume = "Maria";
		
		Tester tester3 = new Tester("Oana",12,32);
		
		
	    System.out.println(tester1.getNume().length());
	    System.out.println(tester2.getNume().length());
	    System.out.println(tester3.getNume().length());
	    WageCalculator calc = new WageCalculator();
	    System.out.println("Salariul lui " + tester1.getNume() + " este " + calc.calculateSalary(tester1.getRatePerHour()));
	    
	    System.out.println("1"); //string
	    System.out.println(2); // int
	    System.out.println('3'); // char
	    
	    System.out.println(tester1.getNume() + " are: " + tester1.getAge() + " de ani");
	    System.out.println(tester2.getNume() + " are: " + tester2.getAge() + " de ani");
	    System.out.println(tester3.getNume() + " are: " + tester3.getAge() + " de ani");
	    
	    
	    int totalAge = tester1.getAge() + tester2.getAge() + tester3.getAge();
	    
	    System.out.println("Varsta Totala: " + totalAge);
	}
	
   public int calculateSalary(int rateHourly) {
	   return rateHourly * hoursWorked;
   }
   

	
}
