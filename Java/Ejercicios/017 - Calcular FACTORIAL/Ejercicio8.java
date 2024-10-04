package bucles;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		long resultado;
		
		System.out.println("Introduce un número y te diré el factorial.");
		
		num = sc.nextInt();
		resultado=num;
		
		for(int i=num-1; i>0; i--) {
			resultado=resultado*i;
		}
		
		System.out.println(num + "! = "+ resultado);

	}

}
