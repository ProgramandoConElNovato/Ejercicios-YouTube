package bucles;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String respuesta;
		int aciertosSeguidos = 0;
		int intentos = 0;
		int numAleatorio;
		boolean numeroValido = true;
		
		String preguntas[][]=new String[10][2];
		
		preguntas[0][0] = "Suneo";
		preguntas[0][1] = "Doraemon";
		
		preguntas[1][0]	= "Smoke";
		preguntas[1][1] = "One Piece";
		
		preguntas[2][0] = "Bu";
		preguntas[2][1] = "Dragon Ball Z";
		
		preguntas[3][0] = "Nevado";
		preguntas[3][1] = "Shin Chan";
		
		preguntas[4][0]	= "Don Patch";
		preguntas[4][1] = "Bobobo";
		
		preguntas[5][0] = "Netsuko";
		preguntas[5][1] = "Kimetsu no Yaiba";
		
		preguntas[6][0] = "Mikasa";
		preguntas[6][1] = "Ataque de los titanes";
		
		preguntas[7][0] = "L";
		preguntas[7][1] = "Death Note";
		
		preguntas[8][0] = "Tobi";
		preguntas[8][1] = "Naruto Shippuden";
		
		preguntas[9][0] = "Clara";
		preguntas[9][1] = "Heidi";
		
		ArrayList<Integer> numerosRepetidos = new ArrayList<Integer>();
		
		while(aciertosSeguidos!=3) {
			
			intentos++;
			
			do {
				
				numeroValido=true;
				
				numAleatorio = (int) (Math.random()*9+1);
				
				for(Integer i:numerosRepetidos) {
					if(numAleatorio==i) numeroValido=false;
					System.out.println(i + " " + numAleatorio);
				}
				
			}while(numeroValido==false);
			
			numerosRepetidos.add(numAleatorio);
			
			System.out.println("¿A que anime pertenece el personaje... " + preguntas[numAleatorio][0] + "?");
			
			respuesta=sc.nextLine();
			
			if(respuesta.equalsIgnoreCase(preguntas[numAleatorio][1])) {
				aciertosSeguidos++;
				System.out.println("Has acertado. Llevas " + aciertosSeguidos + " aciertos.");
			}else {
				
				aciertosSeguidos=0;
				numerosRepetidos.clear();
				System.out.println("Has fallado El anime era " + preguntas[numAleatorio][1]);
				
			}
			
			
		}
		
		if(intentos==3) System.out.println("Eres el dios del anime. No hay quien te tosa.");
		else if(intentos<10) System.out.println("Has completado el concurso en " + intentos + " intentos. Enhorabuena.");
		else System.out.println("Creo que no es tu tema. Debes estudiar más o ir a plantar melones.");

	}

}
