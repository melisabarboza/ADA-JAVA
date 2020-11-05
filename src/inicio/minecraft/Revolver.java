package inicio.minecraft;

public class Revolver implements Recargable, Ejecutable {

	int cantidadMaximaMunicion;
	int cantidadActualMunicion;

	public Revolver() {
		cantidadMaximaMunicion = 6;
		cantidadMaximaMunicion = 6;
	}

	@Override
	public void Disparar() {
		if (cantidadActualMunicion > 0) {
			cantidadActualMunicion--;
		}
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
