package ejercicios;

public class ejercicio2 {
	//cuantos pares e impares hay en el array
	public static void main(String[] args) {
		
		int miArray[] = {1,2,3,7,8,34};
		int contadorPares = 0;
		int contadorImpares = 0;
		
		for (int numero : miArray ) {
			if ( numero % 2 == 0)
				contadorPares ++;
			if ( numero % 2 != 0)
				contadorImpares ++;
		}
		
		System . out . println ("El numero de elementos pares en el array es: " + contadorPares ) ;

		System . out . println ("El numero de elementos impares en el array es: " + contadorImpares ) ;

	}

}
