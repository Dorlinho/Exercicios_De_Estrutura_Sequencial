import java.util.Scanner;

public class ExercicioNelioAlves6 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int cod1, peca1, cod2, peca2;
		double valor1, valor2, total;
		
		System.out.println("Informe o c�digo da primeira pe�a: ");
		cod1 = in.nextInt();
		System.out.println("Informe quantas pe�as deseja: ");
		peca1 = in.nextInt();
		System.out.println("Informe o valor da pe�a desejada: ");
		valor1 = in.nextDouble();
		System.out.println("Informe o c�digo da segunda pe�a: ");
		cod2 = in.nextInt();
		System.out.println("Informe quantas pe�as deseja: ");
		peca2 = in.nextInt();
		System.out.println("Informe o valor da pe�a desejada: ");
		valor2 = in.nextDouble();
		total = peca1 * valor1 + peca2 * valor2;
		System.out.printf("VALOR TOTAL A PAGAR: %.2f", total);
		
		
		in.close();
	}

}
