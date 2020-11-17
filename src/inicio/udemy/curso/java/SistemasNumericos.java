package inicio.udemy.curso.java;

import javax.swing.JOptionPane;

public class SistemasNumericos {

	public static void main(String[] args) {

		String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero");
		int numeroDecimal = 0;
		try {
			numeroDecimal = Integer.parseInt(numeroStr);
		} catch (NumberFormatException e) {
			JOptionPane.showInternalMessageDialog(null, "Error, debe ingresar un numero entero");
			main(args);
			System.exit(0);

		}

		System.out.println("numeroDecimal = " + numeroDecimal);

		String resultadoeBinario = ("numero binario de " + numeroDecimal + " = "
				+ Integer.toBinaryString(numeroDecimal));
		System.out.println(resultadoeBinario);
		int numeroBinario = 0b111110100; // se antepone el 0b
		System.out.println("numeroBinario = " + numeroBinario);

		String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
		System.out.println(resultadoOctal);
		int numeroOctal = 0764; // se antepone el 0
		System.out.println("numeroOctal = " + numeroOctal);

		String resultadoExadecimal = "numero exadecimal de  " + numeroDecimal + " = "
				+ Integer.toHexString(numeroDecimal);
		System.out.println(resultadoExadecimal);
		int numeroHex = 0x1f4; // se antepone 0x
		System.out.println("numeroHex = " + numeroHex);

		String mensaje = resultadoeBinario;
		mensaje += "\n" + resultadoOctal;
		mensaje += "\n" + resultadoExadecimal;
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
