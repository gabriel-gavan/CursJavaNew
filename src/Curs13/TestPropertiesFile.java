package Curs13;

import java.io.IOException;

public class TestPropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PropertiesFileProcessor propFile = new PropertiesFileProcessor();
		propFile.writePropertiesFile();
		propFile.readPropertiesFile("user");
		propFile.readPropertiesFile("email");
		propFile.readPropertiesFile("country");
		System.out.println("-----update-----");
		propFile.UpdatePropertiesFile("country", "UK");
		propFile.readPropertiesFile("country");
		
		System.out.println("-----delete-----");
		propFile.DeleteFromPropertiesfile("email");
		
	}

}
