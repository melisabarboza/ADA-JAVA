package ejercicios;

import java.util.Scanner;

public class Ejercicio998Ruta {

// En un trayecto entre dos ciudades se deben realizar paradas intermedias. 
// Se desea conocer cuantas paradas
// se van a realizar en el viaje y la longitud de los trayectos en kilometros. 
// Se desea conocer la longitud
// promedio entre ciudades y 
// cuales son las paradas mas cercanas

//  inicio
//   *------- * ---------------- * ----- * ----------- *
//     40            100            15      60
	public static void main(String[] args) {

		mostrarTitulo();

		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese estaciones intermedias:");
		int totalEstaciones = sc.nextInt();

		System.out.println();

		int vectorCiudades[] = new int[totalEstaciones];
		int acumulador = 0;
		int i = 0;
		for (; i < vectorCiudades.length; i++) {

			System.out.print("Ingrese km estacion " + (i + 1) + ":");
			vectorCiudades[i] = sc.nextInt();
//          acumulador = acumulador + ciudades[i];
			acumulador += vectorCiudades[i];

		}
		sc.close();
		System.out.println("La distancia promedio en km entre ciudades es: " + acumulador / totalEstaciones);

		System.out.print("*");

		// para j desde 0 hasta totalEstaciones con paso 1
		for (int j = 0; j < totalEstaciones; j++) {

			dibujarTrayecto(j);

			// dibujar lineas ciudad
			// dibujar punto

			// dibujar lineas ciudad
			// dibujar punto
		}
	}

	private static void mostrarTitulo() {

		System.out.println("Sistema estaciones en ruta");
		System.out.println("========================");
		System.out.println();

	}

	/**
	 * Dibuja el trayecto de una ciudad a otra
	 */

	private static void dibujarTrayecto(int distancia) {
		// por cada estacion (bucle), imprimo la cantidad de lineas segun km

		for (int i = 0; i < distancia; i++) {
			System.out.print(" - ");
		}

		// imprimo un asterisco (*)
		System.out.print(" * ");

	}

}
