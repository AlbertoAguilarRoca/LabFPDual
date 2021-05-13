import java.util.ArrayList;

/*
 * Clase Director encargada de gestionar la creación de productos, en nuestro caso,
 * de jardines.
 * */
public class Designer {

	/*
	 * GardenBuilder es una clase abstracta, por lo tanto no se puede instanciar. De esta
	 * forma obligamos que el programa tenga que recibir una de sus clases hijas, las cuales
	 * tienen predefinido una informacion.
	 * */
	private GardenBuilder constructorJardines;
	
	public void setGardenBuilder(GardenBuilder cj) {
		this.constructorJardines = cj;
	}
	
	public Garden getGarden() {
		return constructorJardines.getGarden();
	}
	
	public void construirJardin(ArrayList<String> arboles, ArrayList<String> flores, boolean tieneFuente) {
		constructorJardines.buildGarden();
		System.out.println("Los jardineros han llegado:\nPlantado árboles ...\n");
		
		constructorJardines.plantarArboles(arboles);
		arboles.forEach(tree -> System.out.println("- "+tree));
		
		System.out.println("Plantando flores...\n");
		constructorJardines.plantarFlores(flores);
		flores.forEach(flower -> System.out.println("- "+flower));
		System.out.println();
		
		constructorJardines.echarAbono();
		
		if(tieneFuente) {
			constructorJardines.instalarFuente(tieneFuente);
			System.out.println("\nFuente instalada.");
		} else {
			System.out.println("El cliente no desea fuente.");
		}
	}
}
