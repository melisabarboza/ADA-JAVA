package inicio.udemy.curso.java;

public class SistemasNumericos {

	public static void main(String[] args) {

		int numeroDecimal = 500;
		System.out.println("numeroDecimal = " + numeroDecimal);

		System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

		int numeroBinario = 0b111110100; // se antepone el 0b
		System.out.println("numeroBinario = " + numeroBinario);

		System.out.println("numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
		int numeroOctal = 0764; // se antepone el 0
		System.out.println("numeroOctal = " + numeroOctal);

		System.out.println("numero exadecimal de  " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
		int numeroHex = 0x1f4; // se antepone 0x
		System.out.println("numeroHex = " + numeroHex);
	}

}
