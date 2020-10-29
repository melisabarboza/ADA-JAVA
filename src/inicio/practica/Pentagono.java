package inicio.practica;

public class Pentagono extends FigurasGeometricas implements Perimetrable {
	private float lado;

	public Pentagono(float lado) {
		this.lado = lado;
	}

	@Override
	public float obtenerPerimetro() {

		return lado * 5;
	}

}
