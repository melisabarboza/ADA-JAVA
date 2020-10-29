package inicio.udemy.curso.java;

public class PrimitivosCaracteres {

	public static void main(String[] args) {
		char caracter = '\u0040'; // arroba en unicode
		char decimal = 64; // arroba en decimal
		System.out.println("caracter = " + caracter);
		System.out.println("decimal = " + decimal);
		System.out.println("caracter = decimal: " + (caracter == decimal));

		char simbolo = '@';
		System.out.println("simbolo = " + simbolo);
		System.out.println("caracter = simbolo: " + (caracter == simbolo));

		char espacio = '\u0020'; // espacio en unicode
		char retroceso = '\b'; // retroceso
		char tabulador = '\t'; // espacio de tabulador
		char nuevaLinea = '\n'; // nueva linea
		char retornoCarro = '\r'; // nueva linea

		System.out.println("tipo char corresponde en byte a:" + System.lineSeparator() + Character.BYTES);
		System.out.println("tipo char corresponde en bites a:" + Character.SIZE);
		System.out.println("valor maximo de un char: " + Character.MAX_VALUE);
		System.out.println("valor minimo de un char: " + Character.MIN_VALUE);

	}

}
