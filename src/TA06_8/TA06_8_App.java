import java.util.Scanner;

public class TA06_8_App {

	public static void main(String[] args) {
		int[] int_array = rellenarValoresArray();
		printIntArrayof10(int_array);
	}

	public static int[] rellenarValoresArray() {

		System.out.println("Introduzca 10 valores (Presione 'Enter' para introducir el siguiente entero)");
		Scanner sc = new Scanner(System.in);
		int[] list_of_ints = new int[10];
		for (int i = 0; i < list_of_ints.length; i++) {
			System.out.print("Introduzca el valor correspondendiente a la posición " + (i + 1) + ":");
			list_of_ints[i] = sc.nextInt();
		}
		return list_of_ints;
	}

	public static void printIntArrayof10(int[] int_array) {
		for (int i = 0; i < int_array.length; i++) {
			System.out.println("El índice " + (i + 1) + " corresponde a al valor: " + int_array[i]);
		}
	}
}
