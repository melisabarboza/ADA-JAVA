package inicio.controlDeFLujo;

public class AppControlDeFlujos {

	public static void main(String[] args) {
		while_1();
	}

	public static void for_1() {
		for (int l = 0; l <= 10; l++) {
			System.out.println("Ascendente:" + l);
		}
	}

	public static void for_2() {

		for (int j = 10; j > 0; j--) {
			System.out.println("Descendente" + j);

		}
	}

	public static void while_1() { // Numeros pares e impares %2

		int i = 0;

		while (i < 100) {
			i++;

			if ((i % 2) != 0) {
				System.out.println("Numero impar: " + i);
			} else {
				System.out.println("Numero par:  " + i);

			}
		}
	}

	public static void while_2() { // Numeros pares, impares y multiplos de 5
		int i = 0;
		while (i < 30) {
			i++;
			if (i % 5 == 0) {
				System.out.println(i + "multiplo de 5, lo salteo");
				continue;
			}
			if (i % 2 == 0) {
				System.out.println("numero PAR: " + i);
			} else {
				System.out.println("numero IMPAR: " + i);
			}
		}
	}
}
