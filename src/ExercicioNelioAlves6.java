import java.util.Scanner;

public class ExercicioNelioAlves6 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int cod1, peca1, cod2, peca2;
		double valor1, valor2, total;
		
		System.out.println("Informe o código da primeira peça: ");
		cod1 = in.nextInt();
		System.out.println("Informe quantas peças deseja: ");
		peca1 = in.nextInt();
		System.out.println("Informe o valor da peça desejada: ");
		valor1 = in.nextDouble();
		System.out.println("Informe o código da segunda peça: ");
		cod2 = in.nextInt();
		System.out.println("Informe quantas peças deseja: ");
		peca2 = in.nextInt();
		System.out.println("Informe o valor da peça desejada: ");
		valor2 = in.nextDouble();
		total = peca1 * valor1 + peca2 * valor2;
		System.out.printf("VALOR TOTAL A PAGAR: %.2f", total);
		
		
		in.close();
	}

}
