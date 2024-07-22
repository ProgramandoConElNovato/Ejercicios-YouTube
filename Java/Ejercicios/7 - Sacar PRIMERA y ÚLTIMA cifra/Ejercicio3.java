package condicionales;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número. (Tiene que ser positivo y como máximo de 5 cifras)");
		
		int num = sc.nextInt();
		int aux = num;
		
		if(num<0 || num>99999) {
			System.out.println("A ver si aprendes a leer y obedeces mis indicaciones.");
			System.exit(0);
		}
		
		System.out.println("La última cifra del número " + num + " es: " + num%10);
		
		if(num<10) System.out.println("La primera cifra es la misma que la última.");
		
		else if(num<100) {
			aux/=10;
			System.out.println("La primera cifra del número " + num + " es: " + aux%10);
		}else if(num<1000) {
			aux/=100;
			System.out.println("La primera cifra del número " + num + " es: " + aux%10);
		}else if(num<10000) {
			aux/=1000;
			System.out.println("La primera cifra del número " + num + " es: " + aux%10);
		}else {
			aux/=10000;
			System.out.println("La primera cifra del número " + num + " es: " + aux%10);
		}

	}

}
