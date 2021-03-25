
public class Programador extends Empleado {
	
	/*Atributos*/
	
	private int lineasDeCodigoPorHora = 0;
	private String lenguajeDominante = "Java";
	
	/*constructor*/
	
	public Programador() {
		
	}
	
	public Programador(String nombre, String cedula, int edad, boolean casado, double salario, int lineasDeCodigoPorHora , String lenguajeDominante) {
		super(nombre, cedula, edad, casado, salario);
		this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
		this.lenguajeDominante = lenguajeDominante;
	}
	
}
