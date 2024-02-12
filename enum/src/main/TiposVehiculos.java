package main;
import java . util . Scanner ;
public class TiposVehiculos {
	public enum TipoVehiculo {
		COCHE , MOTO , BICICLETA
	}
	public static void main ( String [] args ) {
		Scanner scanner = new Scanner ( System . in ) ;
		System . out . println (" Selecciona un tipo de vehiculo : ") ;
		for ( TipoVehiculo tipo : TipoVehiculo . values () ) {
			System . out . println ( tipo . ordinal () + 1 + ". " + tipo ) ;
		}
		int opcion = scanner . nextInt () ;
		
		if ( opcion >= 1 && opcion <= TipoVehiculo . values () . length ) {
			TipoVehiculo seleccion = TipoVehiculo . values () [ opcion - 1];
			System . out . println (" Seleccionaste un " + seleccion ) ;
		} else {
			System . out . println (" Opcion no valida .") ;
		}
		
		scanner . close () ;
	}
}

