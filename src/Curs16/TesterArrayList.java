package Curs16;

import java.util.ArrayList;
import java.util.List;

public class TesterArrayList {
//lista de obiecte
	public static void main(String[] args) {
		Tester t1 = new Tester("Oana",22,"QA");
		Tester t2 = new Tester("Maria",29,"QA");
		Tester t3 = new Tester("Ion",27,"QA");
		List<Tester>  testerlist = new ArrayList<>();
		testerlist.add(t1);
		testerlist.add(t2);
		testerlist.add(t3);
		//System.out.println(testerlist.get(0).nume);
		//System.out.println(t1.nume);
		
		for(Tester t: testerlist) {
			System.out.println(t.nume + " | " + t.age + " | " + t.departament);
		}
	}

}
