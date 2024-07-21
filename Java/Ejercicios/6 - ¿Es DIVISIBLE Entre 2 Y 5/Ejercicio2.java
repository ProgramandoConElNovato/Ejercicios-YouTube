package condicionales;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número entero.");
		
		int num1 = sc.nextInt();
		
		System.out.println("Introduce un segundo número entero.\nDebe ser diferente al primer número.");
		
		int num2 = sc.nextInt();
		
		if(num1==num2) {
			System.out.println("Te avisé de que debían ser diferentes. ¿No me lees?");
			System.exit(0);
		}
		
		if(num2>num1) num1 = num2;
		
		if(num1%2==0) System.out.println("El número " + num1 + " es par.");
		else System.out.println("Es número " + num1 + " no es par.");
		
		if(num1%5==0) System.out.println("El número " + num1 + " es divisible entre 5.");
		else System.out.println("El número " + num1 + " no es divisible entre 5.");
		
	}

}
