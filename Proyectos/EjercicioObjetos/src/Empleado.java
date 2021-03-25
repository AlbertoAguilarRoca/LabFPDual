
public class Empleado {

	/*Atributos*/
	
	private String nombre;
	private double salario;
	private String fechaAlta;
	
	/*constructor*/
	
	public Empleado(String nombre, double salario, String fechaAlta) {
		this.nombre=nombre;
		this.salario=salario;
		this.fechaAlta = fechaAlta;
	}
	
	/*metodos*/

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentaSalario(double aumento) {
		this.salario = salario + aumento;
	}

	public String getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	@Override
	public String toString() {
		return nombre + ", " + salario + "€, " + fechaAlta + ".";
	}
	
		
}
