package inicio.periodico;

import java.util.Scanner;

// Existen publicaciones que pueden ser notas (escritas o videos) y publicidad.
// El portal puede tener 10 publicaciones online.
// Las publicidades se cobran en funcion del tamaño que ocupan en la pantalla.
// Las notas tiene autor, seccion, etc
// Descubrir las clases y atributos que necesitamos para modelar nuestro sistema
// Conocer el total facturado en la publicacion del portal.

public class AppPeriodico {
	private static final int TOTAL_PUBLIC = 10;
	private static int i;

	public static void main(String[] args) {

		Object[] portal = new Object[TOTAL_PUBLIC];

 for ( i = 0; i < TOTAL_PUBLIC; i ++)	{
		int opcion = solicitarOpcion();
		switch (opcion) {
		case 1: //Nota
			NotaEscrita  notaE = new NotaEscrita();
			NotaVideo = notaV = new NotaVIdeo();
			portal[i] = notaE;
			portal[i] = notaV;
					break;
		case 2: //Publicidad
			Publicidad pub = new Publicidad();
			portal[i] = pub;
			break;
			default:
				break;
		}		
		}
 double total = 0;
 //recorre el array  para obtener el total
 
 for ( i = 0; i < 10; i ++)	
	 
	 
	 if (portal[i] instanceOf Publicidad)
		 // casting
		 Publicidad aux = (Publicidad)portal[i];
		total += aux.getPrecio(); 
				 
				 
				 while (tipo != 0) {
			if (tipo == 1) {
				System.out.println("Usted ha elegido Nota como tipo de publicacion");
				int subTipo = solicitarTipo("Nota que desea publicar: 1. Nota Escrita: 2. Nota en Video ");
				if (subTipo == 1) {
					NotaEscrita nuevaNotaEscrita;
					nuevaNotaEscrita = new NotaEscrita();
				} else if (subTipo == 2) {

				} else {
					System.out.println("Valor ingresado incorrecto");
				}
			} else if (tipo == 2) {
				System.out.println("Usted ha elegido Publicidad como tipo de publicacion");
			} else {
				System.out.println("Valor ingresado incorrecto");
			}
			tipo = solicitarTipo("Publicacion: 1. Nota, 2. Publicidad, 0. Salir ");
		}

	}

	private static int solicitarOpcion(mensaje) {
		System.out.println("Elija el tipo de: " + mensaje);
		Scanner sc = new Scanner(System.in);

		return sc.nextInt();
	}

}
