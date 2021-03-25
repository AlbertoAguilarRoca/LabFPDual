
public class ExUno {

	public static void main(String[] args) throws Exception {


		try {	
			System.out.println("Intentando imprimir.");
			throw new Exception("Lanzando un error");
			
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			System.out.println("\nYo me imprimo siempre!");
		}

	}

}
