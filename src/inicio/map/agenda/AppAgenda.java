package inicio.map.agenda;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//Se desea registrar una agenda con actividades por dia
//Las actividades se ingresan por teclado (titulo de la actividad y la fecha)
//Una fecha puede tener varias actividades
//Al terminar el ingreso de actividades, mostrar las actividades por fecha

public class AppAgenda {

	private static final String PATRON_FECHA = "yyyyMMdd";

	public static void main(String[] args) throws ParseException {

		ComparadorFecha comparadorFecha = new ComparadorFecha();
		Map<Date, List<String>> agenda = new TreeMap<Date, List<String>>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Agenda");
		System.out.println();
		SimpleDateFormat simpleDate = new SimpleDateFormat(PATRON_FECHA);

		System.out.println("Ingrese fecha de actividad (" + PATRON_FECHA + ". 0 para terminar) ");
		String fecha = sc.nextLine();
		String actividad;
		Date fechaDate;

		while (!fecha.contentEquals("0")) {

			System.out.println("Ingrese nombre/titulo de actividad: ");
			actividad = sc.nextLine();
			fechaDate = simpleDate.parse(fecha);
			List<String> actividades = agenda.get(fechaDate);

			if (actividades == null) {

				System.out.println("Dia sin actividades");
				actividades = new ArrayList<String>();
			}

			actividades.add(actividad);

			agenda.put(fechaDate, actividades);
			System.out.println("Actividad agregada!");
			System.out.println();
			System.out.println("Ingrese fecha de actividad (" + PATRON_FECHA + ". 0 para terminar ) ");
			fecha = sc.nextLine();
		}
		agenda.forEach((fechaAgenda, listaActividades) -> {
			System.out.println(simpleDate.format(fechaAgenda) + " : ");
			Collections.sort(listaActividades);

			for (String item : listaActividades) {
				System.out.println(item);
			}
		});
	}
}
