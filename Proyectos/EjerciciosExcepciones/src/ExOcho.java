import java.util.Scanner;

/*Ejercicio 8 y 9*/
public class ExOcho {

	public static void main(String[] args) {

		int[] numeros = { 1, 2, 3, 4, 5 };
		
		imprimeArray(numeros);

	}

	public static void imprimeArray(int[] array) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el indice del array que quiere consultar:");
		int consulta = sc.nextInt();
		
		try {
			System.out.println(array[consulta]);

		} catch (ArrayIndexOutOfBoundsException arr) {
			System.out.println("Estas solicitando un índice del array que no existe.");
			System.out.println("El índice seleccionado debe ser "+(array.length-1)+" o menor.");
			System.out.println("¿Qué índice desea encontrar?");
			consulta = sc.nextInt();
			while(consulta > array.length-1) {
				System.out.println("Número erroneo, vuelve a introducirlo:");
				consulta = sc.nextInt();
			}
		} finally {
			System.out.println("El índice que buscas es -> "+array[consulta]);
		}
	}

}
