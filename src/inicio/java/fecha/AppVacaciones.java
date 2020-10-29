package inicio.java.fecha;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

// Cargar la fecha de inicio de vacaciones de un grupo de empleados
// (grupo de 5 empleados)
// informar cual de ellos se ira primero de vacaciones

public class AppVacaciones {

	private static final int TOT_EMPL = 4;

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		Date[] vacaciones = new Date[TOT_EMPL];

		SimpleDateFormat simpleDate = new SimpleDateFormat("ddMMyyyy");

		Date min = null;
		int pos = 0;

		for (int i = 0; i < TOT_EMPL; i++) {
			System.out.println("Ingrese fecha de comienzo de vacaciones (Dia-Mes-Año)");
			String inicio = sc.next();
			vacaciones[i] = simpleDate.parse(inicio);

			if (min == null || min.after(vacaciones[i])) {
				min = vacaciones[i];
				pos = i;
			}
		}
		System.out.println("La persona que sale primero de vacaciones es: " + pos);
	}

	private boolean esMayorDeEdad(Date fechaNacimiento) {

		Calendar hoy = Calendar.getInstance();
		hoy.add(Calendar.YEAR, -18);
		return fechaNacimiento.before(hoy.getTime());

//        ------------x---- |-----x----------------------- |
//        >18 años         2002        <18 años           2020
	}

}
