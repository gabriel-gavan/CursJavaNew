package Curs16Tema;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NumeCatalog {

	public static void main(String[] args) {
	      
        Scanner scan = new Scanner(System.in);
        System.out.println("Introdu Numele: ");
        String elev = scan.nextLine();
        System.out.println("Introdu Nota: ");
        int nota = scan.nextInt();
         
       
      Map<String, Integer> map = new HashMap<>();
      //System.out.println(map.size());
   
      map.put("George", 5);
      map.put("Maria", 7);
      map.put("Andrei", 6);
      map.put("Vlad", 4);
      
   // Map<String, Integer> newMap = map.entrySet().stream()
   //            .collect(Collectors.toMap(entry -> entry.getKey().toLowerCase(), entry -> entry.getValue()));

      //String elevlower = elev.toLowerCase();
      elev = elev.substring(0,1).toUpperCase() + elev.substring(1).toLowerCase();
      System.out.println(elev);


      try {
         if (map.containsKey(elev) && map.get(elev) < nota) {
            System.out.println("Aveai o nota mai mica. Acum ai nota " + nota);
            map.put(elev, nota);

         } else if (map.containsKey(elev) && map.get(elev) >= nota) {
            System.out.println("Nu ai nevoie de alta nota. Aveai o nota mai mare. Ramai cu nota " + map.get(elev));

         }else {
            System.out.println(elev + "-> Nu aveai nota, ti-am trecut acum! Acum ai nota " + nota);
            map.put(elev,nota);
         }
      }catch (Exception e)
      {
         e.printStackTrace();
      }
      
               
   
      System.out.println("-----------");
      
      for (String key : map.keySet()) {
         System.out.println("Nume: " + key + " | " + "Nota: " + map.get(key));
      }
      
   }



}


