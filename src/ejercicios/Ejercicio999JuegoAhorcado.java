package ejercicios;

import java.util.Scanner;

public class Ejercicio999JuegoAhorcado {

	public static void main(String[] args) {
		// generar palabra
		String palabra = generarPalabra();

		// repetir ingreso letras hasta adivinar o cantidad jugadas < 10
		int intentos = adivinar(palabra);

		// mostrar mensaje de puntos
		mostrarPuntos(intentos);
	}

	private static void mostrarPuntos(int intentos) {
		// Calculo de puntaje en base a intentos (4 intentos -> mayor puntaje)
		// 10 intentos -> sin puntaje
		System.out.println("Puntaje obtenido: " + intentos);

	}

	/**
	 * Este metodo recibe la palabra a adivinar y devuelve el numero de intentos en
	 * que fue adivinada la palabra
	 * 
	 * @param palabra
	 * @return
	 */
	private static int adivinar(String palabra) {
		// pedir una letra
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese una letra");
		String letra = sc.next();

		// mientras cantidad letras acertadas < total letras
		// o cantidad errores = 10

		// buscar esa letra en la palabra
		int posicion = palabra.indexOf(letra); // si la letra no existe devuelve -1

		// si existe mostrar letra, contar acierto
		palabra.charAt(posicion); // devuelve la letra de la palabra en la posicion indicada

		// sino mostrar _, contar error

		// pedir letra

		sc.close();
		return 0;
	}

	private static String generarPalabra() {
		// solicitar ingreso palabra secreta
		// minimo 4 letras
		// maximo 10 letras
		return null;
	}

}
