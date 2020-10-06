package ejercicios;

import java.util.Scanner;

/*
 * Un tablero de 3 x 3 matriz [fila][columna]
 * Dos jugadores que ingresan las coordenadas de cada ficha por teclado
 * Una vez que tengo fila y columna de la ficha, muestro el tablero con X o 0
 * Verificar si es posible la posicion de la ficha y ver si hay ganador
 * Mientras no haya ganador continua el siguiente jugador
 * 
 *    |   |
 * ---|---|---
 *    |   | X  -> tablero[1][2]
 * ---|---|----
 *    |   | 
 */


public class EjercicioTatetiSol {
	
		public static void main(String[] args) {
		
		metodoBienvenidaJugadores();
		
		
		char[] tablero = new char [9];
		char[] tableroPosicionesNumericas = {'0','1','2','3','4','5','6','7','8'};
		metodoImprimirTablero(tableroPosicionesNumericas);
		System.out.println();
		metodoImprimirTablero(tablero);
		juego();

	}
	public static void metodoBienvenidaJugadores() {

		System.out.println(" **** Bienvenido al  **** ");
		System.out.println();
		System.out.println(" Ta-Te-Ti ");
		System.out.println();
		System.out.println(" ¡Que la suerte te acompañe! ");
		System.out.println();
	}
	
	// char[][] tablero 
	public static void metodoImprimirTablero(char[] tablero) {
		
			Scanner scan = new Scanner(System.in);
			System.out.println(" " + tablero[0] + " "  + "|" + " " + tablero[1] + " "  + "|" + " " + tablero[2] + " " );
			System.out.println("---|---|---");
			System.out.println(" " + tablero[3] + " "  + "|" + " " + tablero[4] + " "  + "|" + " " + tablero[5] + " " );
			System.out.println("---|---|---");
			System.out.println(" " + tablero[6] + " " +  "|" + " " + tablero[7] + " "  + "|" + " " + tablero[8] + " " );
	}
	

	
	//Dos jugadores que ingresan las coordenadas de cada ficha por teclado
	public static void juego() {
		
		Scanner sc = new Scanner(System.in);
		
		for (int i= 0; i < 9; i ++) {
			
			int turno =  i % 2;
			
			System.out.println("Jugador " + (turno + 1) + (" ingrese una posicion del 0 al 8:" ));
			
			int posicionElegida = sc.nextInt();
			
			
		}
		
			
		
	}
	
	
}



