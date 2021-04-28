package ejerciciosAnotaciones;

import lombok.Getter;

@Getter
@AnimalMetada(fechaIngreso = "18/02/2016", procedencia = "Japan")
public class OsoPanda extends Animal{
	public OsoPanda(String name, String dietType, String animalType) {
		super(name, dietType, animalType);
	}
	
	@Override
	public String toString() {
		return name+" "+dietType+" "+animalType;
	}
}
