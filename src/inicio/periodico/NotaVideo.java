package inicio.periodico;

public class NotaVideo extends NotaEscrita {
	private int duracion;
	private int resolucion;

	public NotaVideo(int duracion, int resolucion, String autor, String seccion, String texto, int cantidadDePalabras,
			boolean tieneImagen, float ancho, float largo, String ubicacion, String titulo, String copete) {

		super(autor, seccion, texto, cantidadDePalabras, tieneImagen, ancho, largo, ubicacion, titulo, copete);
		this.duracion = duracion;
		this.resolucion = resolucion;

	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	@Override
	public String toString() {
		return "Duracion: " + duracion + "Resolucion: " + resolucion + "Ubicacion: " + ubicacion + "Titulo: " + titulo
				+ "Texto; " + cantidadDePalabras;
	}

}
