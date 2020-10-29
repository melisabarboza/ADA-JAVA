package inicio.practica;

public class Cuadrado extends FigurasGeometricas implements Perimetrable {

	private float lado;

	public Cuadrado(float lado) {
		this.lado = lado;

	}

	@Override
	public float obtenerPerimetro() {
		return lado * 4;
	}

}
