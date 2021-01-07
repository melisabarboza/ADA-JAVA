package inicio.codigo.facilito;

public class Switch_case {

	public static void main(String[] args) {

		// Debe tener como parametro un int o char(String)
		int x;
		x = 'B';

		switch (x) {
		case 0:
			System.out.println("Esta es la opcion 0");
			break;
		case 1:
			System.out.println("Esta es la opcion 1");
			break;
		default:
			System.out.println("Esta es la opcion por defecto");
			break;
		}
	}
}
