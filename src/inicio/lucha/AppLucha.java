package inicio.lucha;

public class AppLucha {

	// tenemos luchados

	public static void main(String[] args) {

		// creo un mago y un guerrero
		Luchador l1 = new Mago("Alan", 100, "Masculino");
		Luchador l2 = new Guerrero("Sol", 150, "Femenino", "humana");

		// hago que el mago ataque al guerrero. Para esto le pido al mago que me diga el
		// da�o que genera y le hago recibir al guerrero ese da�o como un golpe
		int da�oQueHaceElMago = l1.getDa�oGenerado();
		l2.recibirGolpe(da�oQueHaceElMago);

		// hago que el guerrero ataque al mago
		int da�oQueHaceSol = l2.getDa�oGenerado();
		l1.recibirGolpe(da�oQueHaceSol);

	}

}
