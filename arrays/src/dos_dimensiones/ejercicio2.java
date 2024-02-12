package dos_dimensiones;

public class ejercicio2 {
	//traspuesta de un array
	public static void main(String[] args) {
		int [][] matriz = {{1 , 2 , 3} , {4 , 5 , 6} , {7 , 8 , 9}};
		int filas = matriz . length ;
		int columnas = matriz [0]. length ;
		int [][] matrizTranspuesta = new int [ columnas ][ filas ];
		
		for (int i = 0; i < filas ; i ++) {
			for (int j = 0; j < columnas ; j ++) {
				matrizTranspuesta [ j ][ i ] = matriz [ i ][ j ];
			}
		}
		
		System . out . println (" Matriz Original :") ;
		imprimirMatriz ( matriz ) ;
		System . out . println (" Matriz Transpuesta :") ;
		imprimirMatriz ( matrizTranspuesta ) ;
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
