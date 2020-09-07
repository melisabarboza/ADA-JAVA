package ejercicios;

import java.util.Scanner;

public class Ejercicio210Autobus {

	private static final int MINIMO_PERSONAS = 20;
	private static final int COSTO_A = 2;
	private static final float COSTO_B = 2.5f;
	private static final int COSTO_C = 3;
	private static final String BUS_A = "A";
	private static final String BUS_B = "B";
	private static final String BUS_C = "C";

	public static void main(String[] args) {

		// tres costos diferentes por km
		// para cada autobus
		// minimo 20 personas
		// determinar costo total
		// determinar costo por persona

		// sc es la variable a la que asignamos el nuevo objeto=Scanner
		// atributos in=ingresar datos,atributos out=mostrar datos

		// solicitar la cantidad de personas
		Scanner sc = new Scanner(System.in);// system.in se refiere a una entrada de datos

		System.out.println("Ingrese cantidad de personas");
		int personas = sc.nextInt();

		// solicitar la cantidad de km
		System.out.println("Ingrese cantidad de km");
		int km = sc.nextInt();

		// solicitar el tipo de autobus
		System.out.println("Ingrese tipo de autobus(A,B,C)");
		String tipo = sc.next();

		int totalPersonas = MINIMO_PERSONAS;

		// calcular costo de transporte
		if (personas > MINIMO_PERSONAS) {
			totalPersonas = personas;

		}
		// calcular costo total:
		// total de personas * km * precio boleto

		int costoTotal = totalPersonas * km;

		float totalGrupal = 0;

		switch (tipo.toUpperCase()) {
		case BUS_A:
			totalGrupal = costoTotal * COSTO_A;
			break;
		case BUS_B:
			totalGrupal = costoTotal * COSTO_B;
			break;
		case BUS_C:
			totalGrupal = costoTotal * COSTO_C;
			break;

		}

		System.out.println("El total grupal es:" + costoTotal);
		sc.close();

	}
}
