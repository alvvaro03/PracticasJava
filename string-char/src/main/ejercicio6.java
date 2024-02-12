package main;
import java . util . Scanner ;

public class ejercicio6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner ( System . in ) ;
		System . out . print (" Ingrese una cadena de texto : ") ;
		String cadena = scanner . nextLine () ;
		
		System . out . print (" Ingrese el caracter a buscar : ") ;
		char caracterBuscar = scanner . next () . charAt (0) ;
		
		System . out . print (" Ingrese el caracter con el que reemplazarlo : ") ;
		char caracterReemplazo = scanner . next () . charAt (0) ;
		
		String cadenaReemplazada = cadena . replace ( caracterBuscar , caracterReemplazo );

		System . out . println (" Cadena con caracteres reemplazados : " + cadenaReemplazada ) ;
		scanner . close () ;

	}

}
