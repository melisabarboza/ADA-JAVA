package inicio.resumenbancario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

//El resumen bancario del cliente tiene los ultimos 5 movimientos de su cuenta.
//Los movimientos tienen fecha, importe y pueden ser retiros o depositos
//Se pide ingresar los movimientos y luego listarlos ordenados de menor a mayor
//entre las fechas dadas o bien todos los movimientos

public class AppResumenBancario {

	private static int operacion;
	private static float importe;
	private static String fecha;

	public static void main(String[] args) throws ParseException {

		MovimientoBancario[] movimientos = new MovimientoBancario[5];
		ArrayList<MovimientoBancario> listaDeMovimientos = new ArrayList<MovimientoBancario>();
		SimpleDateFormat simpleDate = new SimpleDateFormat("dd/MM/yyyy");

		for (int i = 0; i < 4; i++) {
			System.out.println("Ingrese operacion: 1. Retiro, 2. Deposito");
			Scanner sc = new Scanner(System.in);
			operacion = sc.nextInt();
			System.out.println("Ingrese importe: $ ");
			importe = sc.nextFloat();
			System.out.println("Ingrese Fecha: Ej - (Dia(01)/Mes(01)/Año(2020)");
			fecha = sc.next();
			// Date fechaParseada = simpleDate.parse(fecha);
			MovimientoBancario mov = new MovimientoBancario(operacion, importe, fecha);
			movimientos[i] = mov;
			listaDeMovimientos.add(mov);
		}
		listaDeMovimientos.sort(null);
		// luego listarlos ordenados de menor a mayor
		for (int i = 0; i < 4; i++) {
			System.out.println(movimientos[i].toString());
		}
		//

	}

}
