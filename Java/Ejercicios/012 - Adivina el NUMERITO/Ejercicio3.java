package bucles;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, numInt, intentos;
		
		num = (int) Math.round((Math.random()*99)+1);
		
		intentos = 0;
		
		System.out.println("He generado un número aleatorio entre 1 y 100, a ver si lo adivinas en menos de 10 intentos.");
		
		do {
			
			System.out.println("Introduce un número: ");
			
			numInt = sc.nextInt();
			
			if(numInt < num) System.out.println("Tu número es menor.");
			if(numInt > num) System.out.println("Tu número es mayor.");
			
			intentos++;
			
		}while(numInt!=num && intentos < 10);
		
		if(numInt!=num) System.out.println("No has conseguido adivinarlo. El número que debías adivinar era el: " + num);
		else {
			System.out.println("¡Lo has conseguido! En " + intentos + " intentos."); 
		}

	}

}
