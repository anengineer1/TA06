import java.util.Scanner;

public class TA06_1_App {

	public static void main(String[] args) {
		// Bloque output
		System.out.println("¿Qué área de qué geometría desea calcular?");
		System.out.println("1 ) Círculo?");
		System.out.println("2 ) Triángulo");
		System.out.println("3 ) Cuadrado");
		System.out.println("");
		System.out.print("Seleccione del 1-3: ");
	

		// Bloque input
		Scanner sc = new Scanner(System.in);
		String geometria_seleccionada = sc.nextLine();
		
		switch (geometria_seleccionada) {
		case "1":
			System.out.print("Introduzca valor del radio: ");
			mostrarAreaCirculo(Double.parseDouble(sc.nextLine()));
			break;
			
		case "2":
			System.out.print("Introduzca valor de la base: ");
			double base = Double.parseDouble(sc.nextLine());
			
			System.out.print("Introduzca valor de la altura: ");
			double altura = Double.parseDouble(sc.nextLine());
			
			mostrarAreaTriangulo(base, altura);
			break;
			
		case "3":
			System.out.print("Introduzca valor del costado: ");
			mostrarAreaCuadrado(Double.parseDouble(sc.nextLine()));
			break;

		default:
			System.out.println("Opción no introducida correctamente");
			break;
		}
		sc.close();
	}

	public static void mostrarAreaCirculo(double radious) {
		System.out.println("El área del circulo es:" + (Math.PI * Math.pow(radious, 2)));
	}

	public static void mostrarAreaCuadrado(double costado) {
		System.out.println("El área del cuadrado es: " + (Math.pow(costado, 2)));
	}

	public static void mostrarAreaTriangulo(double base, double altura) {
		System.out.println("El área del cuadrado es: " + (base * altura / 2));
	}
}
