package main;

import java.security.PublicKey;
import java.util.Scanner;

import javax.management.loading.PrivateClassLoader;

public class ejercicio1 {

	
		public enum Dia {LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO} {
		
			
		}
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número");
		
		int numDia = sc.nextInt(); 
		
		System.out.println(Dia);
		}
		
}	
	
	


