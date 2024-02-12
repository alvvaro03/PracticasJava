package main;
import java . util . Scanner ;
public class ejercicio5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner ( System . in ) ;
		System . out . print (" Ingrese una palabra o frase : ") ;
		String texto = scanner . nextLine () ;
		// Eliminar espacios en blanco y convertir a minusculas
		texto = texto . replace (" ", "") . toLowerCase () ;
		String reverso = "";
		
		for (int i = texto . length () - 1; i >= 0; i --)
		reverso += texto . charAt ( i ) ;
		
		if ( texto . equals ( reverso ) )
		System . out . println ("Es un palindromo .") ;
		else
		System . out . println ("No es un palindromo .") ;
		scanner . close () ;

	}

}
