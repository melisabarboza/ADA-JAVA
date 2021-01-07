package inicio.codigo.facilito;

public class Matrices_ArreglosBidireccionales {

	public static void main(String[] args) {
		int s[][]; // Dos arrays, uno para filas y otro para columnas
		s = new int[3][3];

		s[0][0] = 1;
		s[0][1] = 2;
		s[0][2] = 3;

		s[1][0] = 4;
		s[1][1] = 5;
		s[1][2] = 6;

		s[2][0] = 7;
		s[2][1] = 8;
		s[2][2] = 9;

		for (int i = 0; i < 3; i++) { // contador de los indices derechos
			for (int j = 0; j < 3; j++) { // contador de los indices izquierdos
				System.out.println("s [" + i + "]" + "[" + j + "] = " + s[i][j]);

			}
		}
	}
}
