
public class ExCuatro {
	
	/*Ejercicio 4*/
	public static void sacaNumeros(String cadena) {
		String numeros="";
		for(int i = 0; i < cadena.length(); i++) {
			if(cadena.charAt(i) >= 48 && cadena.charAt(i) <= 57) {
				numeros += cadena.charAt(i);
			}
		}
		
		System.out.println("Los números de la cadena son: "+numeros);
	}

}
