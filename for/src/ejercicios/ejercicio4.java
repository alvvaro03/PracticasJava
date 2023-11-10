package ejercicios;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número entero positivo");
		
		double n=sc.nextInt();
		double factorial= 1;
		
		for(double i=n ; i>0 ; i--) {
		
			factorial = i* factorial;
		
	}
		System.out.println(factorial);
	}
}
