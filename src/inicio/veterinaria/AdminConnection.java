package inicio.veterinaria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AdminConnection {

	public static Connection obtenerConexion() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/veterinaria", "root", "");
	}

}