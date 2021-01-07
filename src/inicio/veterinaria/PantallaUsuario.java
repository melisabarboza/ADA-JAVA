package inicio.veterinaria;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PantallaUsuario {

	// atributos de clase
	private static Scanner sc = new Scanner(System.in);

	// metodos de clase
	private static void Bienvenida() {
		System.out.println("Bienvenido a la pantalla de ususuarios");
		System.out.println();

	}

	public static void DesplegarOpciones() throws ClassNotFoundException, SQLException {

		System.out.println("Seleccione la opcion deseada:  1. Registrarse_ 2. Ingresar a mi cuenta");
		int eleccion = sc.nextInt();
		Connection con = AdminConnection.obtenerConexion();
		Statement stmt = con.createStatement();

		if (eleccion == 1) {// en caso de fallar, que reintente hasta 3 veces
			for (int i = 0; i < 3; i++) {
				System.out.println("Ingrese un nombre de usuario o email: ");
				String nuevoUsuario = sc.next();
				System.out.println("Ingrese una contraseña: ");
				String contraseña = sc.next();
				System.out.println("Ingrese nuevamente contraseña: ");
				String contraseñaConfirmada = sc.next();
				if (contraseña.equals(contraseñaConfirmada)) {
					stmt.executeUpdate("INSERT INTO  usuarios (usuario, contraseña ) VALUES (' " + nuevoUsuario + " ', "
							+ contraseña + " )");
					System.out.println("Usuario registrado con éxito! ");
					break;
				} else {
					System.out.println("Los datos ingresados son incorrectos, por favor ingrese nuevamente los datos ");
				}
			}

		} else if (eleccion == 2) {
			ingresoUsuarios(con);
		}
		con.close();
	}

	private static void ingresoUsuarios(Connection con) throws SQLException {
		Statement stmt = con.createStatement();

		System.out.println("Ingrese su nombre de usuario o email: ");
		String usuarioRegistrado = sc.next();
		stmt.executeUpdate("INSERT INTO veterinaria (usuario) VALUES (' " + usuarioRegistrado + " ')");
		System.out.println("Ingrese su contraseña: ");
		String contraseñaRegistrada = sc.next();
		stmt.executeUpdate("INSERT INTO veterinaria (contraseña) VALUES (' " + contraseñaRegistrada + " ')");
		System.out.println("Ingreso correcto! ");
		System.out.println("Ya podes navegar dentro de tu cuenta");

	}
}
