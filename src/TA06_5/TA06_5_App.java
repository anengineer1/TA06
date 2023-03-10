import java.util.Scanner;

public class TA06_5_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Introduzca un entero para convertir a binario: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("El número en binario es:" + deDecimalABinario(sc.nextInt()));
		sc.close();
	}

	public static String deDecimalABinario(int num_decimal) {

		if (num_decimal == 0) {
			return "0";
		}

		String num_binario = "";

		while (num_decimal > 0) {

			int resto = num_decimal % 2;
			num_decimal /= 2;
			num_binario = resto + num_binario;
		}
		return num_binario;
	}
}
