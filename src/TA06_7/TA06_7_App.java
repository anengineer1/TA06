import java.util.Scanner;

public class TA06_7_App {

	public static void main(String[] args) {
		
		System.out.println("A qué moneda desea convertir el Euro?");
		System.out.println("$");
		System.out.println("Libras");
		System.out.println("Yenes");
		
		Scanner sc = new Scanner(System.in);
		String tipo_moneda = sc.next();
		System.out.print("Indicar cantidad: ");
		double valor_moneda = sc.nextDouble();
		sc.close();
		
		muestraConversionMoneda(valor_moneda, tipo_moneda);
	}

	public static void muestraConversionMoneda(double valor_moneda, String tipo_moneda) {
		switch (tipo_moneda) {
		case "$":
			System.out.println(valor_moneda + " Euros equivalen a " + (valor_moneda * 1.28611) + " " + tipo_moneda);
			break;

		case "libras":
			System.out.println(valor_moneda + " Euros equivalen a " + (valor_moneda * 1.28611) + " " + tipo_moneda);
			break;

		case "yenes":
			System.out.println(valor_moneda + " Euros equivalen a " + (valor_moneda * 1.28611) + " " + tipo_moneda);
			break;

		default:
			System.out.println("La moneda introducida no es válida");
			break;
		}
	}
}
