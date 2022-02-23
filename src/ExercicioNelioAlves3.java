import java.util.Locale;
import java.util.Scanner;

public class ExercicioNelioAlves3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner (System.in);
		
		double raio, area;
		
		System.out.println("Informe o valor do raio do circulo: ");
		raio = in.nextDouble();
		area = Math.PI * (2 * raio);
		System.out.printf("Valor da area do circulo: %.4f%n", area);
		
		in.close();

	}

}
