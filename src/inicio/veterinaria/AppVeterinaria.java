package inicio.veterinaria;

import java.sql.SQLException;
import java.util.Scanner;

// armar un menu
public class AppVeterinaria {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Boolean cerrarPrograma = false;

		System.out.println("Bienvenido a Perritos Milu");
		System.out.println();

		while (!cerrarPrograma) {
			System.out.println("Ingrese la opcion deseada: ");
			System.out.println("1. Ingresar  a su cuenta _ 2. Compra de productos_ 3. Solicitar turno_ 0. Salir_  ");
			int opcionSeleccionada = sc.nextInt();

			switch (opcionSeleccionada) {
			case 0:
				System.out.println("Gracias por su visita a Veterinarias Perritos");
				cerrarPrograma = true;
				break;
			case 1:
				try {
					PantallaUsuario.DesplegarOpciones();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				PantallaProductos.Bienvenida();
				break;
			case 3:
				System.out.println("Seleccione motivo de visita:");
				System.out.println("castraciones, vacunacion, consulta");
				break;
			}
		}
	}
}
