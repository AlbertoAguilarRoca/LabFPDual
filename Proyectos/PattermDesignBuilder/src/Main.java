import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		/*El Diseñador de Jardines recibe un nuevo encargo*/
		Designer encargo = new Designer();
		
		/*El cliente le dice al diseñador el estilo que quiere,
		 * así como el contenido que desea*/
		
		GardenBuilder jardinMediterraneo = new MediterraneanGarden();
		encargo.setGardenBuilder(jardinMediterraneo);
		
		/*contenido del jardin*/
		ArrayList<String> arboles = new ArrayList<>();
		arboles.add("Olivo"); arboles.add("Poligala"); arboles.add("Ciprés");
		ArrayList<String> flores = new ArrayList<>();
		flores.add("Geranios"); flores.add("Hortensias"); flores.add("Buganvilla"); flores.add("Madresekva");
		boolean quiereFuente = true;
		
		/*Construimos el jardin bajo demanda del cliente*/
		encargo.construirJardin(arboles, flores, quiereFuente);
		
		
		
	}

}
