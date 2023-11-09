package main;

import java.util.Iterator;
import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			int multiplicacion = 0;
			for (int b=1 ; b <= 10 ; b++) {
				
			System.out.print(" " + "  " + b);
			
			}
			System.out.println();
			System.out.println("--------------------------------------------------------");
			for (int i = 1 ; i <=10 ; i++) {
				System.out.print(i + " ");
		
					
					for (int j = 1 ; j <= 10 ; j++) {
						
						multiplicacion = i*j;
					
						System.out.print(" | " + multiplicacion);
						
					}	
					
			
					
				System.out.println(" | ");
					
				}
			
	
			
			}
	
	}	
	

//}
