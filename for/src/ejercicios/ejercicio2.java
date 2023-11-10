package ejercicios;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número");
		
		int n=sc.nextInt();
		
		int suma=0;
		
		for (int i=0; i<=n;i++) {
		
			if(i%2==0) {
				
				suma=i+suma;
				
			}
			
	}
		
		System.out.println(suma);
		
	}
}
