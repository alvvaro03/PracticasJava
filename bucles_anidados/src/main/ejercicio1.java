package main;

import java.util.Iterator;
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("dime un numero");
		int n = sc.nextInt();
	
		
		for (int i = 1; i<=n ;i++) {
			
			for(int j = 1 ; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
