package ejercicios;

import java.util.Scanner;

// Una empresa de comunicaciones ofrece servicio de telefonía, banda ancha y tv digital. 

// Cada uno de los servicios tiene un precio diferente 
// Telefonía: 10, 
// Banda ancha: 15, 
// TV, 20 
// Se desea contar cuántos clientes optan por cada servicio
// para luego conocer la facturación de cada uno de los servicios.
// Se deben ingresar los clientes por número
// (cliente = 0 para finalizar) 

public class Ejercicio {

	private static int servicio_de_telefonia = 10;
	private static int servicio_de_bandaAncha = 15;
	private static int servicio_de_tvDigital = 20;
	private static int numerodeCliente = 0;
	private static int servicioSeleccionado;

	public static void main(String[] args) {

		mostrarTitulo();

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese su numero de cliente");
		numerodeCliente = sc.nextInt();

		System.out.println("Por favor seleccione el servicio que desea contratar");

		System.out.println("Telefonia seleccione 1, Banda Ancha seleccione 2, Tv Digital seleccione 3 ");

		servicioSeleccionado = sc.nextInt();

	}

	private static void mostrarTitulo() {

		System.out.println("Bienvenido a MiluCentro");
		System.out.println("========================");
		System.out.println();

	}
}
