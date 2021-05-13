import java.util.ArrayList;

/*
 * La clase abstracta debe tener como atributo
 * el objeto "producto".
 * En los métodos concretos se encuentra el metodo
 * getGarden, para obtener el jardin una vez ha sido creado y otro 
 * metodo para instanciar dicho objeto.
 * 
 * Los métodos abstactos deberán sobreescribirse al heredar los hijos del builder,
 * pudiendo asignar los datos concretos a cada tipo de jardin.
 * */
public abstract class GardenBuilder {

	protected Garden jardin;
	
	public Garden getGarden() {
		return jardin;
	}
	
	public void buildGarden() {
		jardin = new Garden();
	}
	
	public abstract void plantarArboles(ArrayList<String> arboles);
	public abstract void plantarFlores(ArrayList<String> flores);
	public abstract void echarAbono();
	public abstract void instalarFuente(boolean tieneFuente);
	
}
