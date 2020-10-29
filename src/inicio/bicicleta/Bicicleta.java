/*
 *Generar una clase Bicicleta con un atributo velocidad y un metodo acelerar con parametro
 *nuevaVelocidad que sea asignado al atributo velocidad 
 * 
 * 
 */
package inicio.bicicleta;

public class Bicicleta {

	private int velocidad;
	private String color;

	/**
	 * Suma el valor dado a la velocidad actual y devuelve la nueva velocidad
	 * 
	 * @param aceleracion
	 * @return
	 */
	public int acelerar(int aceleracion) {
		velocidad = velocidad + aceleracion;
		return velocidad;
	}

	/**
	 * Disminuye la velocidad en el valor dado siempre que ese valor no sea mayor a
	 * la velocidad actual. Devuelve la velocidad actualizada
	 * 
	 * @param menosVelocidad
	 * @return
	 */
	public int frenar(int menosVelocidad) {
		if (velocidad - menosVelocidad >= 0) {
			velocidad = velocidad - menosVelocidad;
		} else {
			System.out.println("La velocidad actual no permite frenar con " + menosVelocidad);
		}
		return velocidad;
	}

	/**
	 * Pone la velocidad cero siempre que la velocidad actual sea menor a 5
	 */
	public void detener() {
		if (velocidad < 5) {
			this.velocidad = 0;
		} else {
			System.out.println("No se puede frenar a esa velocidad");
		}
	}

	// Getters y setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
}
