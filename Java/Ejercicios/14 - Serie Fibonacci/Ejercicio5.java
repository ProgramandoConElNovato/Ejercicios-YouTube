package bucles;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1=0;
		int num2=1;
		int aux;
		
		System.out.println("Dime cuantos números de la serie de Fibonacci quieres que te muestre: ");
		
		int cantidad = sc.nextInt();
		
		for(int i=0; i<cantidad; i++) {
			
			if(i==0) System.out.print("0");
			else if(i==1) System.out.print("1");
			else {
				System.out.print(num1+num2);
				aux=num1+num2;
				num1=num2;
				num2=aux;
			}
			
			if(i!=cantidad-1) System.out.print(", ");
			
		}

	}

}
