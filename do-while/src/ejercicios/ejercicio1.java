package ejercicios;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un número");
		int n=sc.nextInt();
		int multiplicacion = 0;
		
		do{
			System.out.println(multiplicacion*n);
			multiplicacion++;
			
		}
		while(multiplicacion<=10); 
			
		
	}

}
