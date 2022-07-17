package TemaCurs14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CelMaiLungCuvant {

	public void writeFIle (String textToWrite) {
		try {
			FileWriter myFileWriter = new FileWriter ("Fisier Cuvinte Lungi.txt") ;
				myFileWriter.write(textToWrite);
				myFileWriter.close();
			
			//System.out.println("Successfully wrote to file!");
			
		}catch (IOException e) {
			System.out.println("Cannot write to file!");
			e.printStackTrace();
		}
	}
	
	public void ReadFile() {
		File  objFile = new File("Fisier Cuvinte Lungi.txt");
		try {
			Scanner scan = new Scanner (objFile);
			while (scan.hasNext()) {
				String text = scan.nextLine();
				System.out.println(text);
			}
			scan.close();
		}catch (Exception e) {
			System.out.println("Cannot read file");
			e.printStackTrace();
		}
	}
	
}
