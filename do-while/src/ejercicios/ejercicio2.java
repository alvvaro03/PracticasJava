package ejercicios;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número");
		
		int n = sc.nextInt();
		
		int i=2;
		
		int suma= 0;
		
		do {
			
			if(i%2==0) {
				
				suma= i+suma;
				;
			}
			i=i+1;
			
			System.out.println(suma);
		}while(i<n);
		
	}

}
