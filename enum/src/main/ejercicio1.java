package main;

import java.security.PublicKey;

import java.util.Scanner;

public class ejercicio1 {

	
		public enum dia  {
			LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO	
		}
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número");
		int numDia = sc.nextInt(); 
		
		if ( numDia >= 1 && numDia <= ejercicio1.values().length ) {
			ejercicio1 dia = ejercicio1.values () [ numDia - 1];
			System . out . println ("El dia seleccionado es: " + dia ) ;
		} else {
			System . out . println (" Numero de dia no valido .") ;
		}
			sc.close () ;
		}
		
}	
	
	


