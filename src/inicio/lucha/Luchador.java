package inicio.lucha;

public class Luchador {

	private int vida;
	private String nombre;
	private String genero;
	private String raza;
	private int dañoGenerado;

	public Luchador(String nombreRecibido, int cantidadDeVida, String genero, String raza, int dañoGenerado) {
		vida = cantidadDeVida;
		this.nombre = nombreRecibido;
		this.genero = genero;
		this.raza = raza;
		this.dañoGenerado = dañoGenerado;
	}

	public int getDañoGenerado() {
		System.out.println("el daño generado de " + nombre + " es " + this.dañoGenerado);
		return dañoGenerado;
	}

	public String getGenero() {
		System.out.println("el genero de " + nombre + " es " + this.genero);
		return genero;
	}

	public String getRaza() {
		System.out.println("la raza de " + nombre + " es " + this.raza);
		return raza;
	}

	public int getVida() {
		System.out.println("vida: " + vida);
		return vida;
	}

	public String getNombre() {
		System.out.println("nombre: " + nombre);
		return nombre;
	}

	public void recibirGolpe(int dañoRecibido) {
		vida = vida - dañoRecibido;
		System.out.println("la vida restante de " + nombre + " es: " + this.vida);

		if (vida <= 0)
			System.out.println("el luchador: " + nombre + " se muriò");
	}

	public void atacarA(Luchador otroLuchador) {

	}

}
