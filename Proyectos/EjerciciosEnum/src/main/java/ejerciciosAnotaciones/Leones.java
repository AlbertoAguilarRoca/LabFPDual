package ejerciciosAnotaciones;

import lombok.AccessLevel;
import lombok.Getter;

@Getter(value = AccessLevel.PUBLIC)
@AnimalMetada(fechaIngreso = "15/06/2016", procedencia = "Sabana Africana")
public class Leones extends Animal {

	public Leones(String name, String dietType, String animalType) {
		super(name, dietType, animalType);
	}

	@Override
	public String toString() {
		return name+" "+dietType+" "+animalType;
	}
		

}
