package ejercicios;

public class ejer1 {

	public static void main(String[] args) {
		
		int miArray[] = {1,2,3,7,8,34};

		//miArray = new int [2];
		
		int sumatorio = 0;
		
		for(int i = 0 ; i<miArray.length ; i++) {
			
			sumatorio += miArray[i];
			
		}
		
		System.out.println(sumatorio);  
	}

}
