import java.util.Random;
import java.util.Scanner;

public class TA06_2_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduzca la cantidad de números aleatorios a generar:");
		Scanner sc = new Scanner(System.in);
		int numeros_a_generar = sc.nextInt();
		
		System.out.println("Límite superior:");
		int limite_superior = sc.nextInt();
		
		System.out.println("Límite inferior:");
		int limite_inferior = sc.nextInt();
		
		for (int i = 0; i < numeros_a_generar; i++) {
			System.out.println((i + 1) + " : " + getNumeroAleatorio(limite_superior, limite_inferior));
		}

	}
	public static int getNumeroAleatorio(int limite_superior, int limite_inferior) {
		Random rnd_generator = new Random();
		return (rnd_generator.nextInt(limite_superior - limite_inferior + 1) + limite_inferior);
	}
}
