package Curs14;

import java.io.IOException;

public class TestTextFileProcessor {

	public static void main(String[] args) throws IOException {
		
		TextFileProcessor obj1 = new TextFileProcessor();
		obj1.writeFIle("Textul meu scris in fisier\n");
		obj1.ReadFile();
		System.out.println("----------");
		obj1.updateFile("Alt text in fisier\n");
		obj1.ReadFile();
		
		obj1.deleteLineFromFile("Textul meu scris in fisier", "");
		obj1.ReadFile();
		obj1.deleteFile();
	}

}
