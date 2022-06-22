package Curs8;

public class ArrayFructe {

	public static void main(String[] args) {
		Fructe objMar = new Fructe ("Mar",150);
		
		
		Fructe[] fruct = new Fructe[4];
		fruct [0] = new Fructe("Banana",250);
		//System.out.println(fruct[0]);
		fruct[0].printDetails();
		fruct[1] = objMar;
		//Fructe[] fruct = {objBanana, objMar,null,null}
		objMar.printDetails();
		fruct[1].printDetails();
		
		System.out.println("-------");
		objMar = new Fructe ("Ionatan", 150);
		objMar.printDetails();
		fruct[1].printDetails();
		
		System.out.println("-------");
		
		fruct[2] = new Fructe ("Para",200);
		fruct[3] = new Fructe ("Cireasa",80);
		
		for (Fructe element : fruct) {
			element.printDetails();
		}
	}

}
