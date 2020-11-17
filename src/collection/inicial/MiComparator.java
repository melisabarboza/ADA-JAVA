package collection.inicial;

import java.util.Comparator;

public class MiComparator implements Comparator<String> {

	@Override
	public int compare(String arg0, String arg1) {
		// objeto 1 = 1
		// objeto 2 = 2

		// 1 - 2 = - 1 negativo
		// 1 - 1 = 0
		// 2 - 1 = 1 positivo

		return arg0.compareTo(arg1);
	}
}
