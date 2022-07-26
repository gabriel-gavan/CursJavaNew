package Curs17Tema;

public class StringBuilderTema {
	static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam consectetur odio ac quam commodo, eu eleifend felis imperdiet. Integer bibendum nunc quis sem faucibus, vitae laoreet mi dignissim. Praesent eget ligula nec lorem varius malesuada. Nulla neque lacus, euismod quis erat nec, convallis vestibulum augue. Nullam et aliquet justo. Aliquam erat volutpat. Nulla elementum urna in dolor viverra, in efficitur lectus mattis.";
	public static void main(String[] args) {
		
	CountCuvint("Nulla");
	System.out.println("-----------------------------------------------------");
	splitPropozitii(text);
	System.out.println("-----------------------------------------------------");
	stergerecaracter(text);
	System.out.println("-----------------------------------------------------");
	inlocuirecaracter(text);
	}
 
	public static void CountCuvint(String catecuvinte) {
		int count = 0;
		for(String word: text.split("\\s")) {
		    if(word.equals(catecuvinte)) {
		        count++;
		    }
		}
		System.out.println("Cuvantul " + catecuvinte + " apare de " + count + " ori");
	}
	
	public static void splitPropozitii(String text) {
		StringBuilder sb = new StringBuilder(text);
	
		String[] propositie = sb.toString().split("\\.");
		
		for (String prop : propositie) {
		System.out.println("Propozitie: " + prop + ".");
		}
	}
	public static void stergerecaracter(String text) {
			StringBuilder sb = new StringBuilder(text);
		int i = 0;
		
		for (i=0;i<=sb.length()-1; i++)
		{
			if (sb.charAt(i) =='a' || sb.charAt(i) =='A') {
			sb.deleteCharAt(i);}
		}
			System.out.println("Propozitie fara caracterele 'a' si 'A': " +  sb);
		}
	
	public static void inlocuirecaracter(String text) {
		StringBuilder sb = new StringBuilder(text);
	int i = 0;
	
	for (i=0;i<=sb.length()-1; i++)
	{
		if (sb.charAt(i) =='o' || sb.charAt(i) =='O') {
		sb.setCharAt(i,'#');
		}
	}
		System.out.println("Textul cu caracterele 'o' si 'O' inlocuite cu '#': " +  sb);
	}
	}

