package teoria;

import java.util.Scanner;

public class Bucles {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hola usuario. Introduce contraseña.");
		
		String pass;
		
		do {
			
			System.out.println("Contraseña incorrecta. Prueba de nuevo.");
			pass = sc.nextLine();
			
		} while(!pass.equals("1234"));
		
		System.out.println("Bienvenido a tu perfil. Has vuelto.");

	}

}
