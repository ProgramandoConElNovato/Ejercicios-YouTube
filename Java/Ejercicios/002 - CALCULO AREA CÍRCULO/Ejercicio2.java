package ejerciciosVariables;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner miEscaner = new Scanner(System.in);
		
		System.out.println("Introduzca el radio del círculo.");
		
		double radio = miEscaner.nextDouble();
		
		double areaCirculo = Math.PI*(Math.pow(radio, 2));
		
		System.out.println("El area del círculo es: " + areaCirculo);

	}

}
