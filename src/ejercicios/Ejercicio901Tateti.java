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

public class Ejercicio901Tateti {

	private static int FILAS = 3;
	private static int COLS = 3;

	public static void main(String[] args) {
		// char[][] tablero = new char[FILAS][COLS];
		Scanner scan = new Scanner(System.in);
		int[][] tablero = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(" " + tablero [0][0] + " "  + "|" + " " + tablero [0][1] + " "  + "|" + " " + tablero [0][2] + " " );
		System.out.println("---|---|---");
		System.out.println(" " + tablero [1][0] + " "  + "|" + " " + tablero [1][1] + " "  + "|" + " " + tablero [1][2] + " " );
		System.out.println("---|---|---");
		System.out.println(" " + tablero [2][0] + " " +  "|" + " " + tablero [2][1] + " "  + "|" + " " + tablero [2][2] + " " );

	}
}
