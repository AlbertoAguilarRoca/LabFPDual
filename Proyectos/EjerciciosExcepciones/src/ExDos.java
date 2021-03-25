
public class ExDos extends Exception {
	
	public ExDos(String mensaje) {
		super(mensaje);
	}
	
	public static void imprimir(ExDos mensaje) {
		System.out.println(mensaje);
	}
	
}
