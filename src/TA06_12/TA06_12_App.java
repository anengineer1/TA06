import java.util.Scanner;
import java.util.Random;

public class TA06_12_App {

	public static void main(String[] args) {

		// Escribir mensaje
		System.out.println("Introduzca el tamaño del array que desee:");
		Scanner sc = new Scanner(System.in);
		int tamano_array = sc.nextInt();

		int[] array = generateArrayRandomNumbers(tamano_array);

		if (array[0] == -1) {
			System.out.println("tamaño incorrecto, introduzca una valor mayor que 0");
		} else {
			System.out.println(
					"Introduzca el digito final, se le devolverá los elementos de la lista cuyo digito coincida:");
			int ultimo_digito = sc.nextInt();
			if ((ultimo_digito > 9) || (ultimo_digito < 0)) {
				System.out.println("dígito incorrecto, ha de introducir un valor comprendido entre 0 y 9 incluídos");
			} else {
				int[] lista_filtrada = getFilteredArrayRandomNumbers(array, ultimo_digito);
				printIntArray(lista_filtrada);
			}
		}
	}

	public static int[] generateArrayRandomNumbers(int tamano_array) {

		if (tamano_array <= 0) {
			return new int[] { -1 };
		}

		int[] list_of_random_numbers = new int[tamano_array];
		Random rnd_generator = new Random();

		for (int i = 0; i < tamano_array; i++) {
			list_of_random_numbers[i] = rnd_generator.nextInt(300) + 1;
		}
		return list_of_random_numbers;
	}

	public static int[] getFilteredArrayRandomNumbers(int[] array_random_numbers, int ultimo_digito) {
		int numero_de_veces_con_mismo_digito = getVecesConMismoDigito(array_random_numbers, ultimo_digito);
		int[] array_filtrada = new int[numero_de_veces_con_mismo_digito];

		int indice_array_filtrada = 0;
		for (int i = 0; i < array_random_numbers.length; i++) {
			if (coincideTerminacionConEntero(array_random_numbers[i], ultimo_digito)) {
				array_filtrada[indice_array_filtrada] = array_random_numbers[i];
				indice_array_filtrada++;
			}
		}
		return array_filtrada;
	}

	public static int getVecesConMismoDigito(int[] array_random_numbers, int ultimo_digito) {
		int numero_de_veces_repetido = 0;
		for (int i = 0; i < array_random_numbers.length; i++) {
			if (coincideTerminacionConEntero(array_random_numbers[i], ultimo_digito)) {
				numero_de_veces_repetido++;
			}
		}
		return numero_de_veces_repetido;
	}

	public static boolean coincideTerminacionConEntero(int entero, int terminacion) {
		return ((entero % 10) == terminacion);
	}

	public static void printIntArray(int[] array_de_ints) {
		for (int i = 0; i < array_de_ints.length; i++) {
			System.out.println("El valor en la posición " + i + " es: " + array_de_ints[i]);
		}
	}

}
