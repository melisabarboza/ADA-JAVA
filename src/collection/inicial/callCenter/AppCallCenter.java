package collection.inicial.callCenter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//se desea conocer para cada uno de los dias del mes, la cantidad de ventas y de reclamos
//por dia que realizaron al call center en el mes
//Listar la informacion generada

// Usar ramdom y List

public class AppCallCenter {

	public static void main(String[] args) {

		Random ventas = new Random();
		Random reclamos = new Random();

		Llamadas llamadas;
		List<Llamadas> mes = new ArrayList<Llamadas>();
		for (int i = 0; i < 30; i++) {
			llamadas = new Llamadas(reclamos.nextInt(10), ventas.nextInt(50));

			mes.add(llamadas);
		}
		mes.forEach(dia -> {
			System.out.println(dia);
		});
	}
}
