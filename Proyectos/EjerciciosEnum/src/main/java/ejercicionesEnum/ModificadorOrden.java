package ejercicionesEnum;

import java.util.Comparator;

public class ModificadorOrden implements Comparator<Planeta> {

	@Override
	public int compare(Planeta o1, Planeta o2) {
		if(o1.getDistanciaSol() < o2.getDistanciaSol()) {
			return -1;
		} else if(o1.getDistanciaSol() > o2.getDistanciaSol()) {
			return 1;
		} else {
			return 0;
		}
	}

}
