package inicio.minecraft;

public interface Ejecutable {

	public default void ejecutar(String objetivo) {
		System.out.println("Ejecutando <arma> en objetivo: " + objetivo);
	}
}
