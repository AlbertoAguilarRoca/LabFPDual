import java.util.ArrayList;

/*
 * Clase producto: es el tipo de objeto que va a ser
 * susceptible de ser construido
 * */
public class Garden {

	private ArrayList<String> arboles;
	private ArrayList<String> flores;
	private boolean tieneFuente;
	
	public Garden() {
		
	}

	public ArrayList<String> getArboles() {
		return arboles;
	}
	
	public void setArboles(ArrayList<String> arboles) {
		this.arboles = arboles;
	}

	public ArrayList<String> getFlores() {
		return flores;
	}

	public void setFlores(ArrayList<String> flores) {
		this.flores = flores;
	}

	public boolean isTieneFuente() {
		return tieneFuente;
	}

	public void setTieneFuente(boolean tieneFuente) {
		this.tieneFuente = tieneFuente;
	}

	@Override
	public String toString() {
		return "Garden [arboles=" + arboles + "\n, flores=" + flores + "\n, tieneFuente=" + tieneFuente + "]";
	}
	
	
		
}
