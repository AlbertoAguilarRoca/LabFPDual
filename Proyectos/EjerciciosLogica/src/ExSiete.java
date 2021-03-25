
public class ExSiete {
	
	public static void cuentaVocales(String cadena) {
		int contador=0;
		cadena = cadena.toLowerCase();
		for(int i = 0; i < cadena.length(); i++) {
			if(cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' ||
			cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' ||
			cadena.charAt(i) == 'u') {
				contador++;
			}
		}
		System.out.println("Tiene "+contador+" vocales.");
	}
	
}
