package collection.inicial;

import java.util.Set;
import java.util.TreeSet;

public class AppComparator {

	public static void main(String[] args) {

		MiComparator miComparator = new MiComparator(); // como voy a comparar los objetos
		Set<String> set = new TreeSet<String>(miComparator);
		set.add("primerSetStr");
		set.add("segundoSetStr");

	}
}
