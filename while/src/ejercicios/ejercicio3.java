package ejercicios;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número entero");
		
		int n=sc.nextInt();
		
		int contador=0;
		
		while(n>0) {
			
			n=n/10;
			
			contador++;
			
		}
		System.out.println(contador);
	}

}
