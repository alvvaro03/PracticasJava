package dos_dimensiones;
import java . util . Scanner ;
public class ejercicio4 {
	//pedir dos numeros al usuario y sumar las posiciones q ha dicho
	public static void main(String[] args) {
		Scanner scanner = new Scanner ( System . in ) ;
		int [][] matriz = {
			{1 , 2 , 3} ,
			{4 , 5 , 6} ,
			{7 , 8 , 9}
		};
				
		System . out . println (" Matriz original :") ;
		imprimirMatriz ( matriz ) ;
				
		int suma = 0;
		boolean valida ;
				
		for (int i = 0; i < 3; i ++) {
			valida = false ;
			while (! valida ) {
				System . out . println (" Ingresa la posicion ( fila y columna ) para sumar . Ejemplo : <fila > <columna >") ;
				int fila = scanner . nextInt () ;
				int columna = scanner . nextInt () ;
				
				if ( fila >= 0 && fila < matriz . length && columna >= 0 && columna < matriz [0]. length ) {
					System . out . println (" Posicion correcta !") ;
					suma += matriz [ fila ][ columna ];
					valida = true ;
				} else {
					System . out . println (" Posicion fuera de los limites de la matriz . No se sumara .") ;

				 }
			}
		}
		System . out . println ("La suma de las posiciones seleccionadas es: " + suma ) ;
	}
				
	public static void imprimirMatriz ( int [][] matriz ) {
		for (int i = 0; i < matriz . length ; i ++) {
			for (int j = 0; j < matriz [0]. length ; j ++) {
				System . out . print ( matriz [ i ][ j ] + "\t") ;
			}
			System . out . println () ;
		}
	}

}
