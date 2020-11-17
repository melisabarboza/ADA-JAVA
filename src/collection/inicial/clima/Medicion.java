package collection.inicial.clima;

public class Medicion {

	private int temperaturas;
	private int lluvias;

	public Medicion(int temperaturas, int lluvias) {
		this.temperaturas = temperaturas;
		this.lluvias = lluvias;
	}

	public int getTemperaturas() {
		return temperaturas;
	}

	public void setTemperaturas(int temperaturas) {
		this.temperaturas = temperaturas;
	}

	public int getLluvias() {
		return lluvias;
	}

	public void setLluvias(int lluvias) {
		this.lluvias = lluvias;
	}

	public String toString() {
		return "Lluvia: " + lluvias + " - Temp: " + temperaturas;
	}
}
