package dos_dimensiones;

public class ejercicio1 {
	//suma de dos matrices
	public static void main(String[] args) {
		int [][] matriz1 = {{1 , 2 , 3} , {4 , 5 , 6} , {7 , 8 , 9}};
		int [][] matriz2 = {{9 , 8 , 7} , {6 , 5 , 4} , {3 , 2 , 1}};
		int filas = matriz1.length ;
		int columnas = matriz1 [0].length ;
		int [][] matrizSuma = new int [filas][columnas];
		
		for (int i = 0; i < filas ; i ++) {
			for (int j = 0; j < columnas ; j ++) {
				matrizSuma [ i ][ j ] = matriz1 [ i ][ j ] + matriz2 [ i ][ j ];
			}
		}
		System . out . println (" Matriz 1:");
		imprimirMatriz ( matriz1 ) ;
		System . out . println (" Matriz 2:");
		imprimirMatriz ( matriz2 ) ;
		System . out . println (" Matriz Suma :");
		imprimirMatriz ( matrizSuma );
		}
	public static void imprimirMatriz ( int [][] matriz ) {
		for (int i = 0; i < matriz . length ; i ++) {
			for (int j = 0; j < matriz [0]. length ; j ++) {
				System . out . print ( matriz [ i ][ j ] + " ") ;
			}
			System . out . println () ;
		}

	}

}
