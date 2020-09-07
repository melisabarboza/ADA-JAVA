package ejercicios;

import java.util.Scanner;

public class Ejercicio203Lapices {

	private static final int PRECIO_MIN = 90;
	private static final int PRECIO_MAY = 85;

	public static void main(String[] args) {

		// de 1000 en adelante precio 85
		// sino precio es 90
		// solicitar cantidad de lapices
		// informar el total

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de lapices");
		int lapices = sc.nextInt();
		int total = 0;

		if (lapices < 1000) {
			total = lapices * PRECIO_MIN;

		} else {
			total = lapices * PRECIO_MAY;
		}

		sc.close();

		System.out.println("El total es: " + total);
	}
}
