package main;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime una palabra");
		
		String palabra = sc.next();
		
		String invertir = ""; 
		
		for(int i = palabra.length()-1 ; i >= 0 ; i--) {
			
			invertir += palabra.charAt(i);
		}
		
		System.out.println(invertir);

	}

}
