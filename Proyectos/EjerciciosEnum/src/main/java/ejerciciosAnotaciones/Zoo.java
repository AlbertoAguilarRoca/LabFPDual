package ejerciciosAnotaciones;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter(value = AccessLevel.PUBLIC)
public class Zoo {

	@Risk(riesgo = "Muy Alto") private Leones lions;
	@Risk(riesgo = "Muy Bajo") private Pinguinos penguins;
	@Risk(riesgo = "Alto") private Canguro kangaroo;
	@Risk(riesgo = "Medio") private OsoPanda panda;
	
	public Zoo(Leones lions, Pinguinos penguins, Canguro kangaroo, OsoPanda panda) {
		this.lions = lions;
		this.penguins = penguins;
		this.kangaroo = kangaroo;
		this.panda = panda;
	}
	
	@Override
	public String toString() {
		return lions+"\n"+penguins+"\n"+kangaroo+"\n"+panda;
	}
	
}
