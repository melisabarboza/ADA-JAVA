package inicio.practica;

public class Triangulo extends FigurasGeometricas implements Perimetrable {

	private float lado;

	public Triangulo(float lado) {
		this.lado = lado;

	}

	@Override
	public float obtenerPerimetro() {

		return lado * 3;

	}

}
