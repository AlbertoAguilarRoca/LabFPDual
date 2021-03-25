
public class Orden {

	/*Atributos*/
	private String id;
	private Empleado responsable;
	private Cliente cliente;
	private String fechaFin;
	private int estadoProyecto;
	private String area;
	
	/*Constructor*/
	public Orden(String id, Empleado responsable, Cliente nombreCliente, String fechaFin, int estadoProyecto, String area) {
		this.id=id;
		this.responsable= responsable;
		this.cliente=nombreCliente;
		this.fechaFin=fechaFin;
		this.estadoProyecto=estadoProyecto;
		this.area=area;
	}
	
	/*Métodos*/
	
	public Empleado getResponsable() {
		return responsable;
	}
	
	public void setResponsable(Empleado responsable) {
		this.responsable=responsable;
	}
	
	public void ampliarFechaFin(String nuevaFecha) {
		this.fechaFin=nuevaFecha;
	}
	
	public void updateProyecto(int porcentaje) {
		this.estadoProyecto=porcentaje;
		traduceEstado(porcentaje);
	}
	
	public static void traduceEstado(int porcentaje) {
		if(porcentaje <= 20) {
			System.out.println("\nLa orden está en fase de análisis.");
		} else if (porcentaje <= 40) {
			System.out.println("\nLa orden está en fase de desarrollo.");
		} else if (porcentaje <= 60) {
			System.out.println("\nLa orden está en fase de testing.");
		} else if (porcentaje <= 80) {
			System.out.println("\nLa orden está en fase de depuración.");
		}  else if (porcentaje <= 95) {
			System.out.println("\nLa orden está en fase de entrega.");
		}  else if (porcentaje <= 100) {
			System.out.println("\nLa orden está en fase de mantenimiento.");
		}
	}

	@Override
	public String toString() {
		return "Orden " + id + ": responsable " + responsable.getNombre() + ", Cliente " + cliente.getNombreCliente() + ", Finalización el "
				+ fechaFin + ", estado del proyecto " + estadoProyecto + "%, area: " + area + ".";
	}
	
	
	
}
