import java.util.Scanner;

public class TA06_4_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Introduzca un entero para calcular factorial: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("El resultado es: " + devuelveFactorial(n));
	}

	public static int devuelveFactorial(int n) {
		int resultado = 1;	
		for (int i = 1; i <= n; i++) {
				resultado *= i;
			}
			return resultado;
		}
}
