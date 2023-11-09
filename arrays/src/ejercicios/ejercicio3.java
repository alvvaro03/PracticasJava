package ejercicios;

public class ejercicio3 {

	public static void main(String[] args) {
		
		int[] array = new int[10];
		
		int mayor = 0;
		
		for(int i = 0 ; i < array.length; i++) {
			
			array[i] = (int) Math.round(Math.random() *100);
			
			System.out.println(array[i] + " ");
			
			if (mayor < array[i]) {
				
				mayor = array[i];
				
			}
		}
		//System.out.println();
		System.out.println("El número más grande es " + mayor);

	}

}
