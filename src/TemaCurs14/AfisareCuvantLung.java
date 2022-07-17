package TemaCurs14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AfisareCuvantLung {

	public static void main(String[] args) throws IOException {
		
		CelMaiLungCuvant obj1 = new CelMaiLungCuvant();
		obj1.writeFIle("Meaning: A reference to the mythological figure Helen of Troy (or some would say, to Aphrodite). Her abduction by Paris was said to be the reason for a fleet of a thousand ships to be launched into battle, initiating the Trojan Wars.\n");
								
		String lung = new String(Files.readAllBytes(Paths.get("Fisier Cuvinte Lungi.txt")));	
		System.out.println("Text in care cautam cel mai lung cuvant: "+ lung);
		
		 
	      String cuvant = "", large="";    
	      String[] cuvinte = new String[100];    
	      int length = 0;    
  
	      lung = lung + " ";    
            
        for(int i = 0; i < lung.length(); i++){    
            //Split the string into words    
            if(lung.charAt(i) != ' '){    
            	cuvant = cuvant + lung.charAt(i);    
            }    
            else{    
                  
            	cuvinte[length] = cuvant;    
          
                length++;    
            
                cuvant = "";    
            }    
        }            
     
        for(int k = 0; k < length; k++){    
        
            if(large.length() < cuvinte[k].length())    
                large = cuvinte[k];    
        }    
   
        System.out.println("Cel mai Lung cuvant din fisier este: " + large);    
    }    
    
    }
	

