package basico;

/* VISIBILIDAD DE ATRIBUTOS/CLASES/FUNCIONES 
public  => PUEDE SER ACCEDIDA POR CUALQUIER QUE TENGA ACCESO A LA CLASE
private => SOLO PUEDEN SER USADOS DENTRO DE LA DEFINICION DE LA CLASE
*/

//el static se utiliza para definir métodos o atributos de clase. 
//No dependen ni requieren de una instancia
//public static 
//private static 

public class Persona {

	private static int cantidadPersonasCreadas = 0;

	public static int cantidadPersonasCreadas() {
		return cantidadPersonasCreadas;
	}

	public static void imprimirPersona(Persona p) {
		System.out.println("dni: " + p.getDni() + ",");
		System.out.println("nombre: " + p.getNombre() + ",");
		System.out.println("edad: " + p.getEdad() + ",");
		System.out.println("altura: " + p.getAltura() + ",");
		System.out.println("peso: " + p.getPeso() + ",");
	}

	// constructores ( permiten crear instancias de la clase definida de la forma
	// new Persona(....)
	public Persona() {
		// constructor sin parametros /o constructor por defecto
	}

	public Persona(int dni, String nombre, int edad, float altura, float peso) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
		this.colorOjos = "marrones";
		// lo siguiente es igual a hacer Persona.cantidadPersonasCreadas++;
		Persona.cantidadPersonasCreadas = Persona.cantidadPersonasCreadas + 1;
	}

	// atributos (atributos / propiedades de la Persona)
	private float altura;
	private float peso;
	private String nombre;
	private int edad;
	private int dni;
	public String colorOjos;

	// funciones (cosas que puede hacer una persona)
	// una persona puede y sabe decir su edad
	public int getEdad() {
		return this.edad;
	}

	public float getPeso() {
		return this.peso;
	}

	public float getAltura() {
		return this.altura;
	}

	public int getDni() {
		return this.dni;
	}

	public String getNombre() {
		return this.nombre;
	}
}
