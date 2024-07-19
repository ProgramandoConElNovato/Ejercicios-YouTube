package condicionales;

public class ClaseIf {

	public static void main(String[] args) {
		
		int numero = 150;
		
		if(numero < 100) {
			System.out.println("El número elegido es el " + numero);
		}else if(numero<200){
			System.out.println("El número es grandecito.");
		}else {
			System.out.println("No cumple la condición del IF.");
		}
		
		System.out.println("Eh. Aquí también llego.");

	}

}
