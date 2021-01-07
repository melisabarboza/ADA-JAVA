package inicio.naipes;

public class Naipe {

	private Palo palo;
	private NumeroCarta valor;
	private String nombre;

	public Naipe(NumeroCarta valor, Palo palo) {
		this.valor = valor;
		this.palo = palo;
	}

	public Palo getPalo() {
		return palo;
	}

	public void setPalo(Palo palo) {
		this.palo = palo;
	}

	public NumeroCarta getNumeroCarta() {
		return valor;
	}

	public void setNumeroCarta(NumeroCarta valor) {
		this.valor = valor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String toString() {
		return valor + " (" + palo + ")";
	}
}
