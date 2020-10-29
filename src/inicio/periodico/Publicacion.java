package inicio.periodico;

public abstract class Publicacion {
	private float ancho;
	private float largo;
	protected String ubicacion;
	protected String titulo;
	private String copete;

	public Publicacion(float ancho, float largo, String ubicacion, String titulo, String copete) {
		this.ancho = ancho;
		this.largo = largo;
		this.ubicacion = ubicacion;
		this.copete = copete;
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCopete() {
		return copete;
	}

	public void setCopete(String copete) {
		this.copete = copete;
	}

	public float getAncho() {
		return ancho;
	}

	public void setAncho(float ancho) {
		this.ancho = ancho;
	}

	public float getLargo() {
		return largo;
	}

	public void setLargo(float largo) {
		this.largo = largo;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

}