package inicio.codigo.facilito;

public class Break_continue_enCiclos {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			System.out.println("Aun estas en el ciclo");
			if (i == 4) {
				// break; // salirse de un ciclo
				continue;
			}
			System.out.println("El valor de i es : " + i);
		}
		System.out.println("Haz dejado el ciclo For");
	}
}
