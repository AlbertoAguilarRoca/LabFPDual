import java.util.Scanner;

public class html {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Contenido:\n");
		String contenido = sc.nextLine();
		System.out.println("\nEtiqueta:\n");
		String etiqueta = sc.nextLine();

		System.out.println("<"+etiqueta+">"+contenido+"</"+etiqueta+">");
		
	}

}
