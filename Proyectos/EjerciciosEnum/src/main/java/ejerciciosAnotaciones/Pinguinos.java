package ejerciciosAnotaciones;

import lombok.Getter;


@Getter
@AnimalMetada(fechaIngreso = "25/11/2016", procedencia = "Groenlandia")
public class Pinguinos extends Animal{

	public Pinguinos(String name, String dietType, String animalType) {
		super(name, dietType, animalType);
	}
	
	@Override
	public String toString() {
		return name+" "+dietType+" "+animalType;
	}
	
}
