package inicio.udemy.curso.java;

public class HolaMundo { // las clase siempre empiezan con mayuscula y camelCase

	public static void main(String[] args) {
		String saludar = "Hola Mundo desde Java";

		System.out.println(saludar);
		System.out.println("saludar.toUpperCase = " + saludar.toUpperCase());

		int numero = 11;

		boolean valor = true;
		int numero2 = 5;
		if (valor) { // si valor es verdadero imprimir...
			System.out.println("numero =  " + numero);
			numero2 = 10;
		}
		System.out.println("numero2 =  " + numero2);

		String nombre;
		nombre = "Andres";

		if (numero > 10) {
			nombre = "Juan";
		}
		System.out.println("nombre = " + nombre);

	}
}
