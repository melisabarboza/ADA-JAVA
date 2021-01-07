package inicio.codigo.facilito;

public class Arrays {

	public static void main(String[] args) {

		String s[]; // Array de Strings
		Object q[]; // Array de objetos

		// int x[]; // Se declara variable del arreglo
		// x = new int[3]; // Se le asigna al arreglo de enteros 3 posiciones

		int x[] = { 10, 5, 7 }; // OTRA FORMA DE ESCRIBIR ARREGLO DE 3 POSICIONES

		// int x [] = new int[3]; OTRA FORMA DE ESCRIBIR ARREGLO DE 3 POSICIONES
		// x[0] = 10;
		// x[1] = 5;
		// x[2] = 7;
		for (int i = 0; i < x.length; i++) {
			System.out.println("Arreglo en indice  " + i + " es igual a  :" + x[i]);
		}
	}
}
