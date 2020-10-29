package inicio.periodico;

public class NotaEscrita extends Publicacion {

	protected String autor;
	protected String seccion;
	protected String texto;
	protected int cantidadDePalabras;
	protected boolean tieneImagen;

	public NotaEscrita(String autor, String seccion, String texto, int cantidadDePalabras, boolean tieneImagen,
			float ancho, float largo, String ubicacion, String titulo, String copete) {
		super(ancho, largo, ubicacion, titulo, copete);
		this.autor = autor;
		this.seccion = seccion;
		this.texto = texto;
		this.cantidadDePalabras = cantidadDePalabras;
		this.tieneImagen = tieneImagen;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getCantidadDePalabras() {
		return cantidadDePalabras;
	}

	public void setCantidadDePalabras(int cantidadDePalabras) {
		this.cantidadDePalabras = cantidadDePalabras;
	}

	public boolean isTieneImagen() {
		return tieneImagen;
	}

	public void setTieneImagen(boolean tieneImagen) {
		this.tieneImagen = tieneImagen;
	}

	@Override
	public String toString() {
		return "autor: " + this.autor + ", seccion: " + this.seccion;
	}
}
