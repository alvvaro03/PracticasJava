package main;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu nota del examen");
		int n = sc.nextInt();
		
		if (n<60 && n>=0) {
			System.out.println("Estas suspenso");
		}
		else if (n >= 60 && n <= 100) {
			System.out.println("Su número es positivo");
			
		}
		else  {
			System.out.println("Su número no es válido");
		}

	}

}
