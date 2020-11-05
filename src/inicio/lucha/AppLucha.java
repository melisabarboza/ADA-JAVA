package inicio.lucha;

public class AppLucha {

	// tenemos luchados

	public static void main(String[] args) {

		// creo un mago y un guerrero
		Luchador l1 = new Mago("Alan", 100, "Masculino");
		Luchador l2 = new Guerrero("Sol", 150, "Femenino", "humana");

		// hago que el mago ataque al guerrero. Para esto le pido al mago que me diga el
		// daño que genera y le hago recibir al guerrero ese daño como un golpe
		int dañoQueHaceElMago = l1.getDañoGenerado();
		l2.recibirGolpe(dañoQueHaceElMago);

		// hago que el guerrero ataque al mago
		int dañoQueHaceSol = l2.getDañoGenerado();
		l1.recibirGolpe(dañoQueHaceSol);

	}

}
