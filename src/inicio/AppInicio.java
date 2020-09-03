// comentario de una linea
/**
 * este comentario tiene varias lineas
 * 
 * 
 */

package inicio;

import calculadora.Bicicleta;
import calculadora.Calculadora;
import inicio.clase1.Usuario;

public class AppInicio {

// metodo publico de nombre main con parametros.

	public static void main(String[] args) { // firma del metodo

		// declaro variable una sola vez (la primera)
		// tipo de dato + nombre

		Usuario user1 = null; // el valor que contiene aqui es null
		System.out.println(user1);

		// asigno un nuevo objeto Usuario a la variable
		user1 = new Usuario(); // la variable deja de ser null

		user1.test();

		Calculadora cal = new Calculadora();
		int resultado;
		resultado = cal.sumar(2, 3);

		Bicicleta bici = new Bicicleta();
		bici.acelerar(10);

	}

}
