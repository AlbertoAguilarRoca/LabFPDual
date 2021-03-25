import java.util.Scanner;

public class Impresora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Qué palabra quieres imprimir?\n");
		String palabra = sc.nextLine();
		System.out.println("\n¿Cuántas veces?\n");
		int impresiones = sc.nextInt();

		imprimePalabras(palabra, impresiones);

	}
	
	public static void imprimePalabras(String palabra, int n) {
		int contador = 1;		
		while (contador <= n) {
			System.out.println(contador+". "+palabra);
			contador++;
		}		
	}

}
