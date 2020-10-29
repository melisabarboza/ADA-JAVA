package inicio.bicicleta;

//comentario de una linea

/**
 * este comentario tiene varias lineas
 * 
 * 
 */
public class AppInicio {
// metodo publico de nombre main con parametros.

	public static void main(String[] args) { // firma del metodo
		// Calculadora cal = new Calculadora();
		// int resultado;
		// resultado = cal.sumar(2, 3);

		Bicicleta bici = new Bicicleta();
		Bicicleta bici2 = new Bicicleta();
		System.out.println("Velocidad actual : " + bici.getVelocidad());
		bici.acelerar(10);
		System.out.println("Velocidad actual : " + bici.getVelocidad());
		bici.frenar(20);
		System.out.println("Velocidad actual : " + bici.getVelocidad());
		bici.frenar(3);
		System.out.println("Velocidad actual : " + bici.getVelocidad());
		bici.detener();
		System.out.println("Velocidad actual : " + bici.getVelocidad());
		bici.frenar(4);
		System.out.println("Velocidad actual : " + bici.getVelocidad());
		bici.detener();
		System.out.println("Velocidad actual : " + bici.getVelocidad());
		bici.setVelocidad(1);
		System.out.println("Velocidad actual : " + bici.getVelocidad());
	}

}
