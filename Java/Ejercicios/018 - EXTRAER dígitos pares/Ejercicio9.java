package bucles;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		long num, numReves=0;
		int suma=0;
		
		System.out.println("Introduce un número:");
		
		num=sc.nextLong();
		
		while(num!=0) {
			numReves=(numReves*10)+(num%10);
			num/=10;
		}
		
		while(numReves!=0) {
			
			long aux=numReves%10;
			if(aux%2==0) {
				System.out.print(aux + " ");
				suma+=aux;
			}
			numReves/=10;
			
		}
		
		System.out.println("\nLa suma de todos ellos es de: " + suma);

	}

}
