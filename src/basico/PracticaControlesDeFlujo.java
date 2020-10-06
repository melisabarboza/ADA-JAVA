package basico;

public class PracticaControlesDeFlujo {

	public static void main(String[] args) {
		//imprimirValoresHastaLlevarElContadorA10(-10);
		//imprimirValoresHastaLlevarElContadorA10(0);
		//imprimirValoresHastaLlevarElContadorA10(20);
		//imprimirValoresHastaLlevarElContadorA10ConDo(-10);
		//imprimirValoresHastaLlevarElContadorA10ConDo(0);
		implementacionDeDoWhileUsandoWhile(20);
	}

	
	public static void imprimirValoresHastaLlevarElContadorA10(int contador) {
		while( contador < 10) {
			System.out.println("while :" + contador);
			contador++;
		}
		System.out.println(contador);
	}
	
	public static void imprimirValoresHastaLlevarElContadorA10ConDo(int contador) {
		do {
			System.out.println("while :" + contador);
			contador++;
		} while( contador < 10);
		System.out.println(contador);
	}
	
	public static void implementacionDeDoWhileUsandoWhile(int contador) {
		System.out.println("while :" + contador);
		contador++;
		while( contador < 10) {
			System.out.println("while :" + contador);
			contador++;
		}
		System.out.println(contador);
	}
	
}
