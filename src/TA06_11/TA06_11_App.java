import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class TA06_11_App {

	public static void main(String[] args) {

		System.out.println("Introduzca la dimensión de los Arrays:");
		Scanner sc = new Scanner(System.in);
		int cantidad_de_numeros_a_generar = sc.nextInt();


		if (cantidad_de_numeros_a_generar <= 0) {
			System.out.println("No hay nada a generar:");
		} else {
			int[] array1 = new int[cantidad_de_numeros_a_generar];
			int[] array2 = array1;
			
			// array1 y array2 son iguales porque uno apunta al otro
			System.out.println("Array2 apunta al array 1 por lo que siempre darán lo mismo a pesar de");
			System.out.println("que el cambio de valor se realice mediante 1 de las dos variables:");
			array1 = fillArrayConAleatorios(array1);
			System.out.println("Array1:");
			printIntArray(array1);
			System.out.println("Array2:");
			printIntArray(array2);
			// array1 y array2 siguen con el mismo contenido porque apuntan a lo mismo
			// a menos que usemos el método clone
			int[] array22 = new int[array1.length];
			array22 = array1.clone();
			array22 = fillArrayConAleatorios(array22);
			System.out.println("Se ha creado el array22 que contendrá otros valores aleatorios.");
			System.out.println("Que no interferirá con el array1");
			int[] array3 = multiplyArraysComponents(array1, array22);
			System.out.println("Array22:");
			printIntArray(array22);
			System.out.println("Array3(multiplicado array1[i] * array22[i]):");
			printIntArray(array3);
		}
	}

	public static int[] fillArrayConAleatorios(int[] array_a_llenar) {
		for (int i = 0; i < array_a_llenar.length; i++) {
			array_a_llenar[i] = getNumeroAleatorio(100, 0);
		}
		return array_a_llenar;
	}

	public static void printIntArray(int[] array_de_ints) {
		for (int i = 0; i < array_de_ints.length; i++) {
			System.out.println("El valor en la posición " + i + " es: " + array_de_ints[i]);
		}
	}

	public static int getNumeroAleatorio(int limite_superior, int limite_inferior) {
		Random rnd_generator = new Random();
		return (rnd_generator.nextInt(limite_superior - limite_inferior + 1) + limite_inferior);
	}

	public static int[] multiplyArraysComponents(int[] array1, int[] array2) {
		int[] array3 = new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			array3[i] = array1[i] * array2[i];
		}
		return array3;
	}
}
