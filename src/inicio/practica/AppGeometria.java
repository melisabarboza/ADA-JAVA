package inicio.practica;

import java.util.Scanner;

public class AppGeometria {

	public static void main(String[] args) {
		System.out.println("Ingrese longitud de los lados del " + Triangulo.class.getSimpleName());
		Scanner sc = new Scanner(System.in);
		float longitud = sc.nextFloat();
		Triangulo miTriangulo = new Triangulo(longitud);
		float perimetro = miTriangulo.obtenerPerimetro();
		System.out.println("el pèrimetro es: " + perimetro);

		System.out.println("Ingrese longitud de los lados del " + Circulo.class.getSimpleName());
		longitud = sc.nextFloat();
		Circulo miCirculo = new Circulo();
		float perimetro1 = miCirculo.obtenerPerimetro();
		System.out.println("el pèrimetro es: " + perimetro1);

		System.out.println("Ingrese longitud de los lados del " + Cuadrado.class.getSimpleName());
		longitud = sc.nextFloat();
		Cuadrado miCuadrado = new Cuadrado(longitud);
		float perimetro2 = miCuadrado.obtenerPerimetro();
		System.out.println("el pèrimetro es: " + perimetro2);

		System.out.println("Ingrese longitud de los lados del " + Pentagono.class.getSimpleName());
		longitud = sc.nextFloat();
		Pentagono miPentagono = new Pentagono(longitud);
		float perimetro3 = miPentagono.obtenerPerimetro();
		System.out.println("el pèrimetro es: " + perimetro3);

	}
}
