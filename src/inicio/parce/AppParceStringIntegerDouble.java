package inicio.parce;

import java.math.BigInteger;
import java.util.Scanner;

public class AppParceStringIntegerDouble {

	public static void main() {
		// sacas turno en el banco -> imprime numero --> muestra pantalla

		String numeroTurno = "023";

		System.out.println("Numero original: " + numeroTurno);

		// convertir el valor String a numerico

		Scanner sc = new Scanner(System.in);

		Integer numeroTurnoInteger = Integer.parseInt(numeroTurno);
		Double numeroDouble = Double.parseDouble(numeroTurno);

		String turno2 = "023";
		BigInteger bigInteger = new BigInteger(turno2);
		bigInteger.add(new BigInteger(numeroTurno));

		Integer doble = numeroTurnoInteger + numeroTurnoInteger;
		numeroDouble++;

		int numeroTurnoInt = numeroTurnoInteger.intValue();
		double numeroTurnoDouble = numeroDouble.doubleValue();

		numeroTurnoInt++;
		String siguienteNumero = String.valueOf(numeroTurnoInt);

		System.out.println("Siguiente numero: " + siguienteNumero);
		System.out.println("doble: " + doble);

		Object objeto = new Object();
		// equals
		// comparar contenido (valor) de los objetos
		System.out.println("Metodo equals: " + numeroTurno.equals(turno2));

		System.out.println(siguienteNumero.getClass());
		System.out.println(doble.getClass());

		System.out.println(numeroTurno.getClass().getSuperclass());
	}

}