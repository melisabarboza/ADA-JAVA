package collection.inicial.callCenter;

public class Llamadas {

	private int ventas;
	private int reclamos;

	public Llamadas(int ventas, int reclamos) {
		this.ventas = ventas;
		this.reclamos = reclamos;
	}

	public int getVentas() {
		return ventas;
	}

	public void setVentas(int ventas) {
		this.ventas = ventas;
	}

	public int getReclamos() {
		return reclamos;
	}

	public void setReclamos(int reclamos) {
		this.reclamos = reclamos;
	}

	public String toString() {
		return "Ventas: " + ventas + " - Reclamos: " + reclamos;
	}
}
