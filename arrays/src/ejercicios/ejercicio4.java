package ejercicios;

public class ejercicio4 {
	//buscar un numero especifico
	public static void main(String[] args) {
		int [] numeros = {12 , 34 , 56 , 78 , 90 , 45};
		 int numeroBuscado = 78;
		 boolean encontrado = false ;
		
		 for (int i = 0; i < numeros . length ; i ++) {
			 if ( numeros [ i ] == numeroBuscado ) {
				 System . out . println ("El numero " + numeroBuscado + " se encontro en la posicion " + i ) ;
				 encontrado = true ;
			 }
		 }
		
		 if (! encontrado ) {
		 System . out . println ("El numero " + numeroBuscado + " no se encontro en el array .") ;

		 }

	}

}
