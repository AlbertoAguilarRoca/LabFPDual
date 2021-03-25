
public class ExCatorce {

	public static boolean esPalindromo(String cadena) {
		String cadena1 = "";
		String cadena2 = "";
		/*Leemos la cadena y quitamos los espacios*/
		for(int i = 0; i < cadena.length(); i++) {
			if(cadena.charAt(i) != ' ') {
				cadena1 += cadena.charAt(i);
			}
		}
		
		/*Hacemos otro bucle para leer la cadena sin espacios, pero
		 * esta vez al revés*/
		for(int k = cadena.length() -1; k >= 0; k--) {
			if(cadena.charAt(k) != ' ') {
				cadena2 += cadena.charAt(k);
			}
		}
		
		/*pasamos las cadenas a minusculas*/
		cadena1 = cadena1.toLowerCase();
		cadena2 = cadena2.toLowerCase();
		
		/*comparamos las cadenas*/
		
		if(cadena1.equals(cadena2)) return true;
		else return false;
		
	}
	
}
