import java.util.Scanner;

public class ExercicioNelioAlves2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Informe o primeiro numero: ");
		int x = in.nextInt();
		System.out.println("Informe o segundo numero: ");
		int y = in.nextInt();
		
		int soma = x + y;
		System.out.println("A soma dos valores é: " + soma);
		
		in.close();
		
	}

}
