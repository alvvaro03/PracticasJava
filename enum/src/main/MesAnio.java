package main;
import java . util . Scanner ;
public class MesAnio {
	public enum Mes {
		ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner ( System . in ) ;
		System . out . print (" Ingrese un numero de mes (1 para enero , 2 para febrero , etc .): ") ;

		int numeroMes = scanner . nextInt () ;
		
		if ( numeroMes >= 1 && numeroMes <= Mes . values () . length ) {
		Mes mes = Mes . values () [ numeroMes - 1];
		int dias = obtenerDiasMes ( mes ) ;
		System . out . println ( mes + " tiene " + dias + " dias .") ;
		} else {
		System . out . println (" Numero de mes no valido .") ;
		}
		scanner . close () ;
		}
		
		private static int obtenerDiasMes ( Mes mes ) {
			switch ( mes ) {
				case ENERO :
				case MARZO :
				case MAYO :
				case JULIO :
				case AGOSTO :
				case OCTUBRE :
				case DICIEMBRE :
					return 31;
				case ABRIL :
				case JUNIO :
				case SEPTIEMBRE :
				case NOVIEMBRE :
					return 30;
				case FEBRERO :
					return 28; // Se asume que es un anio no bisiesto en este ejemplo
			default :
					return 0;
		}
	}

}
