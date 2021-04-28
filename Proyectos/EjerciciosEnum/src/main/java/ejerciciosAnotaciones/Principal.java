package ejerciciosAnotaciones;



public class Principal {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException {

		Zoo selvoaventura = new Zoo(
				new Leones("Lyon", "Carnívoro", "Mamífero"), 
				new Pinguinos("Common Penguin", "Carnívoro", "Mamífero"), 
				new Canguro("Australian Kangaroo", "Hervivoro", "Mamífero"), 
				new OsoPanda("Panda", "Hervivoro", "Mamífero")
			);
		
		AnimalMetada datos = selvoaventura.getKangaroo().getClass().getAnnotation(AnimalMetada.class);
		
		System.out.println(datos);
		
		System.out.println("\n ----------- \n");
		
		String nombre = selvoaventura.getLions().name;
		Risk riesgo = Zoo.class.getDeclaredField("lions").getAnnotation(Risk.class);
		System.out.println("Nombre del animal: "+nombre+". Nivel de riesgo: "+riesgo.riesgo());
		
	}//end main

}
