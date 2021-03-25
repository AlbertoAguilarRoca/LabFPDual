
public class ExSiete {

	public static void main(String[] args) {
		
		String[] cadenas = {"Pepe", "Paco", null};
		
		try {
			System.out.println(cadenas[2].charAt(10));
		} catch(ArrayIndexOutOfBoundsException |
				StringIndexOutOfBoundsException | 
				NullPointerException ex) {
			System.out.println("Múltiples errores.");
		}
		
	}
	
}
