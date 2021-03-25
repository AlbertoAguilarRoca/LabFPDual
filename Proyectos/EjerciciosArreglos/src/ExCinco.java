import java.util.ArrayList;

public class ExCinco {

	public static void main(String[] args) {

		ArrayList<String> cadenas = new ArrayList<String>();
		String[] array = { "7", "q", "p", "S2", "v4", "hola", "Ven3no" };

		for (String indices : array) {
			cadenas.add(indices);
		}

		for (String indices : coleccionaNumerosLista(cadenas)) {
			System.out.println(indices);
		}

	}

	public static ArrayList<String> coleccionaNumerosLista(ArrayList<String> cadenas) {

		ArrayList<String> nuevoArray = new ArrayList<String>();
		for (int i = 0; i < cadenas.size(); i++) {
			/* Si la cadena contiene un numero, devuelve true */
			if (cadenas.get(i).matches(".*\\d.*")) {
				nuevoArray.add(cadenas.get(i));
			}
		}
		return nuevoArray;
	}

	public static String[] coleccionaNumeros(String[] array) {
		int contador = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i].matches(".*\\d.*")) {
				contador++;
			}
		}

		String[] nuevoArray = new String[contador];
		contador = 0;
		for (int i = 0; i < array.length; i++) {
			/* Si la cadena contiene un numero, devuelve true */
			if (array[i].matches(".*\\d.*")) {
				nuevoArray[contador] = array[i];
				contador++;
			}
		}
		return nuevoArray;
	}

}
