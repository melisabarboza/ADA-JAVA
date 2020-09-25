package ejercicios;

import java.util.Scanner;

/* Calcular el total de expensas 
 * Edificio de 4 pisos que tiene 
 * Un departamento por piso desde 
 * Planta baja hasta el último piso. 
 * Se deben ingresar los valores de cada departamento
 *  y luego informar el importe de expensas promedio
*/

public class Ejercicio900Expensas {

	public static void main(String[] args) {

		int pisos[] = new int[4];

		float totalExpensas = 0f;

		int promedio = 4;

		float importePromedio = 0f;

		for (int i = 0; i < pisos.length; i++) {

			pisos[i] = 0;

		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese expensas del Piso 1: ");
		float expensasPrimerPiso = sc.nextFloat();
		System.out.println("Ingrese expensas del Piso 2: ");
		float expensasSegundoPiso = sc.nextFloat();
		System.out.println("Ingrese expensas del Piso 3: ");
		float expensasTercerPiso = sc.nextFloat();
		System.out.println("Ingrese expensas del Piso 4: ");
		float expensasCuartoPiso = sc.nextFloat();

		totalExpensas = expensasPrimerPiso + expensasSegundoPiso + expensasTercerPiso + expensasCuartoPiso;
		System.out.println("El importe total de expensas del edificio es de: $ " + totalExpensas);

		importePromedio = totalExpensas / promedio;
		System.out.println("El importe promedio es de: $ " + importePromedio);

	}

}
