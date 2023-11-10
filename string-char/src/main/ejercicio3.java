package main;

import java.util.Scanner;

import javax.security.auth.callback.TextOutputCallback;

public class ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime una frase aleatoria");
		
		String frase = sc.nextLine();
		
		int contador = 0;
		
		char letra = ' ';
		
		for(int i = 0 ; i < frase.length(); i++) {
			
			letra = frase.charAt(i);
			
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				
				contador++;
			
			}
			
		}
		System.out.println(contador);
	}

}
