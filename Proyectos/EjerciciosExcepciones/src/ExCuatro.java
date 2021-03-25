
public class ExCuatro {
	
	public static void main(String[] args) {
		
		String cadena = null;
		
		try {
			System.out.println(cadena.charAt(0));
		} catch(NullPointerException ex) { 
			System.out.println("Imposible invocar a la cadena porque es Null.");
		}finally {
			System.out.println("Soy el finally.");
		}
		
	}//end main
	
}
