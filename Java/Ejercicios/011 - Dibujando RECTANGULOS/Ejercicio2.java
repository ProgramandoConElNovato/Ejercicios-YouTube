package bucles;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ancho, altura;
		
		System.out.println("Vamos a dibujar un rectángulo.");
		System.out.println("Introduce la altura:");
		
		altura = sc.nextInt();
		
		System.out.println("Introduce la ancho:");
		
		ancho = sc.nextInt();
		
		for(int i = 0; i<altura; i++) {
			
			for(int j = 0; j<ancho; j++) {
				
				if(i==0 || i==altura-1) System.out.print("*");
				else {
					
					if(j==0 || j==ancho-1) System.out.print("*");
					else System.out.print(" ");
					
				}
				
			}
			
			System.out.println();
			
		}
		
		

	}

}
