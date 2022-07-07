package Curs12.Package3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception1 {

	public static void main(String[] args) throws InterruptedException {
		String[] week = {"L", "M","Mi", "J","V","S","D"	};
		
		System.out.println(week[9]);
		
		for (String day: week) {
			Thread.sleep(2000);
			System.out.println(day);
		}
		
		String filename = "nimic";
		File file = new File (filename);
		try {
			FileInputStream stream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
