package ejercicios;
/**Se venden boletos de una funcion numerados del 0-49. Cada uno de esos boletos
//se corresponde con un asiento
//Solicitar que asiento elige la persona al  comprarlo y marcarlo con un valor 1
//hasta que se ingrese asiento numero 99
//Listar los asientos vendidos





	
	
	
	
	Mientras solicitud_asiento <> 99
		
		Mostrar " Asiento " [solicitud_asiento] " = " Asiento[solicitud_asiento]
		Si Asiento[solicitud_asiento] == 0 Entonces
			Asiento[solicitud_asiento] = 1
			Mostrar " Venta confirmada "
		SiNo
			Mostrar " Asiento ya vendido, seleccione otra ubicacion "
			
		FinSi
		
		Mostrar " Ingrese numero de asiento "
		leer solicitud_asiento
		
	FinMientras
		
		Definir contador Como Entero
		contador = 0
		Mostrar " Asientos vendidos: "
		
		Para i<-0 hasta 50-1 Con Paso 1 Hacer
			
			Si Asiento[i] == 1 Entonces
				mostrar " Asiento : " i
				contador = contador + 1
			FinSi
			
		FinPara
		
	*/FinAlgoritmo
	
public class EjercicioBoletosTeatro {

	public static void main(String[] args) {
		mostrarTitulo();
Scanner sc = new Scanner(System.in);

System.out.println ("Ingrese el numero de asiento ");

int numeroDeAsiento = sc.nextInt();

	

int vectorAsiento[] = new int[totalAsientos];
int acumulador = 0;
int i = 0;
// Para i<-0 hasta 49 Con Paso 1 Hacer  	
for (; i < vectorAsiento.length; i++) {
	
	
}


	}

	private static void mostrarTitulo() {
		
		System.out.println("Bienvenido a venta de boletos online");
		
		System.out.println("=====================================");
		
	}

}
