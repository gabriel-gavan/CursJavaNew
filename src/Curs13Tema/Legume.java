package Curs13Tema;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class Legume {
	public void scrieCaloriiLegume() throws IOException{
		try (OutputStream outPutStream = new FileOutputStream("test.properties")){
			
			
			Properties prop = new Properties();
			prop.setProperty("Morcov", "58");
			prop.setProperty("Ceapa", "80");
			prop.setProperty("Dovlecel", "30");
			prop.setProperty("Rosie", "42");
			prop.setProperty("Ardei Gras", "73");
			
			
			prop.store(outPutStream, "am salvat fisierul properties");
			System.out.println("Inside write prop file" + prop);
			//outPutStream.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
		public void citesteCaloriiLegume(String key) throws FileNotFoundException,IOException {
			try(FileInputStream inputStream = new FileInputStream("test.properties")) {
				Properties prop = new Properties();
				prop.load(inputStream);
			
				String value = prop.getProperty(key);
				
				if (prop.getProperty(key) == null) {
					System.out.println("Nu Vindem aceasta leguma");
					
				} else {
					
					
				
				System.out.println("Leguma aleasa de tine are " + value + " calorii");
				
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		}
}
