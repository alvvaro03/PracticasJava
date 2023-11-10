package main;

import java.util.Scanner;

public class ejercicio5 {

  public static boolean esPalindromo(String palabra) {
	  
	  palabra = palabra.toLowerCase();
	  palabra = palabra.replace(" ", " ");
	  palabra = palabra.replace("á", "a");
	  palabra = palabra.replace("é", "e");
	  palabra = palabra.replace("í", "i");
	  palabra = palabra.replace("ó", "o");
	  palabra = palabra.replace("ú", "u");
	  
	  
	  int a = 0;
	  int b = palabra.length() -1;
	  
	  for ( int i = 0; i < palabra.length(); i++) {
		  if (palabra.charAt(a) == palabra.charAt(b)) {
			  a++;
			  b++;
		  }
		  else {
			return false;
		}
	  }
	
  
  }

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime una palabra");
		
		String palabra = sc.nextLine();
		
		if (esPalindromo(palabra))
			System.out.println("Es palíndromo");
		else 
			System.out.println("No es palíndromo");
		
	}

}
