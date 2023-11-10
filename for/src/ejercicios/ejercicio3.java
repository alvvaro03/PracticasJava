package ejercicios;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número");
		
		int n=sc.nextInt();
		
		int multiplicacion=0;
		
		for (int i=1; i<=10;i++) {
		
			multiplicacion=i*n;
			System.out.println(multiplicacion);
			
			}
	}
		
		}

