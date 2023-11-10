package ejercicios;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=(int)(Math.random()*100+1);
		System.out.println("Dime un número del 1 al 100");
		
		int teclado= sc.nextInt();
		
		while(n != teclado) {
		
		if(teclado>n){
			
			System.out.println("baje");
			
		}
		
		else if(teclado<n) {
			
			System.out.println("sube");
			
		}
		teclado= sc.nextInt();
		
		
		
	}
		System.out.println("ese es");
	}
}

