import java.util.Scanner;

public class ExercicioNelioAlves4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int a, b, c, d, diferenca;
		
		System.out.println("Informe o primeiro numero: ");
		a = in.nextInt();
		System.out.println("Informe o segundo numero: ");
		b = in.nextInt();
		System.out.println("Informe o terceiro numero: ");
		c = in.nextInt();
		System.out.println("Informe o quarto numero: ");
		d = in.nextInt();
		diferenca = (a * b - c * d);
		System.out.println("Diferença = " + diferenca);
		
		in.close();
		

	}

}
