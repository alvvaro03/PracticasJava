package main;

import java.io.IOException;
import java.util.Scanner;

import javax.lang.model.element.NestingKind;

public class ejercicio1 {



	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe una cadena de texto");
		
		String frase = sc.nextLine();
		
		char letra = ' ';
		
		int contenedor = 0;
		
		for (int i= 0 ; i<frase.length() ; i++) {
			
			letra = frase.charAt(i);
			
			if (letra == 'a' || letra == 'A' ) {
				
				contenedor++;
			
			}
		
		}
	
		System.out.println(contenedor);
	
	}
}
