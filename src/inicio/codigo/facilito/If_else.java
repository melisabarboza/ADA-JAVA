package inicio.codigo.facilito;

public class If_else {

	// Operadores Logicos:
	// > Mayor
	// < Menor
	// >= Mayor o igual)
	// <= Menor o igual
	// == Igual
	// || Or o "o"
	// && And o "y"
	// ! Negado

	public static void main(String[] args) {

		int var = 6;
		int var2 = 10;

		if ((var == 6) && (var2 > 5))
		// las dos condiciones deben ser true para que el bloque sea true, si una es
		// false, todo el bloque es false
		{
			System.out.println("La oprecion es verdadera"); // CODIGO
		} else {
			System.out.println("Tu operacion es falsa"); // CODIGO
		}
	}
}
