import java.util.Scanner;

public class TA06_6_App {

	public static void main(String[] args) {

		
		// Output
		System.out.print("Introduce un entero positivo para saber cuántas cifras tiene: ");
		Scanner sc = new Scanner(System.in);
		
		int entero = sc.nextInt();
		if (entero < 0) {
			System.out.println("El número introducido no es positivo");
		} else {
			System.out.println("El número " + entero + " Tiene " + devuelveNumeroDeCifras(entero) + " cifras");
		}
		
	}
	public static int devuelveNumeroDeCifras(int entero_positivo) {
		String entero_a_string = String.valueOf(entero_positivo);
		return entero_a_string.length();
	}
}
