
public class ExTres {

	static int contador = 0;
	
	public ExTres() {
		contador++;
	}
	
	public String muestraContador() {
		return "La clase ha sido instanciada "+contador+" veces.";
	}
	
}
