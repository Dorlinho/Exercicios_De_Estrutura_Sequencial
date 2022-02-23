import java.util.Locale;
import java.util.Scanner;

public class ExercicioNelioAlves {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner (System.in);
		
		double larg, comp, area, preco;
		
		System.out.println("Informe a largura do terreno: ");
		larg = in.nextDouble();
		System.out.println("Informe o comprimento do terreno: ");
		comp = in.nextDouble();
		System.out.println("Informe o valor do terreno por metro quadrado: ");
		preco = in.nextDouble();
		System.out.println("Largura do terreno: " + larg);
		System.out.println("Comprimento do terreno: " + comp);
		System.out.printf("Preço por metro quadrado: %.2f%n", preco);
		area = larg * comp;
		System.out.printf("A Area do terreno é de: %.2f%n", area);
		preco = preco * area;
		System.out.printf("O valor total do terreno ficará de: %.2f", preco);
		
		
		
		in.close();
	}

}
