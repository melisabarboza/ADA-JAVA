package inicio.generics;

import java.util.Comparator;

public class AlfabetoDescendente implements Comparator<String> {

	public int compare(String word1, String word2) {

		return word2.toLowerCase().compareTo(word1.toLowerCase());
	}
}
