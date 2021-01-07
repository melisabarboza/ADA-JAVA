package inicio.codigo.facilito;

public class CiclosDeNumerosImpares {

	public static void main(String[] args) {
		// Algoritmo ciclicos

		for (int i = 0; i < 100; i++) {
			// Serie de numeros impares
			if ((i % 2) != 0) {
				System.out.println(i);
			}
		}

		// Serie Fibonacci 0,1,1,2,3,5,8,11 (suma de dos numeros anteriores)
		int x = 1;
		int anterior = 0;
		int variable_temporal;

		while (true) {
			System.out.println(x);
			variable_temporal = x;
			x = x + anterior;
			anterior = variable_temporal;
			if (x > 30)
				break;
		}
	}
}
