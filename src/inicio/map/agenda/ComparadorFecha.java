package inicio.map.agenda;

import java.util.Comparator;
import java.util.Date;

public class ComparadorFecha implements Comparator<Date> {

	@Override
	public int compare(Date date1, Date date2) {

		if (date1.after(date2)) {
			return 1;
		} else if (date1.before(date2)) {
			return -1;
		}
		return 0;
	}
}
