package basico;

public class CreadorDePersonas {

	public static void main(String[] args) {
		System.out.println("cantidad de personas creadas " +Persona.cantidadPersonasCreadas());
		//int dni, String nombre,int edad,float altura, float peso
		Persona sol = new Persona(37866903,"melisa barboza", 26, 1.60f, 50f);
		Persona.imprimirPersona(sol);
		System.out.println("cantidad de personas creadas " +Persona.cantidadPersonasCreadas());
		Persona alan = new Persona(35351791,"alan castro", 30, 1.74f, 72f);
		Persona.imprimirPersona(alan);
		System.out.println("cantidad de personas creadas " +Persona.cantidadPersonasCreadas());
		
	}

}
