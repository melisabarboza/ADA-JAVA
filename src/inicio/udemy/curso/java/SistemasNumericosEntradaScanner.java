package inicio.udemy.curso.java;

import java.util.Scanner;

public class SistemasNumericosEntradaScanner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		// String numeroStr = scanner.nextLine();

		int numeroDecimal = 0;

		try {
			numeroDecimal = scanner.nextInt(); // Integer.parseInt(numeroStr);
		} catch (Exception e) {
			System.out.println("Error, debe ingresar un numero entero");
			main(args);
			System.exit(0);
		}

		System.out.println("numeroDecimal = " + numeroDecimal);

		String resultadoeBinario = ("numero binario de " + numeroDecimal + " = "
				+ Integer.toBinaryString(numeroDecimal));

		String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

		String resultadoExadecimal = "numero exadecimal de  " + numeroDecimal + " = "
				+ Integer.toHexString(numeroDecimal);

		String mensaje = resultadoeBinario;
		mensaje += "\n" + resultadoOctal;
		mensaje += "\n" + resultadoExadecimal;
		System.out.println(mensaje);
	}
}