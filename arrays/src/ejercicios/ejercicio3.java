package ejercicios;

import java.util.Random;

public class ejercicio3 {
	//array aleatorio
	public static void main(String[] args) {
		
		int[] array = new int[10];
		Random rand = new Random () ;
		
		for (int i = 0; i < array.length ; i ++) {
			array[ i ] = rand.nextInt (100) ; // Numeros aleatorios entre 0 y 99
		}
		
		int maximo = array [0];
	
		for (int numero : array ) {
			if ( numero > maximo ) {
				maximo = numero ;
			}
		}
		
		System . out . println ("Numeros en el array : ") ;
		for (int numero : array )
		System . out . print ( numero + " ") ;
		
		System . out . println () ;
		System . out . println ("El numero mas grande es: " + maximo ) ;

	}

}
