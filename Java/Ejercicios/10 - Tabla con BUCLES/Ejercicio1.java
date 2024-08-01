package bucles;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número y te diré su tabla del 1 al 10.");
		
		int num = sc.nextInt();
		
		for(int i=1; i<=30; i++) {
			
			System.out.println(num + " x " + i + " = " + (num*i));
			
		}

	}

}
