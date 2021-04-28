package ejerciciosAnotaciones;

@AnimalMetada(fechaIngreso = "06/05/2017", procedencia = "Australia")
public class Canguro extends Animal{

	public Canguro(String name, String dietType, String animalType) {
		super(name, dietType, animalType);
	}
	
	@Override
	public String toString() {
		return name+" "+dietType+" "+animalType;
	}
	
}
