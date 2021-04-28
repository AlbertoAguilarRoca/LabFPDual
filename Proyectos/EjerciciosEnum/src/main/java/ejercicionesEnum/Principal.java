package ejercicionesEnum;

import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) {

		TreeSet<Planeta> planetas = new TreeSet<Planeta>(new ModificadorOrden());

		planetas.add(Planeta.MERCURIO);
		planetas.add(Planeta.VENUS);
		planetas.add(Planeta.TIERRA);
		planetas.add(Planeta.MARTE);
		planetas.add(Planeta.JUPITER);
		planetas.add(Planeta.SATURNO);
		planetas.add(Planeta.URANO);
		planetas.add(Planeta.NEPTUNO);
		

		/* Listar planetas que orbitan dentro del anillo */

		System.out.println("Los planetas que orbitan dentro del anillo de asteroides son:\n");

		for (Planeta cuerpo : planetas) {
			if (cuerpo.isOrbitaAsteroides()) {
				System.out.println(cuerpo);
			}
		}

		System.out.println("\n----------\n");

		/* Listar los planetas que poseen atmósfera */

		System.out.println("Los planetas que tienen atmósfera son:\n");

		for (Planeta cuerpo : planetas) {
			if (cuerpo.isTieneAtmosfera()) {
				System.out.println(cuerpo);
			}
		}

		System.out.println("\n----------\n");

		System.out.println("Los planetas con condiciones similares a la tierra son son:\n");

		for (Planeta cuerpo : planetas) {
			if(!cuerpo.equals(cuerpo.TIERRA)) {
				if (cuerpo.isOrbitaAsteroides() && cuerpo.isTieneAtmosfera()) {
					System.out.println(cuerpo);
				}
			}
		}

		System.out.println("\n----------\n");
		
		/*El planeta más cercano al sol
		 * He modificado la forma en la que se ordena para que se haga
		 * en base a la cercania al sol*/
		
		System.out.println("El planeta más cercano al sol es: "+
		planetas.first());
		
	}// end main

}// end class
