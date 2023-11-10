import java.util.Scanner;
public class ACTIVIDAD_1x02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número");
		int par_impar=sc.nextInt();
		int resto=par_impar%2;
		
				if(resto==0) {
		System.out.print("PAR");
					
				}
				else {
		System.out.print("IMPAR");
				
	}

	}
}
