package inicio.exception.bus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// Es una aplicación de venta de pasajes en bus
// Tenemos por cada bus una capacidad de 5 asientos.
// Solicitar la venta de pasajes con los siguientes campos:
// DNI del pasajero, cantidad de pasajes que solicita
// Existe un solo viaje por dia y las ventas son para ese dia
// En caso que no tenga mas asientos disponibles, informe al usuario,
// lance una excepcion y ademas que le intente reservar el siguiente dia
// (Solo mostrar el mensaje de buscar en el siguiente dia)

// Agregar una agenda por dia para todos los buses entendiendo que hay una salida por dia

public class AppBus {

	private static final String PATRON_FECHA = "yyyyMMdd";
	public static int TOTAL_ASIENTOS = 50;

	public static void main(String[] args) {
		System.out.println("SISTEMA DE PASAJES");
		System.out.println();

		Map<Date, List<Pasaje>> agenda = new HashMap<Date, List<Pasaje>>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su DNI: (0=terminar)");

		int dni = sc.nextInt();
		while (dni != 0) {
			System.out.println("Ingrese fecha:");
			String fecha = sc.next();
			System.out.println("Ingrese cantidad de pasajes:");
			int cantidad = sc.nextInt();
			try {
				venderPasaje(dni, cantidad, fecha, agenda);
			} catch (ReservaNoRealizadaException e) {

				System.out.println(e.getMessage());
				System.out.println("Se generará una reserva para el dia de mañana.");

			} catch (ParseException e) {
				System.out.println("Ingeso una fecha incorrecta o invalida");
			}

			System.out.println("Ingrese su DNI: (0=terminar)");
			dni = sc.nextInt();
		}
	}

	private static void venderPasaje(int dni, int cantidad, String fecha, Map<Date, List<Pasaje>> agenda)
			throws ReservaNoRealizadaException, ParseException {
		SimpleDateFormat formatDate = new SimpleDateFormat(PATRON_FECHA);
		Date fechaMap = formatDate.parse(fecha);

		List<Pasaje> bus = agenda.get(fechaMap) == null ? new ArrayList<Pasaje>() : agenda.get(fechaMap);

		// validacion si es posible vender el pasaje
		if (bus.size() + cantidad > TOTAL_ASIENTOS) {
			throw new ReservaNoRealizadaException(
					String.format("Solo se dispone de %s asientos", TOTAL_ASIENTOS - bus.size()));
		} else {
			// es posible -> generar objetos para completar la cantidad de reservas en el
			// bus

			for (int i = 0; i < cantidad; i++) {
				bus.add(new Pasaje(dni));
			}
			agenda.put(fechaMap, bus);
			System.out.println("-----> Reserva Confirmada !!!");

		}

	}

}
