import java.util.Random;
import java.util.Scanner;

public class TA06_9_App {

	public static void main(String[] args) {
		final int limite_superior = 9;
		final int limite_inferior = 0;
		int[] array_de_ints = getArrayDeInts(limite_superior, limite_inferior);
		printArrayDeIntsYSuma(array_de_ints);
	}

	public static int[] getArrayDeInts(int limite_superior, int limite_inferior) {

		// create the object
		Random rnd_generator = new Random();
		System.out.print("Introduzca el tamaño del array: ");
		Scanner sc = new Scanner(System.in);
		int[] list_of_ints = new int[sc.nextInt()];
		sc.close();
		for (int i = 0; i < list_of_ints.length; i++) {
			list_of_ints[i] = rnd_generator.nextInt(limite_superior - limite_inferior + 1) + limite_inferior;
		}
		return list_of_ints;
	}

	public static void printArrayDeIntsYSuma(int[] array_de_ints) {

		int sumatorio = 0;
		for (int i = 0; i < array_de_ints.length; i++) {
			System.out.println("El índice " + (i + 1) + " corresponde a al valor: " + array_de_ints[i]);
			sumatorio += array_de_ints[i];
		}
		System.out.println("La de todo los componentes del array da: " + sumatorio);
	}
}
