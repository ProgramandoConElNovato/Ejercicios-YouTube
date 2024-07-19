package condicionales;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la primera nota:");
		
		double nota1 = sc.nextDouble();
		
		System.out.println("Introduce la segunda nota:");
		
		double nota2 = sc.nextDouble();
		
		System.out.println("Introduce la tercera nota:");
		
		double nota3 = sc.nextDouble();
		
		double media = (nota1+nota2+nota3)/3;
		
		System.out.println("Tu media es de: " + media);
		
		if(media<5) {
			System.out.println("Has suspendido. Esfuerzate más la próxima vez.");
		}else if(media < 6) {
			System.out.println("Has sacado un suficiente. Al menos no repites.");
		}else if(media < 7) {
			System.out.println("Bueno. Tienes un bien. No está mal.");
		}else if(media < 9) {
			System.out.println("Un notable. Como mola.");
		}else if(media <10) {
			System.out.println("Un sobresaliente. Que orgulloso estoy.");
		}else if(media == 10) {
			System.out.println("Vas a ir a la universidad que te de la real gana, Matricula de honor.");
		}else {
			System.out.println("Te has colado. Mejor escribe bien las notas.");
		}

	}

}
