import java.util.Random;
import java.util.Scanner;

public class TA06_10_App {

	public static void main(String[] args) {

		System.out.println("Introduzca el tamaño del array (tamaño de la serie):");
		Scanner sc = new Scanner(System.in);
		int tamano_array = sc.nextInt();
		System.out.println("Ahora introduzca el límite superior de la serie a generar:");
		int limite_superior = sc.nextInt();
		System.out.println("Ahora introduzca el límite inferior de la serie a generar:");
		int limite_inferior = sc.nextInt();
		
		// Conseguir el array de ints
		int[] array_de_primos = getSeriesDeNumerosPrimosAleatorios(tamano_array, limite_inferior, limite_superior);
		printArrayDeInts(array_de_primos);
		printValorMaximoArrayDeInts(array_de_primos);
	}
	
	public static void printValorMaximoArrayDeInts(int[] array_de_ints) {
		int valor_max = array_de_ints[0];
		
		// El primer valor ya lo hemos leído, por eso empezamos en la siguiente posición
		for (int i = 1; i < array_de_ints.length; i++) {
			if (valor_max < array_de_ints[i]) {
				valor_max = array_de_ints[i];
			}
		}
		System.out.println("El valor máximo es: " + valor_max);
	}

	public static int[] getSeriesDeNumerosPrimosAleatorios(int tamano_array, int limite_inferior, int limite_superior) {
		Random rnd_generator = new Random();
		int[] list_of_ints = new int[tamano_array];
		for (int i = 0; i < tamano_array; i++) {
			list_of_ints[i] = rnd_generator.nextInt(limite_superior - limite_inferior + 1) + limite_inferior;
			while (!esPrimo(list_of_ints[i])) {
				list_of_ints[i] = rnd_generator.nextInt(limite_superior - limite_inferior + 1) + limite_inferior;
			}
		}
		return list_of_ints;
	}
	
	public static void printArrayDeInts(int[] list_of_ints) {
		for (int i = 0; i < list_of_ints.length; i++) {
			System.out.println("El valor correspondiente a la posición " + (i + 1) + " Es: " + list_of_ints[i]);
		}
	}

	// Nota para el corrector: prefiero esperar a la sesión
	// en donde empezaremos a hacer imports y packages para acabar de asentar
	// conceptos.
	// De momento copiaré y pegaré una función de otro ejercicio
	public static boolean esPrimo(int entero) {

		// Aseguramos que el número es mayor o igual que uno
		if (entero <= 1) {
			return false;

		} else if ((entero == 2) || (entero == 3)) {
			return true;
		} else {
			for (int i = 2; i < entero; i++) {
				if (entero % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
}
