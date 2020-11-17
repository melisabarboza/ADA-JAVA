package inicio.generics;

import java.util.Map;
import java.util.TreeMap;

public class AppPalabras {
	// Buscar en internet un texto (parrafo)
	// Investigar metod split en String (java api String en google)
	// metodo split de String separa un string en un array de string dado un
	// caracter
	// Guardamos en una variable el texto seleccionado, lo separamos mediante el
	// metod split
	// en un array de palabras
	// Generar un mapa que contenga la palabra y la cantidad de veces que se repitio
	// esa palabra
	// en el texto

	// Opcional: obtener la palabra de mayor repeticion
	public static void main(String[] args) {

		String texto = "The array returned by this method contains each substring of this string that is terminated by another substring that matches the given expression or is terminated by the end of the string. The substrings in the array are in the order in which they occur in this string. If the expression does not match any part of the input then the resulting array has just one element, namely this string. The limit parameter controls the number of times the pattern is applied and therefore affects the length of the resulting array. If the limit n is greater than zero then the pattern will be applied at most n - 1 times, the array's length will be no greater than n, and the array's last entry will contain all input beyond the last matched delimiter. If n is non-positive then the pattern will be applied as many times as possible and the array can have any length. If n is zero then the pattern will be applied as many times as possible, the array can have any length, and trailing empty strings will be discarded.";

		String[] arrSpliteado = texto.split(" ");
		texto = texto.replaceAll(",", " ");
		texto = texto.replaceAll(".", " ");

		AlfabetoDescendente alfabeticaDesc = new AlfabetoDescendente();
		Map<String, Integer> map = new TreeMap<String, Integer>(alfabeticaDesc);

		for (int i = 0; i < arrSpliteado.length; i++) {
			String palabra = arrSpliteado[i];
			Boolean contieneLaPalabra = map.containsKey(palabra);
			if (contieneLaPalabra) {
				Integer cantidadDeAparicionesDeLaPalabra = map.get(palabra);
				cantidadDeAparicionesDeLaPalabra++;
				map.put(palabra, cantidadDeAparicionesDeLaPalabra);
			} else {
				map.put(palabra, 1);
			}
		}
		for (String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
	}
}
