package main;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número");
		int n = sc.nextInt();
		
		if (n<0) {
			System.out.println("Su número es negativo");
		}
		else if (n>0) {
			System.out.println("Su número es positivo");
			
		}
		else  {
			System.out.println("Su número es 0");
		}
	}

}
