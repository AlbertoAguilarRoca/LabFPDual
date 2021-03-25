
public class ExDos {
	
	/*Ejercicio 2*/
	public static void publicaParametro(String parametro) {
		/*Por defecto, confiamos en que no haya números*/
		boolean encuentraNumero = false;
		/*recorremos la cadena para confirmar que no haya números*/
		for (int i = 0; i < parametro.length(); i++) {
			if(parametro.charAt(i) >= 48 && parametro.charAt(i) <= 57) {
				/*En caso de que un carácter sea un numero
				 * cambiamos la variable booleana a true*/
				encuentraNumero = true;
			}
		}//end for
		
		/*imprimimos algo en base a si existe la presencia de un número 
		 * en el parametro o no*/
		if(!encuentraNumero) {
			System.out.println("Hola "+parametro+".");
		} else {
			System.out.println("El parametro no puede contener números.");
		}
	}//end ejercicio 2

}
