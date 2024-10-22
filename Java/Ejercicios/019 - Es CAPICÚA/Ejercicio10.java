package bucles;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long num, numReves = 0, aux;
		boolean esCapicuo = true;
		
		System.out.println("Introduce un número y te diré si es capicúa.");
		
		num = sc.nextLong();
		aux=num;
		
		while(aux!=0) {
			numReves=(numReves*10)+aux%10;
			aux/=10;
		}
		
		while(num!=0) {
			
			if(num%10!=numReves%10) esCapicuo=false;
			num/=10;
			numReves/=10;
			
		}
		
		if(esCapicuo) System.out.println("El número es capicúo.");
		else System.out.println("El número no es capicúo.");

	}

}
