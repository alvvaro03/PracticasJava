package main;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime una frase");
		String frase = scanner.nextLine();
		String frase2 = frase.replace("e", "x");
		
		System.out.println(frase2);

	}

}
