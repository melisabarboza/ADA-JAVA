package inicio.resumenbancario;

public class MovimientoBancario {

	private int operacion;
	private float importe;
	private String fecha;

	public MovimientoBancario(int operacionRecibida, float importeRecibido, String fecha) {
		operacion = operacionRecibida;
		this.importe = importeRecibido;
		this.fecha = fecha;
	}

	public int getOperacion() {
		return operacion;
	}

	public float getImporte() {
		return importe;
	}

	public String getFecha() {
		return fecha;
	}

	public String toString() {
		String resultado = "";
		if (operacion == 1)
			resultado = resultado + "Operacion: Retiro ";
		else
			resultado += "Operacion: Deposito ";
		resultado += "Importe: " + Float.toString(this.importe);
		resultado += " fecha: " + fecha;
		return resultado;
	}

}
