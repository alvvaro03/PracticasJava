package ejercicios;

import java.util.Scanner;


public class ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número del 1 al 7");
		int n=sc.nextInt();
		
		String nombreDia;
		
		
		switch (n) { 
		
	    case 1:nombreDia="lunes";
	    
	     
	     break;
	     
	    case 2:nombreDia="martes";
	     
	     break;
	     
		case 3:nombreDia="miércoles";
		
		break;
		
		case 4: nombreDia="jueves";
		
		break;
		
	    case 5 : nombreDia="viernes";
	    
	    break;
	    
	    case 6: nombreDia="sábado";
	    
	    break;
	    
	    case 7: nombreDia="domingo";
	     
	    break;
	    
	    default: nombreDia="Número invalido";
	    
	    break;
	  }
		System.out.println("Este es tu día " + nombreDia);

	}

}
