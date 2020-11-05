package inicio.minecraft;

public class Arco implements Recargable, Ejecutable {

	public Arco() {
		cantidadMaximaMunicion = 1;
		cantidadMaximaMunicion = 1;
	}

	int cantidadMaximaMunicion;
	int cantidadActualMunicion;

	@Override
	public void Disparar() {
		if (cantidadActualMunicion > 0)
			cantidadActualMunicion--;
	}

	@Override
	public void Recargar(int cantidad) {
		if (cantidadActualMunicion == cantidadMaximaMunicion) {
			// no hago nada
		} else {
			if (cantidadActualMunicion + cantidad > cantidadMaximaMunicion) {
				cantidadActualMunicion = cantidadMaximaMunicion;
			} else {
				cantidadActualMunicion += cantidad;
			}
		}
	}

}
