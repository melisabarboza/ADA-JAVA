package inicio.calculadora;

import java.util.Scanner;

public class AppCalculos {

	private static int operacion;
	private static int numero1;
	private static int numero2;
	private static int total = 0;
	private static int cerrar = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Calculadora");
		System.out.println("1.Sumar, 2. Restar, 3. Multiplicar, 4. Dividir, 0. Salir");
		operacion = sc.nextInt();

		if (operacion != cerrar) {
			System.out.println("Ingrese primer numero: ");
			numero1 = sc.nextInt();
			System.out.println("Ingrese segundo numero");
			numero2 = sc.nextInt();
		} else if (operacion > 4)
			System.out.println("La opcion ingresada es incorrecta");

		switch (operacion) {
		case 0:
			System.out.println("Calculadora finalizada!");
			break;
		case 1:
			total = numero1 + numero2;
			break;
		case 2:
			total = numero1 - numero2;
			break;
		case 3:
			total = numero1 * numero2;
			break;
		case 4:
			total = numero1 / numero2;
			break;
		}
		System.out.println("El resultado de la operacion realizada es: " + total);
	}
}