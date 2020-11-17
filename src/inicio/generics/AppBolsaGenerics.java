package inicio.generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AppBolsaGenerics {

	public static void main(String[] args) {
		Bolsa<String> bolsa = new Bolsa<String>(2);
		Bolsa<Integer> bolsaInt = new Bolsa<Integer>(2);

		bolsa.add("palabra");

		bolsaInt.add(new Integer(23));

		Map<String, String> capitales = new HashMap<String, String>();
		capitales.put("Argentina, ", "Buenos Aires");
		capitales.put("Chile ", "Santiago de Chile");
		capitales.put("Bolivia ", "La Paz");
		System.out.println(capitales.size());

		System.out.println(capitales.get("Chile"));
		System.out.println(capitales.get("Uruguay"));

		Set<String> claves = capitales.keySet();
		Iterator<String> iterador = claves.iterator();
		String clave;
		String valor;
		while (iterador.hasNext()) {
			clave = iterador.next();
			valor = capitales.get(clave);
			System.out.println(clave + ": " + valor);

		}
	}
}
