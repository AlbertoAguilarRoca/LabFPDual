import java.util.TreeSet;

public class Prueba {

	public static void main(String[] args) {
	
		TreeSet<Integer> numeros = new TreeSet<Integer>(new ModifyComparator());
		
		numeros.add(18);
		numeros.add(50);
		numeros.add(152);
		numeros.add(541);
		numeros.add(329);
		numeros.add(102);
		numeros.add(37);
		numeros.add(numeros.hashCode());
		
		
		
		for(int numero: numeros) {
			System.out.println(numero);
		}

		System.out.println(numeros.hashCode());

	}

}
