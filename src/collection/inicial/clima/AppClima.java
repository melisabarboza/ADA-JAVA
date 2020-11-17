package collection.inicial.clima;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AppClima {

	public static void main(String[] args) {

		List<Medicion> mediciones = new ArrayList<Medicion>();
		Random randomSol = new Random();
		Random randomLluvias = new Random();

		Medicion medicion;
		for (int i = 0; i < 7; i++) {
			int temperaturas = randomSol.nextInt(10);
			int lluvia = randomLluvias.nextInt(30);

			medicion = new Medicion(temperaturas, lluvia);
			mediciones.add(medicion);
		}
		for (Medicion itemMedicion : mediciones) {
			System.out.println(itemMedicion);
		}
	}
}
