
public class ExCinco extends Exception{

	public ExCinco(String mensaje) {
		super(mensaje);
	}
	
	public ExCinco(String mensaje, Throwable causa) {
		super(mensaje, causa);
	}
	
	public static void g() throws ExCinco {
		throw new ExCinco("G lanzando una excepción");
	}
	
	public static void f() throws ExCinco{
		
		try {
			g();
			/*cambiamos Exception por RuntimeException para el Ex 6.*/
		} catch(RuntimeException ex) {
			System.out.println(ex.getMessage());
			throw new ExCinco("F lanzando una excepción.", ex);		
		} finally {
			System.out.println("Imprimiendo el finally.");
		}
	}

}
