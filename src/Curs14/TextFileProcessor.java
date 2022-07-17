package Curs14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class TextFileProcessor {

	public void writeFIle (String textToWrite) {
		try {
			FileWriter myFileWriter = new FileWriter ("file.txt") ;
				myFileWriter.write(textToWrite);
				myFileWriter.close();
			
			System.out.println("Successfully wrote to file!");
			
		}catch (IOException e) {
			System.out.println("Cannot write to file!");
			e.printStackTrace();
		}
	}
	
	public void ReadFile() {
		File  objFile = new File("file.txt");
		try {
			Scanner scan = new Scanner (objFile);
			while (scan.hasNext()) {
				String text = scan.nextLine();
				System.out.println("Text file: " + text);
			}
			scan.close();
		}catch (Exception e) {
			System.out.println("Cannot read file");
			e.printStackTrace();
		}
	}
	// append
	public void  updateFile(String texttoappend) throws IOException {
		try(FileWriter myFileWriter = new FileWriter("file.txt",true)){
			myFileWriter.write(texttoappend);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void deleteLineFromFile(String textToBeReplaced, String textToReplace) throws IOException {
		String data = "";
		data = new String(Files.readAllBytes(Paths.get("file.txt")));
		
		try(FileWriter myWriter = new FileWriter("file.txt")) {
			data = data.replaceAll(textToBeReplaced, textToReplace);
			myWriter.write(data);
		}catch(IOException e) {
			e.printStackTrace();
	}
		
	
		
	}
	public void deleteFile() {
		File file = new File("file.txt");
		file.delete();
		System.out.println("Delete file : " + file.getName());
}
}
