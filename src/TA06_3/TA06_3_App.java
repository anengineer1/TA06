import java.util.Scanner;

public class TA06_3_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduzca un número para saber si es primo o no: ");
		Scanner sc = new Scanner(System.in);
		System.out.println(esPrimo(sc.nextInt()));
	}

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
