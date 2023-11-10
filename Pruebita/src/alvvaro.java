import java.util.Scanner;

public class alvvaro {

	public static void main(String[] args) {
	
		int num=24; 
		
		int operacion = num + 5;
		
		
		
		
		short rm = 30000;
		
		long lc = -34L;
		
		float ft = 8.7f;
		
		double yt = 6.1d;

		
		
		String numero = "2";
		int num1 = 2;
		int num2 = 2;
		System.out.println(num1 + num2);		
		System.out.println(numero + num2);
		System.out.println(numero + " " + num2);
		Integer edad = 20;
			
		
		
		
		
		String nombree = "Álvaro";
		System.out.println("Mi nombre es " + nombree + " y tengo " + edad + " años.");
		System.out.println("Mi edad es " + edad);
		
		Integer n1 = 6;
		int ss=6;
		ss = n1.compareTo(ss);	
		System.out.println(ss);
		
		Integer n2 = 9;
		byte pp= 9;
	
		System.out.println(pp);
		
		
		
			
		
			Scanner sc = new Scanner(System.in);
			System.out.println("introduce tu nombre");
			String nombre = sc.next();
			System.out.println("introduzca tu edad");
			int edaddd = sc.nextInt();
			System.out.println("mi nombre es " + nombre + " y tengo " + edaddd);
		
			
			System.out.println("introduce tu primer entero");
			int entero1 = sc.nextInt();
			System.out.println("introduce el segundo entero");
			int entero2 = sc.nextInt();
			int suma = entero1 + entero2;
			System.out.println("el resultado de " + entero1 + " + " + entero2 + " es " + suma);
			
			sc.close();
			
			
			
			
			
	}

}
