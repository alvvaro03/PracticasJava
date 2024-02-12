package ejercicios;
import java.util.Arrays;
public class ejercicio7 {

	public static void main(String[] args) {
		int [] numeros = {5 , 2 , 7 , 2 , 8 , 5 , 1 , 6 , 7};
		Arrays.sort (numeros) ; // Ordena el array
		
		int n = numeros.length ;
		int j = 0;
		
		for (int i = 0; i < n - 1; i ++) {
			if ( numeros [ i ] != numeros [ i + 1]) {
				 numeros [ j ] = numeros [ i ];
					j ++;
			}
		}
		
		 numeros [ j ] = numeros [ n - 1]; // El ultimo elemento
		
		 System . out . print (" Array sin duplicados : ") ;
		 for (int i = 0; i <= j ; i ++) {
			 System . out . print ( numeros [ i ] + " ") ;
		 }

	}

}
