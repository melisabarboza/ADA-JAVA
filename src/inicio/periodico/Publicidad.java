package inicio.periodico;

public class Publicidad extends Publicacion {

	private String empresa;
	private boolean tieneImagen;
	protected double precio;
	private final float PRECIO_X_PIXEL = 4;

	public Publicidad(String empresa, boolean tieneImagen, float ancho, float largo, String ubicacion) {
		super(ancho, largo, ubicacion, "PUBLICIDAD", "");
		this.tieneImagen = tieneImagen;
		this.precio = ancho * largo * PRECIO_X_PIXEL;
		this.empresa = empresa;
	}

	public boolean isTieneImagen() {
		return tieneImagen;
	}

	public void setTieneImagen(boolean tieneImagen) {
		this.tieneImagen = tieneImagen;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return "Anunciante: " + empresa + "Ubicacion: " + ubicacion;
	}
}
